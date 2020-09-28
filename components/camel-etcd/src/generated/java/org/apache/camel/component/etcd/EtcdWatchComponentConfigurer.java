/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

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
public class EtcdWatchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bridgeErrorHandler", boolean.class);
        map.put("configuration", org.apache.camel.component.etcd.EtcdConfiguration.class);
        map.put("recursive", boolean.class);
        map.put("servicePath", java.lang.String.class);
        map.put("timeout", java.lang.Long.class);
        map.put("uris", java.lang.String.class);
        map.put("sendEmptyExchangeOnTimeout", boolean.class);
        map.put("fromIndex", long.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("password", java.lang.String.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("useGlobalSslContextParameters", boolean.class);
        map.put("userName", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.etcd.EtcdConfiguration getOrCreateConfiguration(EtcdWatchComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.etcd.EtcdConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EtcdWatchComponent target = (EtcdWatchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.etcd.EtcdConfiguration.class, value)); return true;
        case "fromindex":
        case "fromIndex": getOrCreateConfiguration(target).setFromIndex(property(camelContext, long.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "recursive": getOrCreateConfiguration(target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": getOrCreateConfiguration(target).setSendEmptyExchangeOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "servicepath":
        case "servicePath": getOrCreateConfiguration(target).setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "timeout": getOrCreateConfiguration(target).setTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "uris": getOrCreateConfiguration(target).setUris(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EtcdWatchComponent target = (EtcdWatchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "fromindex":
        case "fromIndex": return getOrCreateConfiguration(target).getFromIndex();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "recursive": return getOrCreateConfiguration(target).isRecursive();
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": return getOrCreateConfiguration(target).isSendEmptyExchangeOnTimeout();
        case "servicepath":
        case "servicePath": return getOrCreateConfiguration(target).getServicePath();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "timeout": return getOrCreateConfiguration(target).getTimeout();
        case "uris": return getOrCreateConfiguration(target).getUris();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "username":
        case "userName": return getOrCreateConfiguration(target).getUserName();
        default: return null;
        }
    }
}

