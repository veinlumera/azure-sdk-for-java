// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricSkuInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkFabricSku;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;

public final class NetworkFabricSkuImpl implements NetworkFabricSku {
    private NetworkFabricSkuInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    NetworkFabricSkuImpl(
        NetworkFabricSkuInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public Integer maxComputeRacks() {
        return this.innerModel().maxComputeRacks();
    }

    public String minSupportedVer() {
        return this.innerModel().minSupportedVer();
    }

    public String maxSupportedVer() {
        return this.innerModel().maxSupportedVer();
    }

    public String detailsUri() {
        return this.innerModel().detailsUri();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkFabricSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }
}