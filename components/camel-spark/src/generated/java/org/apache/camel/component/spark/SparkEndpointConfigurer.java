/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.spark;

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
public class SparkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("endpointType", org.apache.camel.component.spark.EndpointType.class);
        map.put("collect", boolean.class);
        map.put("dataFrame", org.apache.spark.sql.Dataset.class);
        map.put("dataFrameCallback", org.apache.camel.component.spark.DataFrameCallback.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("rdd", org.apache.spark.api.java.JavaRDDLike.class);
        map.put("rddCallback", org.apache.camel.component.spark.RddCallback.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SparkEndpoint target = (SparkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "collect": target.setCollect(property(camelContext, boolean.class, value)); return true;
        case "dataframe":
        case "dataFrame": target.setDataFrame(property(camelContext, org.apache.spark.sql.Dataset.class, value)); return true;
        case "dataframecallback":
        case "dataFrameCallback": target.setDataFrameCallback(property(camelContext, org.apache.camel.component.spark.DataFrameCallback.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "rdd": target.setRdd(property(camelContext, org.apache.spark.api.java.JavaRDDLike.class, value)); return true;
        case "rddcallback":
        case "rddCallback": target.setRddCallback(property(camelContext, org.apache.camel.component.spark.RddCallback.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SparkEndpoint target = (SparkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "collect": return target.isCollect();
        case "dataframe":
        case "dataFrame": return target.getDataFrame();
        case "dataframecallback":
        case "dataFrameCallback": return target.getDataFrameCallback();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "rdd": return target.getRdd();
        case "rddcallback":
        case "rddCallback": return target.getRddCallback();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

