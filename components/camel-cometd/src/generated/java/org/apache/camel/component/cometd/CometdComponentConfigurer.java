/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cometd;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CometdComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("extensions", java.util.List.class);
        map.put("securityPolicy", org.cometd.bayeux.server.SecurityPolicy.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("sslKeyPassword", java.lang.String.class);
        map.put("sslKeystore", java.lang.String.class);
        map.put("sslPassword", java.lang.String.class);
        map.put("useGlobalSslContextParameters", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CometdComponent target = (CometdComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "extensions": target.setExtensions(property(camelContext, java.util.List.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "securitypolicy":
        case "securityPolicy": target.setSecurityPolicy(property(camelContext, org.cometd.bayeux.server.SecurityPolicy.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": target.setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystore":
        case "sslKeystore": target.setSslKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "sslpassword":
        case "sslPassword": target.setSslPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CometdComponent target = (CometdComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "extensions": return target.getExtensions();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "securitypolicy":
        case "securityPolicy": return target.getSecurityPolicy();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "sslkeypassword":
        case "sslKeyPassword": return target.getSslKeyPassword();
        case "sslkeystore":
        case "sslKeystore": return target.getSslKeystore();
        case "sslpassword":
        case "sslPassword": return target.getSslPassword();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }
}

