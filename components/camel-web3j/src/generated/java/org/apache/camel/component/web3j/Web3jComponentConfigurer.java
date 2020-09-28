/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.web3j;

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
public class Web3jComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("addresses", java.util.List.class);
        map.put("configuration", org.apache.camel.component.web3j.Web3jConfiguration.class);
        map.put("fromAddress", java.lang.String.class);
        map.put("fromBlock", java.lang.String.class);
        map.put("fullTransactionObjects", boolean.class);
        map.put("gasLimit", java.math.BigInteger.class);
        map.put("privateFor", java.util.List.class);
        map.put("quorumAPI", boolean.class);
        map.put("toAddress", java.lang.String.class);
        map.put("toBlock", java.lang.String.class);
        map.put("topics", java.lang.String.class);
        map.put("web3j", org.web3j.protocol.Web3j.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("address", java.lang.String.class);
        map.put("atBlock", java.lang.String.class);
        map.put("blockHash", java.lang.String.class);
        map.put("clientId", java.lang.String.class);
        map.put("data", java.lang.String.class);
        map.put("databaseName", java.lang.String.class);
        map.put("filterId", java.math.BigInteger.class);
        map.put("gasPrice", java.math.BigInteger.class);
        map.put("hashrate", java.lang.String.class);
        map.put("headerPowHash", java.lang.String.class);
        map.put("index", java.math.BigInteger.class);
        map.put("keyName", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("mixDigest", java.lang.String.class);
        map.put("nonce", java.lang.String.class);
        map.put("operation", java.lang.String.class);
        map.put("position", java.math.BigInteger.class);
        map.put("priority", java.math.BigInteger.class);
        map.put("sha3HashOfDataToSign", java.lang.String.class);
        map.put("signedTransactionData", java.lang.String.class);
        map.put("sourceCode", java.lang.String.class);
        map.put("transactionHash", java.lang.String.class);
        map.put("ttl", java.math.BigInteger.class);
        map.put("value", java.math.BigInteger.class);
        map.put("basicPropertyBinding", boolean.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.web3j.Web3jConfiguration getOrCreateConfiguration(Web3jComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.web3j.Web3jConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Web3jComponent target = (Web3jComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": getOrCreateConfiguration(target).setAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "addresses": getOrCreateConfiguration(target).setAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "atblock":
        case "atBlock": getOrCreateConfiguration(target).setAtBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blockhash":
        case "blockHash": getOrCreateConfiguration(target).setBlockHash(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.web3j.Web3jConfiguration.class, value)); return true;
        case "data": getOrCreateConfiguration(target).setData(property(camelContext, java.lang.String.class, value)); return true;
        case "databasename":
        case "databaseName": getOrCreateConfiguration(target).setDatabaseName(property(camelContext, java.lang.String.class, value)); return true;
        case "filterid":
        case "filterId": getOrCreateConfiguration(target).setFilterId(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "fromaddress":
        case "fromAddress": getOrCreateConfiguration(target).setFromAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "fromblock":
        case "fromBlock": getOrCreateConfiguration(target).setFromBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "fulltransactionobjects":
        case "fullTransactionObjects": getOrCreateConfiguration(target).setFullTransactionObjects(property(camelContext, boolean.class, value)); return true;
        case "gaslimit":
        case "gasLimit": getOrCreateConfiguration(target).setGasLimit(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "gasprice":
        case "gasPrice": getOrCreateConfiguration(target).setGasPrice(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "hashrate": getOrCreateConfiguration(target).setHashrate(property(camelContext, java.lang.String.class, value)); return true;
        case "headerpowhash":
        case "headerPowHash": getOrCreateConfiguration(target).setHeaderPowHash(property(camelContext, java.lang.String.class, value)); return true;
        case "index": getOrCreateConfiguration(target).setIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "keyname":
        case "keyName": getOrCreateConfiguration(target).setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mixdigest":
        case "mixDigest": getOrCreateConfiguration(target).setMixDigest(property(camelContext, java.lang.String.class, value)); return true;
        case "nonce": getOrCreateConfiguration(target).setNonce(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "position": getOrCreateConfiguration(target).setPosition(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "priority": getOrCreateConfiguration(target).setPriority(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "privatefor":
        case "privateFor": getOrCreateConfiguration(target).setPrivateFor(property(camelContext, java.util.List.class, value)); return true;
        case "quorumapi":
        case "quorumAPI": getOrCreateConfiguration(target).setQuorumAPI(property(camelContext, boolean.class, value)); return true;
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": getOrCreateConfiguration(target).setSha3HashOfDataToSign(property(camelContext, java.lang.String.class, value)); return true;
        case "signedtransactiondata":
        case "signedTransactionData": getOrCreateConfiguration(target).setSignedTransactionData(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcecode":
        case "sourceCode": getOrCreateConfiguration(target).setSourceCode(property(camelContext, java.lang.String.class, value)); return true;
        case "toaddress":
        case "toAddress": getOrCreateConfiguration(target).setToAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "toblock":
        case "toBlock": getOrCreateConfiguration(target).setToBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "topics": getOrCreateConfiguration(target).setTopics(property(camelContext, java.lang.String.class, value)); return true;
        case "transactionhash":
        case "transactionHash": getOrCreateConfiguration(target).setTransactionHash(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": getOrCreateConfiguration(target).setTtl(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "value": getOrCreateConfiguration(target).setValue(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "web3j": getOrCreateConfiguration(target).setWeb3j(property(camelContext, org.web3j.protocol.Web3j.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Web3jComponent target = (Web3jComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": return getOrCreateConfiguration(target).getAddress();
        case "addresses": return getOrCreateConfiguration(target).getAddresses();
        case "atblock":
        case "atBlock": return getOrCreateConfiguration(target).getAtBlock();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "blockhash":
        case "blockHash": return getOrCreateConfiguration(target).getBlockHash();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "configuration": return target.getConfiguration();
        case "data": return getOrCreateConfiguration(target).getData();
        case "databasename":
        case "databaseName": return getOrCreateConfiguration(target).getDatabaseName();
        case "filterid":
        case "filterId": return getOrCreateConfiguration(target).getFilterId();
        case "fromaddress":
        case "fromAddress": return getOrCreateConfiguration(target).getFromAddress();
        case "fromblock":
        case "fromBlock": return getOrCreateConfiguration(target).getFromBlock();
        case "fulltransactionobjects":
        case "fullTransactionObjects": return getOrCreateConfiguration(target).isFullTransactionObjects();
        case "gaslimit":
        case "gasLimit": return getOrCreateConfiguration(target).getGasLimit();
        case "gasprice":
        case "gasPrice": return getOrCreateConfiguration(target).getGasPrice();
        case "hashrate": return getOrCreateConfiguration(target).getHashrate();
        case "headerpowhash":
        case "headerPowHash": return getOrCreateConfiguration(target).getHeaderPowHash();
        case "index": return getOrCreateConfiguration(target).getIndex();
        case "keyname":
        case "keyName": return getOrCreateConfiguration(target).getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mixdigest":
        case "mixDigest": return getOrCreateConfiguration(target).getMixDigest();
        case "nonce": return getOrCreateConfiguration(target).getNonce();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "position": return getOrCreateConfiguration(target).getPosition();
        case "priority": return getOrCreateConfiguration(target).getPriority();
        case "privatefor":
        case "privateFor": return getOrCreateConfiguration(target).getPrivateFor();
        case "quorumapi":
        case "quorumAPI": return getOrCreateConfiguration(target).isQuorumAPI();
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": return getOrCreateConfiguration(target).getSha3HashOfDataToSign();
        case "signedtransactiondata":
        case "signedTransactionData": return getOrCreateConfiguration(target).getSignedTransactionData();
        case "sourcecode":
        case "sourceCode": return getOrCreateConfiguration(target).getSourceCode();
        case "toaddress":
        case "toAddress": return getOrCreateConfiguration(target).getToAddress();
        case "toblock":
        case "toBlock": return getOrCreateConfiguration(target).getToBlock();
        case "topics": return getOrCreateConfiguration(target).getTopics();
        case "transactionhash":
        case "transactionHash": return getOrCreateConfiguration(target).getTransactionHash();
        case "ttl": return getOrCreateConfiguration(target).getTtl();
        case "value": return getOrCreateConfiguration(target).getValue();
        case "web3j": return getOrCreateConfiguration(target).getWeb3j();
        default: return null;
        }
    }
}

