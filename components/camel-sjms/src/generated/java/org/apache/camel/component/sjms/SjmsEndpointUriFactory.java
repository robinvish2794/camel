/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SjmsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destinationType:destinationName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(40);
        set.add("destinationType");
        set.add("destinationName");
        set.add("acknowledgementMode");
        set.add("bridgeErrorHandler");
        set.add("consumerCount");
        set.add("durableSubscriptionId");
        set.add("reconnectBackOff");
        set.add("reconnectOnError");
        set.add("synchronous");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("messageSelector");
        set.add("lazyStartProducer");
        set.add("namedReplyTo");
        set.add("persistent");
        set.add("producerCount");
        set.add("ttl");
        set.add("allowNullBody");
        set.add("prefillPool");
        set.add("responseTimeOut");
        set.add("asyncStartListener");
        set.add("asyncStopListener");
        set.add("basicPropertyBinding");
        set.add("connectionCount");
        set.add("connectionFactory");
        set.add("connectionResource");
        set.add("destinationCreationStrategy");
        set.add("exceptionListener");
        set.add("headerFilterStrategy");
        set.add("includeAllJMSXProperties");
        set.add("jmsKeyFormatStrategy");
        set.add("mapJmsMessage");
        set.add("messageCreatedStrategy");
        set.add("errorHandlerLoggingLevel");
        set.add("errorHandlerLogStackTrace");
        set.add("transacted");
        set.add("transactionBatchCount");
        set.add("transactionBatchTimeout");
        set.add("transactionCommitStrategy");
        set.add("sharedJMSSession");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "sjms".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destinationType", "queue", false, copy);
        uri = buildPathParameter(syntax, uri, "destinationName", null, true, copy);
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

