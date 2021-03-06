/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.milo.client.MiloClientComponent;

/**
 * Connect to OPC UA servers using the binary protocol for acquiring telemetry
 * data
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MiloClientComponentBuilderFactory {

    /**
     * OPC UA Client (camel-milo)
     * Connect to OPC UA servers using the binary protocol for acquiring
     * telemetry data
     * 
     * Category: iot
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-milo
     */
    static MiloClientComponentBuilder miloClient() {
        return new MiloClientComponentBuilderImpl();
    }

    /**
     * Builder for the OPC UA Client component.
     */
    interface MiloClientComponentBuilder
            extends
                ComponentBuilder<MiloClientComponent> {
        /**
         * Default application name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder applicationName(
                java.lang.String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Default application URI.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder applicationUri(
                java.lang.String applicationUri) {
            doSetProperty("applicationUri", applicationUri);
            return this;
        }
        /**
         * All default options for client.
         * 
         * The option is a:
         * <code>org.apache.camel.component.milo.client.MiloClientConfiguration</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder defaultConfiguration(
                org.apache.camel.component.milo.client.MiloClientConfiguration defaultConfiguration) {
            doSetProperty("defaultConfiguration", defaultConfiguration);
            return this;
        }
        /**
         * Default product URI.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder productUri(
                java.lang.String productUri) {
            doSetProperty("productUri", productUri);
            return this;
        }
        /**
         * Default reconnect timeout.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder reconnectTimeout(
                java.lang.Long reconnectTimeout) {
            doSetProperty("reconnectTimeout", reconnectTimeout);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default MiloClientComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MiloClientComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default MiloClientComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class MiloClientComponentBuilderImpl
            extends
                AbstractComponentBuilder<MiloClientComponent>
            implements
                MiloClientComponentBuilder {
        @Override
        protected MiloClientComponent buildConcreteComponent() {
            return new MiloClientComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "applicationName": ((MiloClientComponent) component).setApplicationName((java.lang.String) value); return true;
            case "applicationUri": ((MiloClientComponent) component).setApplicationUri((java.lang.String) value); return true;
            case "defaultConfiguration": ((MiloClientComponent) component).setDefaultConfiguration((org.apache.camel.component.milo.client.MiloClientConfiguration) value); return true;
            case "productUri": ((MiloClientComponent) component).setProductUri((java.lang.String) value); return true;
            case "reconnectTimeout": ((MiloClientComponent) component).setReconnectTimeout((java.lang.Long) value); return true;
            case "bridgeErrorHandler": ((MiloClientComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((MiloClientComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((MiloClientComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}