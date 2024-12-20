// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.advisor.fluent.models.MetadataEntityProperties;
import com.azure.resourcemanager.advisor.models.MetadataSupportedValueDetail;
import com.azure.resourcemanager.advisor.models.Scenario;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MetadataEntityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetadataEntityProperties model = BinaryData.fromString(
            "{\"displayName\":\"qglhq\",\"dependsOn\":[\"foooj\"],\"applicableScenarios\":[\"Alerts\",\"Alerts\",\"Alerts\",\"Alerts\"],\"supportedValues\":[{\"id\":\"gdf\",\"displayName\":\"lzl\"},{\"id\":\"xrifkwmrvkts\",\"displayName\":\"nt\"}]}")
            .toObject(MetadataEntityProperties.class);
        Assertions.assertEquals("qglhq", model.displayName());
        Assertions.assertEquals("foooj", model.dependsOn().get(0));
        Assertions.assertEquals(Scenario.ALERTS, model.applicableScenarios().get(0));
        Assertions.assertEquals("gdf", model.supportedValues().get(0).id());
        Assertions.assertEquals("lzl", model.supportedValues().get(0).displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetadataEntityProperties model = new MetadataEntityProperties().withDisplayName("qglhq")
            .withDependsOn(Arrays.asList("foooj"))
            .withApplicableScenarios(Arrays.asList(Scenario.ALERTS, Scenario.ALERTS, Scenario.ALERTS, Scenario.ALERTS))
            .withSupportedValues(Arrays.asList(new MetadataSupportedValueDetail().withId("gdf").withDisplayName("lzl"),
                new MetadataSupportedValueDetail().withId("xrifkwmrvkts").withDisplayName("nt")));
        model = BinaryData.fromObject(model).toObject(MetadataEntityProperties.class);
        Assertions.assertEquals("qglhq", model.displayName());
        Assertions.assertEquals("foooj", model.dependsOn().get(0));
        Assertions.assertEquals(Scenario.ALERTS, model.applicableScenarios().get(0));
        Assertions.assertEquals("gdf", model.supportedValues().get(0).id());
        Assertions.assertEquals("lzl", model.supportedValues().get(0).displayName());
    }
}
