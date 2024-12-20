// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager;
import com.azure.resourcemanager.timeseriesinsights.models.EventSourceCreateOrUpdateParameters;
import com.azure.resourcemanager.timeseriesinsights.models.EventSourceResource;
import com.azure.resourcemanager.timeseriesinsights.models.LocalTimestamp;
import com.azure.resourcemanager.timeseriesinsights.models.LocalTimestampFormat;
import com.azure.resourcemanager.timeseriesinsights.models.LocalTimestampTimeZoneOffset;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class EventSourcesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"kind\":\"EventSourceResource\",\"location\":\"uu\",\"tags\":{\"fpubjibwwi\":\"qkacewii\"},\"id\":\"tohqkvpuvksgp\",\"name\":\"saknynfsyn\",\"type\":\"jphuopxodlqi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        TimeSeriesInsightsManager manager = TimeSeriesInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        EventSourceResource response = manager.eventSources()
            .createOrUpdateWithResponse("kcnqxwbpo", "ulpiuj", "aasipqi",
                new EventSourceCreateOrUpdateParameters().withLocation("dbutauvfbtkuwhh")
                    .withTags(mapOf("joxafnndlpi", "k", "kpw", "hkoymkcdyhbp", "jxywsuws", "reqnovvqfov",
                        "aeneqnzarrwl", "rsndsytgadgvra"))
                    .withLocalTimestamp(new LocalTimestamp().withFormat(LocalTimestampFormat.EMBEDDED)
                        .withTimeZoneOffset(new LocalTimestampTimeZoneOffset().withPropertyName("erpqlpqwcciuqg"))),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("uu", response.location());
        Assertions.assertEquals("qkacewii", response.tags().get("fpubjibwwi"));
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
