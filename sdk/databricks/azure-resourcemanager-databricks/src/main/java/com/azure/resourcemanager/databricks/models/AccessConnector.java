// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databricks.fluent.models.AccessConnectorInner;
import java.util.Map;

/** An immutable client-side representation of AccessConnector. */
public interface AccessConnector {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Managed service identity (system assigned and/or user assigned identities).
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: Azure Databricks accessConnector properties.
     *
     * @return the properties value.
     */
    AccessConnectorProperties properties();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.databricks.fluent.models.AccessConnectorInner object.
     *
     * @return the inner object.
     */
    AccessConnectorInner innerModel();

    /** The entirety of the AccessConnector definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The AccessConnector definition stages. */
    interface DefinitionStages {
        /** The first stage of the AccessConnector definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AccessConnector definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the AccessConnector definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the AccessConnector definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AccessConnector create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AccessConnector create(Context context);
        }
        /** The stage of the AccessConnector definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AccessConnector definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity (system assigned and/or user assigned
             * identities).
             *
             * @param identity Managed service identity (system assigned and/or user assigned identities).
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the AccessConnector definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Azure Databricks accessConnector properties.
             *
             * @param properties Azure Databricks accessConnector properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(AccessConnectorProperties properties);
        }
    }
    /**
     * Begins update for the AccessConnector resource.
     *
     * @return the stage of resource update.
     */
    AccessConnector.Update update();

    /** The template for AccessConnector update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AccessConnector apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AccessConnector apply(Context context);
    }
    /** The AccessConnector update stages. */
    interface UpdateStages {
        /** The stage of the AccessConnector update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AccessConnector update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity (system assigned and/or user assigned
             * identities).
             *
             * @param identity Managed service identity (system assigned and/or user assigned identities).
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AccessConnector refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AccessConnector refresh(Context context);
}