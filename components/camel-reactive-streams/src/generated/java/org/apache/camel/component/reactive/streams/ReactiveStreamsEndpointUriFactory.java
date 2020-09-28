/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.reactive.streams;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ReactiveStreamsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":stream";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(13);
        set.add("stream");
        set.add("bridgeErrorHandler");
        set.add("concurrentConsumers");
        set.add("exchangesRefillLowWatermark");
        set.add("forwardOnComplete");
        set.add("forwardOnError");
        set.add("maxInflightExchanges");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("backpressureStrategy");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "reactive-streams".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "stream", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

