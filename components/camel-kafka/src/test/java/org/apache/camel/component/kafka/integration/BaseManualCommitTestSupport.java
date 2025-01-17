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

package org.apache.camel.component.kafka.integration;

import java.util.Collections;
import java.util.Properties;

import org.apache.camel.EndpointInject;
import org.apache.camel.component.kafka.KafkaConstants;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.jupiter.api.BeforeEach;

public class BaseManualCommitTestSupport extends BaseEmbeddedKafkaTestSupport {

    @EndpointInject("mock:result")
    protected MockEndpoint to;

    @EndpointInject("mock:resultBar")
    protected MockEndpoint toBar;

    protected org.apache.kafka.clients.producer.KafkaProducer<String, String> producer;

    @BeforeEach
    public void createClient() {
        Properties props = getDefaultProperties();
        producer = new org.apache.kafka.clients.producer.KafkaProducer<>(props);
    }

    public void cleanupKafka(String topic) {
        if (producer != null) {
            producer.close();
        }
        // clean all test topics
        kafkaAdminClient.deleteTopics(Collections.singletonList(topic));
    }

    public void kafkaManualCommitTest(String topic) throws Exception {
        to.expectedMessageCount(5);
        to.expectedBodiesReceivedInAnyOrder("message-0", "message-1", "message-2", "message-3", "message-4");
        // The LAST_RECORD_BEFORE_COMMIT header should include a value as we use
        // manual commit
        to.allMessages().header(KafkaConstants.LAST_RECORD_BEFORE_COMMIT).isNotNull();

        for (int k = 0; k < 5; k++) {
            String msg = "message-" + k;
            ProducerRecord<String, String> data = new ProducerRecord<>(topic, "1", msg);
            producer.send(data);
        }

        to.assertIsSatisfied(3000);

        to.reset();

        // Second step: We shut down our route, we expect nothing will be recovered by our route
        context.getRouteController().stopRoute("foo");
        to.expectedMessageCount(0);

        // Third step: While our route is stopped, we send 3 records more to Kafka test topic
        for (int k = 5; k < 8; k++) {
            String msg = "message-" + k;
            ProducerRecord<String, String> data = new ProducerRecord<>(topic, "1", msg);
            producer.send(data);
        }

        to.assertIsSatisfied(3000);

        to.reset();

        // Fourth step: We start again our route, since we have been committing the offsets from the first step,
        // we will expect to consume from the latest committed offset e.g from offset 5
        context.getRouteController().startRoute("foo");
        to.expectedMessageCount(3);
        to.expectedBodiesReceivedInAnyOrder("message-5", "message-6", "message-7");

        to.assertIsSatisfied(3000);
    }
}
