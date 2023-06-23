// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardProxyBaseResourceInner;

/** An immutable client-side representation of ResourceGuardProxyBaseResource. */
public interface ResourceGuardProxyBaseResource {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: ResourceGuardProxyBaseResource properties.
     *
     * @return the properties value.
     */
    ResourceGuardProxyBase properties();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardProxyBaseResourceInner object.
     *
     * @return the inner object.
     */
    ResourceGuardProxyBaseResourceInner innerModel();

    /** The entirety of the ResourceGuardProxyBaseResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ResourceGuardProxyBaseResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ResourceGuardProxyBaseResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ResourceGuardProxyBaseResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vaultName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param vaultName The name of the backup vault.
             * @return the next definition stage.
             */
            WithCreate withExistingBackupVault(String resourceGroupName, String vaultName);
        }
        /**
         * The stage of the ResourceGuardProxyBaseResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ResourceGuardProxyBaseResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ResourceGuardProxyBaseResource create(Context context);
        }
        /** The stage of the ResourceGuardProxyBaseResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: ResourceGuardProxyBaseResource properties.
             *
             * @param properties ResourceGuardProxyBaseResource properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(ResourceGuardProxyBase properties);
        }
    }
    /**
     * Begins update for the ResourceGuardProxyBaseResource resource.
     *
     * @return the stage of resource update.
     */
    ResourceGuardProxyBaseResource.Update update();

    /** The template for ResourceGuardProxyBaseResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ResourceGuardProxyBaseResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ResourceGuardProxyBaseResource apply(Context context);
    }
    /** The ResourceGuardProxyBaseResource update stages. */
    interface UpdateStages {
        /** The stage of the ResourceGuardProxyBaseResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: ResourceGuardProxyBaseResource properties.
             *
             * @param properties ResourceGuardProxyBaseResource properties.
             * @return the next definition stage.
             */
            Update withProperties(ResourceGuardProxyBase properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ResourceGuardProxyBaseResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ResourceGuardProxyBaseResource refresh(Context context);

    /**
     * UnlockDelete call for ResourceGuardProxy, executed before one can delete it.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of Unlock Delete API along with {@link Response}.
     */
    Response<UnlockDeleteResponse> unlockDeleteWithResponse(UnlockDeleteRequest parameters, Context context);

    /**
     * UnlockDelete call for ResourceGuardProxy, executed before one can delete it.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of Unlock Delete API.
     */
    UnlockDeleteResponse unlockDelete(UnlockDeleteRequest parameters);
}