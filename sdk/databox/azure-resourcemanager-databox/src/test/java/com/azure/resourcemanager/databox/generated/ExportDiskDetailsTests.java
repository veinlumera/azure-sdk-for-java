// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.ExportDiskDetails;

public final class ExportDiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExportDiskDetails model =
            BinaryData
                .fromString(
                    "{\"manifestFile\":\"hsd\",\"manifestHash\":\"t\",\"backupManifestCloudPath\":\"fikdowwqu\"}")
                .toObject(ExportDiskDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExportDiskDetails model = new ExportDiskDetails();
        model = BinaryData.fromObject(model).toObject(ExportDiskDetails.class);
    }
}