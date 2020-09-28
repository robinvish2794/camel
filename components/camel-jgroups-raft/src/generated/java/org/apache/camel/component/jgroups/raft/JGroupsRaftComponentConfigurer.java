/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jgroups.raft;

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
public class JGroupsRaftComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("channelProperties", java.lang.String.class);
        map.put("raftHandle", org.jgroups.raft.RaftHandle.class);
        map.put("raftId", java.lang.String.class);
        map.put("stateMachine", org.jgroups.protocols.raft.StateMachine.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JGroupsRaftComponent target = (JGroupsRaftComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channelproperties":
        case "channelProperties": target.setChannelProperties(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "rafthandle":
        case "raftHandle": target.setRaftHandle(property(camelContext, org.jgroups.raft.RaftHandle.class, value)); return true;
        case "raftid":
        case "raftId": target.setRaftId(property(camelContext, java.lang.String.class, value)); return true;
        case "statemachine":
        case "stateMachine": target.setStateMachine(property(camelContext, org.jgroups.protocols.raft.StateMachine.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JGroupsRaftComponent target = (JGroupsRaftComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channelproperties":
        case "channelProperties": return target.getChannelProperties();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "rafthandle":
        case "raftHandle": return target.getRaftHandle();
        case "raftid":
        case "raftId": return target.getRaftId();
        case "statemachine":
        case "stateMachine": return target.getStateMachine();
        default: return null;
        }
    }
}

