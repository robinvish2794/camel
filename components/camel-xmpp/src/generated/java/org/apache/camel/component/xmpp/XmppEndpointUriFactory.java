/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmpp;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class XmppEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/participant";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(24);
        set.add("host");
        set.add("port");
        set.add("participant");
        set.add("login");
        set.add("nickname");
        set.add("pubsub");
        set.add("room");
        set.add("serviceName");
        set.add("testConnectionOnStartup");
        set.add("createAccount");
        set.add("resource");
        set.add("bridgeErrorHandler");
        set.add("connectionPollDelay");
        set.add("doc");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("connectionConfig");
        set.add("synchronous");
        set.add("headerFilterStrategy");
        set.add("password");
        set.add("roomPassword");
        set.add("user");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "xmpp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, true, copy);
        uri = buildPathParameter(syntax, uri, "participant", null, false, copy);
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

