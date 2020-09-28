/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kafka;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class KafkaEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topic";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(98);
        set.add("topic");
        set.add("additionalProperties");
        set.add("brokers");
        set.add("clientId");
        set.add("headerFilterStrategy");
        set.add("reconnectBackoffMaxMs");
        set.add("shutdownTimeout");
        set.add("allowManualCommit");
        set.add("autoCommitEnable");
        set.add("autoCommitIntervalMs");
        set.add("autoCommitOnStop");
        set.add("autoOffsetReset");
        set.add("breakOnFirstError");
        set.add("bridgeErrorHandler");
        set.add("checkCrcs");
        set.add("consumerRequestTimeoutMs");
        set.add("consumersCount");
        set.add("consumerStreams");
        set.add("fetchMaxBytes");
        set.add("fetchMinBytes");
        set.add("fetchWaitMaxMs");
        set.add("groupId");
        set.add("heartbeatIntervalMs");
        set.add("kafkaHeaderDeserializer");
        set.add("keyDeserializer");
        set.add("maxPartitionFetchBytes");
        set.add("maxPollIntervalMs");
        set.add("maxPollRecords");
        set.add("offsetRepository");
        set.add("partitionAssignor");
        set.add("pollTimeoutMs");
        set.add("seekTo");
        set.add("sessionTimeoutMs");
        set.add("specificAvroReader");
        set.add("topicIsPattern");
        set.add("valueDeserializer");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("bufferMemorySize");
        set.add("compressionCodec");
        set.add("connectionMaxIdleMs");
        set.add("enableIdempotence");
        set.add("kafkaHeaderSerializer");
        set.add("key");
        set.add("keySerializerClass");
        set.add("lazyStartProducer");
        set.add("lingerMs");
        set.add("maxBlockMs");
        set.add("maxInFlightRequest");
        set.add("maxRequestSize");
        set.add("metadataMaxAgeMs");
        set.add("metricReporters");
        set.add("metricsSampleWindowMs");
        set.add("noOfMetricsSample");
        set.add("partitioner");
        set.add("partitionKey");
        set.add("producerBatchSize");
        set.add("queueBufferingMaxMessages");
        set.add("receiveBufferBytes");
        set.add("reconnectBackoffMs");
        set.add("recordMetadata");
        set.add("requestRequiredAcks");
        set.add("requestTimeoutMs");
        set.add("retries");
        set.add("retryBackoffMs");
        set.add("sendBufferBytes");
        set.add("serializerClass");
        set.add("workerPool");
        set.add("workerPoolCoreSize");
        set.add("workerPoolMaxSize");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("schemaRegistryURL");
        set.add("interceptorClasses");
        set.add("kerberosBeforeReloginMinTime");
        set.add("kerberosInitCmd");
        set.add("kerberosPrincipalToLocalRules");
        set.add("kerberosRenewJitter");
        set.add("kerberosRenewWindowFactor");
        set.add("saslJaasConfig");
        set.add("saslKerberosServiceName");
        set.add("saslMechanism");
        set.add("securityProtocol");
        set.add("sslCipherSuites");
        set.add("sslContextParameters");
        set.add("sslEnabledProtocols");
        set.add("sslEndpointAlgorithm");
        set.add("sslKeymanagerAlgorithm");
        set.add("sslKeyPassword");
        set.add("sslKeystoreLocation");
        set.add("sslKeystorePassword");
        set.add("sslKeystoreType");
        set.add("sslProtocol");
        set.add("sslProvider");
        set.add("sslTrustmanagerAlgorithm");
        set.add("sslTruststoreLocation");
        set.add("sslTruststorePassword");
        set.add("sslTruststoreType");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "kafka".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topic", null, true, copy);
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

