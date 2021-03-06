/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.MulticastDefinition;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class MulticastDefinitionPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public MulticastDefinitionPropertyPlaceholderProvider(Object obj) {
        MulticastDefinition definition = (MulticastDefinition) obj;

        readPlaceholders.put("parallelProcessing", definition::getParallelProcessing);
        writePlaceholders.put("parallelProcessing", definition::setParallelProcessing);
        readPlaceholders.put("strategyRef", definition::getStrategyRef);
        writePlaceholders.put("strategyRef", definition::setStrategyRef);
        readPlaceholders.put("strategyMethodName", definition::getStrategyMethodName);
        writePlaceholders.put("strategyMethodName", definition::setStrategyMethodName);
        readPlaceholders.put("strategyMethodAllowNull", definition::getStrategyMethodAllowNull);
        writePlaceholders.put("strategyMethodAllowNull", definition::setStrategyMethodAllowNull);
        readPlaceholders.put("executorServiceRef", definition::getExecutorServiceRef);
        writePlaceholders.put("executorServiceRef", definition::setExecutorServiceRef);
        readPlaceholders.put("streaming", definition::getStreaming);
        writePlaceholders.put("streaming", definition::setStreaming);
        readPlaceholders.put("stopOnException", definition::getStopOnException);
        writePlaceholders.put("stopOnException", definition::setStopOnException);
        readPlaceholders.put("timeout", definition::getTimeout);
        writePlaceholders.put("timeout", definition::setTimeout);
        readPlaceholders.put("onPrepareRef", definition::getOnPrepareRef);
        writePlaceholders.put("onPrepareRef", definition::setOnPrepareRef);
        readPlaceholders.put("shareUnitOfWork", definition::getShareUnitOfWork);
        writePlaceholders.put("shareUnitOfWork", definition::setShareUnitOfWork);
        readPlaceholders.put("parallelAggregate", definition::getParallelAggregate);
        writePlaceholders.put("parallelAggregate", definition::setParallelAggregate);
        readPlaceholders.put("stopOnAggregateException", definition::getStopOnAggregateException);
        writePlaceholders.put("stopOnAggregateException", definition::setStopOnAggregateException);
        readPlaceholders.put("id", definition::getId);
        writePlaceholders.put("id", definition::setId);
    }

    @Override
    public Map<String, Supplier<String>> getReadPropertyPlaceholderOptions(CamelContext camelContext) {
        return readPlaceholders;
    }

    @Override
    public Map<String, Consumer<String>> getWritePropertyPlaceholderOptions(CamelContext camelContext) {
        return writePlaceholders;
    }

}

