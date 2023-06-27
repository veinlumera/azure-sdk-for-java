// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NetworkToNetworkInterconnects. */
public interface NetworkToNetworkInterconnects {
    /**
     * Configuration used to setup CE-PE connectivity.
     *
     * <p>Implements NetworkToNetworkInterconnects GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricName Name of the NetworkFabric.
     * @param networkToNetworkInterconnectName Name of the NetworkToNetworkInterconnect.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkToNetworkInterconnect resource definition along with {@link Response}.
     */
    Response<NetworkToNetworkInterconnect> getWithResponse(
        String resourceGroupName, String networkFabricName, String networkToNetworkInterconnectName, Context context);

    /**
     * Configuration used to setup CE-PE connectivity.
     *
     * <p>Implements NetworkToNetworkInterconnects GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricName Name of the NetworkFabric.
     * @param networkToNetworkInterconnectName Name of the NetworkToNetworkInterconnect.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkToNetworkInterconnect resource definition.
     */
    NetworkToNetworkInterconnect get(
        String resourceGroupName, String networkFabricName, String networkToNetworkInterconnectName);

    /**
     * Deletes a NetworkToNetworkInterconnects.
     *
     * <p>Implements NetworkToNetworkInterconnects DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricName Name of the NetworkFabric.
     * @param networkToNetworkInterconnectName Name of the NetworkToNetworkInterconnectName.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkFabricName, String networkToNetworkInterconnectName);

    /**
     * Deletes a NetworkToNetworkInterconnects.
     *
     * <p>Implements NetworkToNetworkInterconnects DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricName Name of the NetworkFabric.
     * @param networkToNetworkInterconnectName Name of the NetworkToNetworkInterconnectName.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String networkFabricName, String networkToNetworkInterconnectName, Context context);

    /**
     * Executes list operation to display Network To Network Interconnects within a Network Fabric.
     *
     * <p>Implements Network To Network Interconnects list by Network Fabric GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricName Name of the NetworkFabric.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkToNetworkInterconnects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkToNetworkInterconnect> list(String resourceGroupName, String networkFabricName);

    /**
     * Executes list operation to display Network To Network Interconnects within a Network Fabric.
     *
     * <p>Implements Network To Network Interconnects list by Network Fabric GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricName Name of the NetworkFabric.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkToNetworkInterconnects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkToNetworkInterconnect> list(
        String resourceGroupName, String networkFabricName, Context context);

    /**
     * Configuration used to setup CE-PE connectivity.
     *
     * <p>Implements NetworkToNetworkInterconnects GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkToNetworkInterconnect resource definition along with {@link Response}.
     */
    NetworkToNetworkInterconnect getById(String id);

    /**
     * Configuration used to setup CE-PE connectivity.
     *
     * <p>Implements NetworkToNetworkInterconnects GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkToNetworkInterconnect resource definition along with {@link Response}.
     */
    Response<NetworkToNetworkInterconnect> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a NetworkToNetworkInterconnects.
     *
     * <p>Implements NetworkToNetworkInterconnects DELETE method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a NetworkToNetworkInterconnects.
     *
     * <p>Implements NetworkToNetworkInterconnects DELETE method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NetworkToNetworkInterconnect resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkToNetworkInterconnect definition.
     */
    NetworkToNetworkInterconnect.DefinitionStages.Blank define(String name);
}