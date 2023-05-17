// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.ScopeNamespace;
import org.junit.jupiter.api.Assertions;

public final class ScopeNamespaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScopeNamespace model =
            BinaryData.fromString("{\"targetNamespace\":\"kdtmlxhekuk\"}").toObject(ScopeNamespace.class);
        Assertions.assertEquals("kdtmlxhekuk", model.targetNamespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScopeNamespace model = new ScopeNamespace().withTargetNamespace("kdtmlxhekuk");
        model = BinaryData.fromObject(model).toObject(ScopeNamespace.class);
        Assertions.assertEquals("kdtmlxhekuk", model.targetNamespace());
    }
}