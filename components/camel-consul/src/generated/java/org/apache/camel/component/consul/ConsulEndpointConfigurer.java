/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul;

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
public class ConsulEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("apiEndpoint", java.lang.String.class);
        map.put("connectTimeout", java.time.Duration.class);
        map.put("connectTimeoutMillis", java.lang.Long.class);
        map.put("consulClient", com.orbitz.consul.Consul.class);
        map.put("key", java.lang.String.class);
        map.put("pingInstance", boolean.class);
        map.put("readTimeout", java.time.Duration.class);
        map.put("readTimeoutMillis", java.lang.Long.class);
        map.put("tags", java.lang.String.class);
        map.put("url", java.lang.String.class);
        map.put("writeTimeout", java.time.Duration.class);
        map.put("writeTimeoutMillis", java.lang.Long.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("action", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("valueAsString", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("consistencyMode", com.orbitz.consul.option.ConsistencyMode.class);
        map.put("datacenter", java.lang.String.class);
        map.put("nearNode", java.lang.String.class);
        map.put("nodeMeta", java.util.List.class);
        map.put("synchronous", boolean.class);
        map.put("aclToken", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("userName", java.lang.String.class);
        map.put("blockSeconds", java.lang.Integer.class);
        map.put("firstIndex", java.math.BigInteger.class);
        map.put("recursive", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ConsulEndpoint target = (ConsulEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": target.getConfiguration().setAclToken(property(camelContext, java.lang.String.class, value)); return true;
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blockseconds":
        case "blockSeconds": target.getConfiguration().setBlockSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.getConfiguration().setConnectTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": target.getConfiguration().setConnectTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "consistencymode":
        case "consistencyMode": target.getConfiguration().setConsistencyMode(property(camelContext, com.orbitz.consul.option.ConsistencyMode.class, value)); return true;
        case "consulclient":
        case "consulClient": target.getConfiguration().setConsulClient(property(camelContext, com.orbitz.consul.Consul.class, value)); return true;
        case "datacenter": target.getConfiguration().setDatacenter(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "firstindex":
        case "firstIndex": target.getConfiguration().setFirstIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nearnode":
        case "nearNode": target.getConfiguration().setNearNode(property(camelContext, java.lang.String.class, value)); return true;
        case "nodemeta":
        case "nodeMeta": target.getConfiguration().setNodeMeta(property(camelContext, java.util.List.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pinginstance":
        case "pingInstance": target.getConfiguration().setPingInstance(property(camelContext, boolean.class, value)); return true;
        case "readtimeout":
        case "readTimeout": target.getConfiguration().setReadTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "readtimeoutmillis":
        case "readTimeoutMillis": target.getConfiguration().setReadTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "recursive": target.getConfiguration().setRecursive(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tags": target.getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "url": target.getConfiguration().setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "valueasstring":
        case "valueAsString": target.getConfiguration().setValueAsString(property(camelContext, boolean.class, value)); return true;
        case "writetimeout":
        case "writeTimeout": target.getConfiguration().setWriteTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "writetimeoutmillis":
        case "writeTimeoutMillis": target.getConfiguration().setWriteTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ConsulEndpoint target = (ConsulEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return target.getConfiguration().getAclToken();
        case "action": return target.getConfiguration().getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "blockseconds":
        case "blockSeconds": return target.getConfiguration().getBlockSeconds();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connecttimeout":
        case "connectTimeout": return target.getConfiguration().getConnectTimeout();
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": return target.getConfiguration().getConnectTimeoutMillis();
        case "consistencymode":
        case "consistencyMode": return target.getConfiguration().getConsistencyMode();
        case "consulclient":
        case "consulClient": return target.getConfiguration().getConsulClient();
        case "datacenter": return target.getConfiguration().getDatacenter();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "firstindex":
        case "firstIndex": return target.getConfiguration().getFirstIndex();
        case "key": return target.getConfiguration().getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nearnode":
        case "nearNode": return target.getConfiguration().getNearNode();
        case "nodemeta":
        case "nodeMeta": return target.getConfiguration().getNodeMeta();
        case "password": return target.getConfiguration().getPassword();
        case "pinginstance":
        case "pingInstance": return target.getConfiguration().isPingInstance();
        case "readtimeout":
        case "readTimeout": return target.getConfiguration().getReadTimeout();
        case "readtimeoutmillis":
        case "readTimeoutMillis": return target.getConfiguration().getReadTimeoutMillis();
        case "recursive": return target.getConfiguration().isRecursive();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "tags": return target.getConfiguration().getTags();
        case "url": return target.getConfiguration().getUrl();
        case "username":
        case "userName": return target.getConfiguration().getUserName();
        case "valueasstring":
        case "valueAsString": return target.getConfiguration().isValueAsString();
        case "writetimeout":
        case "writeTimeout": return target.getConfiguration().getWriteTimeout();
        case "writetimeoutmillis":
        case "writeTimeoutMillis": return target.getConfiguration().getWriteTimeoutMillis();
        default: return null;
        }
    }
}

