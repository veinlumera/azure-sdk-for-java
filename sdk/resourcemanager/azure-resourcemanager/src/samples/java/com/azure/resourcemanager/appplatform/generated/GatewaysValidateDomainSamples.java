// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.models.CustomDomainValidatePayload;

/** Samples for Gateways ValidateDomain. */
public final class GatewaysValidateDomainSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/Gateways_ValidateDomain.json
     */
    /**
     * Sample code: Gateways_ValidateDomain.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gatewaysValidateDomain(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getGateways()
            .validateDomainWithResponse(
                "myResourceGroup",
                "myservice",
                "default",
                new CustomDomainValidatePayload().withName("mydomain.io"),
                Context.NONE);
    }
}