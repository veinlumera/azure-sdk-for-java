// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.L3IsolationDomain;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeConnectedSubnets;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeStaticRoutes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class L3IsolationDomainsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"networkFabricId\":\"ucqpqojxcxzrz\",\"disabledOnResources\":[\"dzbenri\",\"cawetzqddt\"],\"administrativeState\":\"Disabled\",\"optionBDisabledOnResources\":[\"hzn\"],\"provisioningState\":\"Canceled\",\"redistributeConnectedSubnets\":\"True\",\"redistributeStaticRoutes\":\"False\",\"aggregateRouteConfiguration\":{\"ipv4Routes\":[],\"ipv6Routes\":[]},\"description\":\"jncqtjzmi\",\"connectedSubnetRoutePolicy\":{\"exportRoutePolicyId\":\"bgatzu\",\"administrativeState\":\"Enabled\"},\"annotation\":\"ngrebwg\"},\"location\":\"httzlswvajqfutlx\",\"tags\":{\"aohcmbuocn\":\"zasunwqrjzfrgq\",\"hmbpyryxamebly\":\"r\",\"kmrocxne\":\"yvk\",\"mtodl\":\"v\"},\"id\":\"pyapucygvoav\",\"name\":\"unssxlghieegjl\",\"type\":\"vvpa\"}]}";

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

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<L3IsolationDomain> response = manager.l3IsolationDomains().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("httzlswvajqfutlx", response.iterator().next().location());
        Assertions.assertEquals("zasunwqrjzfrgq", response.iterator().next().tags().get("aohcmbuocn"));
        Assertions.assertEquals("ucqpqojxcxzrz", response.iterator().next().networkFabricId());
        Assertions
            .assertEquals(RedistributeConnectedSubnets.TRUE, response.iterator().next().redistributeConnectedSubnets());
        Assertions.assertEquals(RedistributeStaticRoutes.FALSE, response.iterator().next().redistributeStaticRoutes());
        Assertions.assertEquals("jncqtjzmi", response.iterator().next().description());
        Assertions
            .assertEquals("bgatzu", response.iterator().next().connectedSubnetRoutePolicy().exportRoutePolicyId());
        Assertions.assertEquals("ngrebwg", response.iterator().next().annotation());
    }
}