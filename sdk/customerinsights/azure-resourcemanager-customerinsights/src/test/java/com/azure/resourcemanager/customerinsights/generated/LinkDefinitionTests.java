// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.fluent.models.LinkDefinition;
import com.azure.resourcemanager.customerinsights.models.EntityType;
import com.azure.resourcemanager.customerinsights.models.InstanceOperationType;
import com.azure.resourcemanager.customerinsights.models.LinkTypes;
import com.azure.resourcemanager.customerinsights.models.ParticipantPropertyReference;
import com.azure.resourcemanager.customerinsights.models.TypePropertiesMapping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LinkDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinkDefinition model = BinaryData.fromString(
            "{\"tenantId\":\"sm\",\"linkName\":\"dlfp\",\"sourceEntityType\":\"Profile\",\"targetEntityType\":\"Relationship\",\"sourceEntityTypeName\":\"ucygvo\",\"targetEntityTypeName\":\"vyuns\",\"displayName\":{\"jlgvvpase\":\"ghiee\",\"xantuygdhg\":\"sgb\",\"iwrqofulopmjnl\":\"qipir\",\"hcbjpibk\":\"x\"},\"description\":{\"oyin\":\"uuuercta\"},\"mappings\":[{\"sourcePropertyName\":\"brlc\",\"targetPropertyName\":\"rduczkgofxyfs\",\"linkType\":\"UpdateAlways\"},{\"sourcePropertyName\":\"vcrrpcj\",\"targetPropertyName\":\"tbstvjeaqnrmv\",\"linkType\":\"UpdateAlways\"},{\"sourcePropertyName\":\"oxmlghktuidv\",\"targetPropertyName\":\"ma\",\"linkType\":\"CopyIfNull\"},{\"sourcePropertyName\":\"dwwexymz\",\"targetPropertyName\":\"lazipbhpwvq\",\"linkType\":\"UpdateAlways\"}],\"participantPropertyReferences\":[{\"sourcePropertyName\":\"yuuzivens\",\"targetPropertyName\":\"pmeyyvpkpatlbijp\"}],\"provisioningState\":\"HumanIntervention\",\"referenceOnly\":false,\"operationType\":\"Upsert\"}")
            .toObject(LinkDefinition.class);
        Assertions.assertEquals(EntityType.PROFILE, model.sourceEntityType());
        Assertions.assertEquals(EntityType.RELATIONSHIP, model.targetEntityType());
        Assertions.assertEquals("ucygvo", model.sourceEntityTypeName());
        Assertions.assertEquals("vyuns", model.targetEntityTypeName());
        Assertions.assertEquals("ghiee", model.displayName().get("jlgvvpase"));
        Assertions.assertEquals("uuuercta", model.description().get("oyin"));
        Assertions.assertEquals("brlc", model.mappings().get(0).sourcePropertyName());
        Assertions.assertEquals("rduczkgofxyfs", model.mappings().get(0).targetPropertyName());
        Assertions.assertEquals(LinkTypes.UPDATE_ALWAYS, model.mappings().get(0).linkType());
        Assertions.assertEquals("yuuzivens", model.participantPropertyReferences().get(0).sourcePropertyName());
        Assertions.assertEquals("pmeyyvpkpatlbijp", model.participantPropertyReferences().get(0).targetPropertyName());
        Assertions.assertEquals(false, model.referenceOnly());
        Assertions.assertEquals(InstanceOperationType.UPSERT, model.operationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinkDefinition model = new LinkDefinition().withSourceEntityType(EntityType.PROFILE)
            .withTargetEntityType(EntityType.RELATIONSHIP)
            .withSourceEntityTypeName("ucygvo")
            .withTargetEntityTypeName("vyuns")
            .withDisplayName(
                mapOf("jlgvvpase", "ghiee", "xantuygdhg", "sgb", "iwrqofulopmjnl", "qipir", "hcbjpibk", "x"))
            .withDescription(mapOf("oyin", "uuuercta"))
            .withMappings(Arrays.asList(
                new TypePropertiesMapping().withSourcePropertyName("brlc")
                    .withTargetPropertyName("rduczkgofxyfs")
                    .withLinkType(LinkTypes.UPDATE_ALWAYS),
                new TypePropertiesMapping().withSourcePropertyName("vcrrpcj")
                    .withTargetPropertyName("tbstvjeaqnrmv")
                    .withLinkType(LinkTypes.UPDATE_ALWAYS),
                new TypePropertiesMapping().withSourcePropertyName("oxmlghktuidv")
                    .withTargetPropertyName("ma")
                    .withLinkType(LinkTypes.COPY_IF_NULL),
                new TypePropertiesMapping().withSourcePropertyName("dwwexymz")
                    .withTargetPropertyName("lazipbhpwvq")
                    .withLinkType(LinkTypes.UPDATE_ALWAYS)))
            .withParticipantPropertyReferences(
                Arrays.asList(new ParticipantPropertyReference().withSourcePropertyName("yuuzivens")
                    .withTargetPropertyName("pmeyyvpkpatlbijp")))
            .withReferenceOnly(false)
            .withOperationType(InstanceOperationType.UPSERT);
        model = BinaryData.fromObject(model).toObject(LinkDefinition.class);
        Assertions.assertEquals(EntityType.PROFILE, model.sourceEntityType());
        Assertions.assertEquals(EntityType.RELATIONSHIP, model.targetEntityType());
        Assertions.assertEquals("ucygvo", model.sourceEntityTypeName());
        Assertions.assertEquals("vyuns", model.targetEntityTypeName());
        Assertions.assertEquals("ghiee", model.displayName().get("jlgvvpase"));
        Assertions.assertEquals("uuuercta", model.description().get("oyin"));
        Assertions.assertEquals("brlc", model.mappings().get(0).sourcePropertyName());
        Assertions.assertEquals("rduczkgofxyfs", model.mappings().get(0).targetPropertyName());
        Assertions.assertEquals(LinkTypes.UPDATE_ALWAYS, model.mappings().get(0).linkType());
        Assertions.assertEquals("yuuzivens", model.participantPropertyReferences().get(0).sourcePropertyName());
        Assertions.assertEquals("pmeyyvpkpatlbijp", model.participantPropertyReferences().get(0).targetPropertyName());
        Assertions.assertEquals(false, model.referenceOnly());
        Assertions.assertEquals(InstanceOperationType.UPSERT, model.operationType());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
