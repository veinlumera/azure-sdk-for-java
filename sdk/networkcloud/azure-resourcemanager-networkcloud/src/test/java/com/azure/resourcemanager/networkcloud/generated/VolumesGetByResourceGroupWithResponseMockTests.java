// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.Volume;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VolumesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"extendedLocation\":{\"name\":\"gyrihlgm\",\"type\":\"behlqtxnr\"},\"properties\":{\"attachedTo\":[\"ndrndpgf\",\"odhda\",\"otwfhipxwgsab\"],\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"owzafczu\",\"provisioningState\":\"Provisioning\",\"serialNumber\":\"cirvpefycdveit\",\"sizeMiB\":4774029532863155475},\"location\":\"s\",\"tags\":{\"wjuyxx\":\"jlnsj\",\"uadx\":\"xqvmvuay\",\"tghyksarcdr\":\"xeqbwp\",\"vlzladl\":\"xsl\"},\"id\":\"x\",\"name\":\"pbqhvfdqqjwkr\",\"type\":\"wzdanojisgglmvo\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Volume response =
            manager
                .volumes()
                .getByResourceGroupWithResponse("xdncaqtt", "ekoifuvnyttzgi", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("s", response.location());
        Assertions.assertEquals("jlnsj", response.tags().get("wjuyxx"));
        Assertions.assertEquals("gyrihlgm", response.extendedLocation().name());
        Assertions.assertEquals("behlqtxnr", response.extendedLocation().type());
        Assertions.assertEquals(4774029532863155475L, response.sizeMiB());
    }
}