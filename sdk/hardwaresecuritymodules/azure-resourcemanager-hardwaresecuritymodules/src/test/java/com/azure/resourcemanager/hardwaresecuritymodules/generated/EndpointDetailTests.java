// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hardwaresecuritymodules.models.EndpointDetail;
import org.junit.jupiter.api.Assertions;

public final class EndpointDetailTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointDetail model = BinaryData
            .fromString(
                "{\"ipAddress\":\"nedgfbc\",\"port\":720554896,\"protocol\":\"q\",\"description\":\"keqdcvdrhvoods\"}")
            .toObject(EndpointDetail.class);
        Assertions.assertEquals("nedgfbc", model.ipAddress());
        Assertions.assertEquals(720554896, model.port());
        Assertions.assertEquals("q", model.protocol());
        Assertions.assertEquals("keqdcvdrhvoods", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointDetail model = new EndpointDetail().withIpAddress("nedgfbc")
            .withPort(720554896)
            .withProtocol("q")
            .withDescription("keqdcvdrhvoods");
        model = BinaryData.fromObject(model).toObject(EndpointDetail.class);
        Assertions.assertEquals("nedgfbc", model.ipAddress());
        Assertions.assertEquals(720554896, model.port());
        Assertions.assertEquals("q", model.protocol());
        Assertions.assertEquals("keqdcvdrhvoods", model.description());
    }
}
