/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.dataformat.FhirJsonDataFormat;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class FhirJsonDataFormatPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public FhirJsonDataFormatPropertyPlaceholderProvider(Object obj) {
        FhirJsonDataFormat definition = (FhirJsonDataFormat) obj;

        readPlaceholders.put("fhirVersion", definition::getFhirVersion);
        writePlaceholders.put("fhirVersion", definition::setFhirVersion);
        readPlaceholders.put("serverBaseUrl", definition::getServerBaseUrl);
        writePlaceholders.put("serverBaseUrl", definition::setServerBaseUrl);
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

