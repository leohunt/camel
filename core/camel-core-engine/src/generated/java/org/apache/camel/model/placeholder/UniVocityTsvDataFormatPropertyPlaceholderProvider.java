/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.dataformat.UniVocityTsvDataFormat;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class UniVocityTsvDataFormatPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public UniVocityTsvDataFormatPropertyPlaceholderProvider(Object obj) {
        UniVocityTsvDataFormat definition = (UniVocityTsvDataFormat) obj;

        readPlaceholders.put("escapeChar", definition::getEscapeChar);
        writePlaceholders.put("escapeChar", definition::setEscapeChar);
        readPlaceholders.put("nullValue", definition::getNullValue);
        writePlaceholders.put("nullValue", definition::setNullValue);
        readPlaceholders.put("emptyValue", definition::getEmptyValue);
        writePlaceholders.put("emptyValue", definition::setEmptyValue);
        readPlaceholders.put("lineSeparator", definition::getLineSeparator);
        writePlaceholders.put("lineSeparator", definition::setLineSeparator);
        readPlaceholders.put("normalizedLineSeparator", definition::getNormalizedLineSeparator);
        writePlaceholders.put("normalizedLineSeparator", definition::setNormalizedLineSeparator);
        readPlaceholders.put("comment", definition::getComment);
        writePlaceholders.put("comment", definition::setComment);
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

