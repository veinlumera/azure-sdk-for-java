// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.RegionsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.RegionContractInner;
import com.azure.resourcemanager.apimanagement.models.RegionContract;
import com.azure.resourcemanager.apimanagement.models.Regions;

public final class RegionsImpl implements Regions {
    private static final ClientLogger LOGGER = new ClientLogger(RegionsImpl.class);

    private final RegionsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public RegionsImpl(RegionsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RegionContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<RegionContractInner> inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RegionContractImpl(inner1, this.manager()));
    }

    public PagedIterable<RegionContract> listByService(String resourceGroupName, String serviceName, Context context) {
        PagedIterable<RegionContractInner> inner
            = this.serviceClient().listByService(resourceGroupName, serviceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RegionContractImpl(inner1, this.manager()));
    }

    private RegionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
