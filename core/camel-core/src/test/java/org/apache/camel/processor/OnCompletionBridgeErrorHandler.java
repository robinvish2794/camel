/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.apache.camel.Component;
import org.apache.camel.Consumer;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.support.DefaultComponent;
import org.apache.camel.support.DefaultEndpoint;
import org.apache.camel.support.ScheduledPollConsumer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OnCompletionBridgeErrorHandler extends ContextTestSupport {

    protected final CountDownLatch latch = new CountDownLatch(1);

    @Test
    public void test() throws Exception {
        getMockEndpoint("mock:result").expectedMessageCount(0);
        getMockEndpoint("mock:dead").expectedMessageCount(1);
        latch.countDown();
        assertMockEndpointsSatisfied();
        Exception cause = getMockEndpoint("mock:dead").getReceivedExchanges().get(0).getProperty(Exchange.EXCEPTION_CAUGHT,
                Exception.class);
        assertNotNull(cause);
        assertEquals("Simulated", cause.getMessage());

    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                getContext().addComponent("my", new MyComponent());
                errorHandler(noErrorHandler());

                from("my:foo?bridgeErrorHandler=true")
                        .onCompletion()
                        .to("mock:dead")
                        .end()
                        .to("mock:result");
            }
        };
    }

    public static class MyComponent extends DefaultComponent {

        @Override
        protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
            return new MyEndpoint(uri, this);
        }
    }

    public static class MyEndpoint extends DefaultEndpoint {

        public MyEndpoint(String endpointUri, Component component) {
            super(endpointUri, component);
        }

        @Override
        public Producer createProducer() throws Exception {
            return null;
        }

        @Override
        public Consumer createConsumer(Processor processor) throws Exception {
            Consumer answer = new MyConsumer(this, processor);
            configureConsumer(answer);
            return answer;
        }

        @Override
        public boolean isSingleton() {
            return true;
        }
    }

    public static class MyConsumer extends ScheduledPollConsumer {

        public MyConsumer(Endpoint endpoint, Processor processor) {
            super(endpoint, processor);
        }

        @Override
        protected int poll() throws Exception {
            throw new IllegalArgumentException("Simulated");
        }
    }
}
