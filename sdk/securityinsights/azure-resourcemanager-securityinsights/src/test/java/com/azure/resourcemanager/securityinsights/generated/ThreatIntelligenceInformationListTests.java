// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.ThreatIntelligenceInformationInner;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceInformationList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ThreatIntelligenceInformationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreatIntelligenceInformationList model = BinaryData.fromString(
            "{\"nextLink\":\"qejpmvssehaepwa\",\"value\":[{\"kind\":\"ThreatIntelligenceInformation\",\"etag\":\"tczhupeuknijd\",\"id\":\"yespydjfbocyv\",\"name\":\"hulrtywikdmhla\",\"type\":\"uflgbhgauacdixm\"},{\"kind\":\"ThreatIntelligenceInformation\",\"etag\":\"f\",\"id\":\"ryjqgdkf\",\"name\":\"ozo\",\"type\":\"oqbvjhvefgwbmqj\"},{\"kind\":\"ThreatIntelligenceInformation\",\"etag\":\"ntasfaymxbu\",\"id\":\"zealbmqkyo\",\"name\":\"wyvf\",\"type\":\"mbtsuahxsg\"}]}")
            .toObject(ThreatIntelligenceInformationList.class);
        Assertions.assertEquals("tczhupeuknijd", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreatIntelligenceInformationList model = new ThreatIntelligenceInformationList()
            .withValue(Arrays.asList(new ThreatIntelligenceInformationInner().withEtag("tczhupeuknijd"),
                new ThreatIntelligenceInformationInner().withEtag("f"),
                new ThreatIntelligenceInformationInner().withEtag("ntasfaymxbu")));
        model = BinaryData.fromObject(model).toObject(ThreatIntelligenceInformationList.class);
        Assertions.assertEquals("tczhupeuknijd", model.value().get(0).etag());
    }
}
