/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

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
public class DebeziumMongodbEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("name", java.lang.String.class);
        map.put("additionalProperties", java.util.Map.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("internalKeyConverter", java.lang.String.class);
        map.put("internalValueConverter", java.lang.String.class);
        map.put("offsetCommitPolicy", java.lang.String.class);
        map.put("offsetCommitTimeoutMs", long.class);
        map.put("offsetFlushIntervalMs", long.class);
        map.put("offsetStorage", java.lang.String.class);
        map.put("offsetStorageFileName", java.lang.String.class);
        map.put("offsetStoragePartitions", int.class);
        map.put("offsetStorageReplicationFactor", int.class);
        map.put("offsetStorageTopic", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("collectionBlacklist", java.lang.String.class);
        map.put("collectionWhitelist", java.lang.String.class);
        map.put("connectBackoffInitialDelayMs", long.class);
        map.put("connectBackoffMaxDelayMs", long.class);
        map.put("connectMaxAttempts", int.class);
        map.put("converters", java.lang.String.class);
        map.put("databaseBlacklist", java.lang.String.class);
        map.put("databaseHistoryFileFilename", java.lang.String.class);
        map.put("databaseWhitelist", java.lang.String.class);
        map.put("eventProcessingFailureHandlingMode", java.lang.String.class);
        map.put("fieldBlacklist", java.lang.String.class);
        map.put("fieldRenames", java.lang.String.class);
        map.put("heartbeatIntervalMs", int.class);
        map.put("heartbeatTopicsPrefix", java.lang.String.class);
        map.put("initialSyncMaxThreads", int.class);
        map.put("maxBatchSize", int.class);
        map.put("maxQueueSize", int.class);
        map.put("mongodbAuthsource", java.lang.String.class);
        map.put("mongodbHosts", java.lang.String.class);
        map.put("mongodbMembersAutoDiscover", boolean.class);
        map.put("mongodbName", java.lang.String.class);
        map.put("mongodbPassword", java.lang.String.class);
        map.put("mongodbPollIntervalSec", int.class);
        map.put("mongodbSslEnabled", boolean.class);
        map.put("mongodbSslInvalidHostnameAllowed", boolean.class);
        map.put("mongodbUser", java.lang.String.class);
        map.put("pollIntervalMs", long.class);
        map.put("provideTransactionMetadata", boolean.class);
        map.put("sanitizeFieldNames", boolean.class);
        map.put("skippedOperations", java.lang.String.class);
        map.put("snapshotDelayMs", long.class);
        map.put("snapshotFetchSize", int.class);
        map.put("snapshotMode", java.lang.String.class);
        map.put("sourceStructVersion", java.lang.String.class);
        map.put("tombstonesOnDelete", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumMongodbEndpoint target = (DebeziumMongodbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "collectionblacklist":
        case "collectionBlacklist": target.getConfiguration().setCollectionBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "collectionwhitelist":
        case "collectionWhitelist": target.getConfiguration().setCollectionWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "connectbackoffinitialdelayms":
        case "connectBackoffInitialDelayMs": target.getConfiguration().setConnectBackoffInitialDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "connectbackoffmaxdelayms":
        case "connectBackoffMaxDelayMs": target.getConfiguration().setConnectBackoffMaxDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "connectmaxattempts":
        case "connectMaxAttempts": target.getConfiguration().setConnectMaxAttempts(property(camelContext, int.class, value)); return true;
        case "converters": target.getConfiguration().setConverters(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseblacklist":
        case "databaseBlacklist": target.getConfiguration().setDatabaseBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": target.getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasewhitelist":
        case "databaseWhitelist": target.getConfiguration().setDatabaseWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": target.getConfiguration().setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fieldblacklist":
        case "fieldBlacklist": target.getConfiguration().setFieldBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "fieldrenames":
        case "fieldRenames": target.getConfiguration().setFieldRenames(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "initialsyncmaxthreads":
        case "initialSyncMaxThreads": target.getConfiguration().setInitialSyncMaxThreads(property(camelContext, int.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "mongodbauthsource":
        case "mongodbAuthsource": target.getConfiguration().setMongodbAuthsource(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbhosts":
        case "mongodbHosts": target.getConfiguration().setMongodbHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbmembersautodiscover":
        case "mongodbMembersAutoDiscover": target.getConfiguration().setMongodbMembersAutoDiscover(property(camelContext, boolean.class, value)); return true;
        case "mongodbname":
        case "mongodbName": target.getConfiguration().setMongodbName(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbpassword":
        case "mongodbPassword": target.getConfiguration().setMongodbPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbpollintervalsec":
        case "mongodbPollIntervalSec": target.getConfiguration().setMongodbPollIntervalSec(property(camelContext, int.class, value)); return true;
        case "mongodbsslenabled":
        case "mongodbSslEnabled": target.getConfiguration().setMongodbSslEnabled(property(camelContext, boolean.class, value)); return true;
        case "mongodbsslinvalidhostnameallowed":
        case "mongodbSslInvalidHostnameAllowed": target.getConfiguration().setMongodbSslInvalidHostnameAllowed(property(camelContext, boolean.class, value)); return true;
        case "mongodbuser":
        case "mongodbUser": target.getConfiguration().setMongodbUser(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": target.getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": target.getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": target.getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": target.getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": target.getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": target.getConfiguration().setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": target.getConfiguration().setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "sanitizefieldnames":
        case "sanitizeFieldNames": target.getConfiguration().setSanitizeFieldNames(property(camelContext, boolean.class, value)); return true;
        case "skippedoperations":
        case "skippedOperations": target.getConfiguration().setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": target.getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": target.getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumMongodbEndpoint target = (DebeziumMongodbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return target.getConfiguration().getAdditionalProperties();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "collectionblacklist":
        case "collectionBlacklist": return target.getConfiguration().getCollectionBlacklist();
        case "collectionwhitelist":
        case "collectionWhitelist": return target.getConfiguration().getCollectionWhitelist();
        case "connectbackoffinitialdelayms":
        case "connectBackoffInitialDelayMs": return target.getConfiguration().getConnectBackoffInitialDelayMs();
        case "connectbackoffmaxdelayms":
        case "connectBackoffMaxDelayMs": return target.getConfiguration().getConnectBackoffMaxDelayMs();
        case "connectmaxattempts":
        case "connectMaxAttempts": return target.getConfiguration().getConnectMaxAttempts();
        case "converters": return target.getConfiguration().getConverters();
        case "databaseblacklist":
        case "databaseBlacklist": return target.getConfiguration().getDatabaseBlacklist();
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return target.getConfiguration().getDatabaseHistoryFileFilename();
        case "databasewhitelist":
        case "databaseWhitelist": return target.getConfiguration().getDatabaseWhitelist();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return target.getConfiguration().getEventProcessingFailureHandlingMode();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fieldblacklist":
        case "fieldBlacklist": return target.getConfiguration().getFieldBlacklist();
        case "fieldrenames":
        case "fieldRenames": return target.getConfiguration().getFieldRenames();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return target.getConfiguration().getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return target.getConfiguration().getHeartbeatTopicsPrefix();
        case "initialsyncmaxthreads":
        case "initialSyncMaxThreads": return target.getConfiguration().getInitialSyncMaxThreads();
        case "internalkeyconverter":
        case "internalKeyConverter": return target.getConfiguration().getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return target.getConfiguration().getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return target.getConfiguration().getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return target.getConfiguration().getMaxQueueSize();
        case "mongodbauthsource":
        case "mongodbAuthsource": return target.getConfiguration().getMongodbAuthsource();
        case "mongodbhosts":
        case "mongodbHosts": return target.getConfiguration().getMongodbHosts();
        case "mongodbmembersautodiscover":
        case "mongodbMembersAutoDiscover": return target.getConfiguration().isMongodbMembersAutoDiscover();
        case "mongodbname":
        case "mongodbName": return target.getConfiguration().getMongodbName();
        case "mongodbpassword":
        case "mongodbPassword": return target.getConfiguration().getMongodbPassword();
        case "mongodbpollintervalsec":
        case "mongodbPollIntervalSec": return target.getConfiguration().getMongodbPollIntervalSec();
        case "mongodbsslenabled":
        case "mongodbSslEnabled": return target.getConfiguration().isMongodbSslEnabled();
        case "mongodbsslinvalidhostnameallowed":
        case "mongodbSslInvalidHostnameAllowed": return target.getConfiguration().isMongodbSslInvalidHostnameAllowed();
        case "mongodbuser":
        case "mongodbUser": return target.getConfiguration().getMongodbUser();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return target.getConfiguration().getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return target.getConfiguration().getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return target.getConfiguration().getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return target.getConfiguration().getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return target.getConfiguration().getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return target.getConfiguration().getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return target.getConfiguration().getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return target.getConfiguration().getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return target.getConfiguration().getPollIntervalMs();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return target.getConfiguration().isProvideTransactionMetadata();
        case "sanitizefieldnames":
        case "sanitizeFieldNames": return target.getConfiguration().isSanitizeFieldNames();
        case "skippedoperations":
        case "skippedOperations": return target.getConfiguration().getSkippedOperations();
        case "snapshotdelayms":
        case "snapshotDelayMs": return target.getConfiguration().getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return target.getConfiguration().getSnapshotFetchSize();
        case "snapshotmode":
        case "snapshotMode": return target.getConfiguration().getSnapshotMode();
        case "sourcestructversion":
        case "sourceStructVersion": return target.getConfiguration().getSourceStructVersion();
        case "synchronous": return target.isSynchronous();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return target.getConfiguration().isTombstonesOnDelete();
        default: return null;
        }
    }
}

