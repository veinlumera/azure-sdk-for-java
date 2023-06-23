// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupFindRestorableTimeRangesResponseResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesResponse;
import com.azure.resourcemanager.dataprotection.models.RestorableTimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupFindRestorableTimeRangesResponseResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupFindRestorableTimeRangesResponseResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"restorableTimeRanges\":[{\"startTime\":\"zjuzgwyz\",\"endTime\":\"htxongmtsavjc\",\"objectType\":\"wxqpsrknftguvri\"},{\"startTime\":\"hprwmdyv\",\"endTime\":\"qtayri\",\"objectType\":\"ro\"},{\"startTime\":\"qbex\",\"endTime\":\"mcqibycnojv\",\"objectType\":\"mefqsgzvahapjyzh\"},{\"startTime\":\"vgqzcjrvxd\",\"endTime\":\"zlmwlxkvugfhz\",\"objectType\":\"awjvzunluthnnp\"}],\"objectType\":\"xipeilpjzuaejx\"},\"id\":\"ltskzbbtd\",\"name\":\"umveekgpwozuhkf\",\"type\":\"bsjyofdx\"}")
                .toObject(AzureBackupFindRestorableTimeRangesResponseResourceInner.class);
        Assertions.assertEquals("zjuzgwyz", model.properties().restorableTimeRanges().get(0).startTime());
        Assertions.assertEquals("htxongmtsavjc", model.properties().restorableTimeRanges().get(0).endTime());
        Assertions.assertEquals("wxqpsrknftguvri", model.properties().restorableTimeRanges().get(0).objectType());
        Assertions.assertEquals("xipeilpjzuaejx", model.properties().objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupFindRestorableTimeRangesResponseResourceInner model =
            new AzureBackupFindRestorableTimeRangesResponseResourceInner()
                .withProperties(
                    new AzureBackupFindRestorableTimeRangesResponse()
                        .withRestorableTimeRanges(
                            Arrays
                                .asList(
                                    new RestorableTimeRange()
                                        .withStartTime("zjuzgwyz")
                                        .withEndTime("htxongmtsavjc")
                                        .withObjectType("wxqpsrknftguvri"),
                                    new RestorableTimeRange()
                                        .withStartTime("hprwmdyv")
                                        .withEndTime("qtayri")
                                        .withObjectType("ro"),
                                    new RestorableTimeRange()
                                        .withStartTime("qbex")
                                        .withEndTime("mcqibycnojv")
                                        .withObjectType("mefqsgzvahapjyzh"),
                                    new RestorableTimeRange()
                                        .withStartTime("vgqzcjrvxd")
                                        .withEndTime("zlmwlxkvugfhz")
                                        .withObjectType("awjvzunluthnnp")))
                        .withObjectType("xipeilpjzuaejx"));
        model = BinaryData.fromObject(model).toObject(AzureBackupFindRestorableTimeRangesResponseResourceInner.class);
        Assertions.assertEquals("zjuzgwyz", model.properties().restorableTimeRanges().get(0).startTime());
        Assertions.assertEquals("htxongmtsavjc", model.properties().restorableTimeRanges().get(0).endTime());
        Assertions.assertEquals("wxqpsrknftguvri", model.properties().restorableTimeRanges().get(0).objectType());
        Assertions.assertEquals("xipeilpjzuaejx", model.properties().objectType());
    }
}