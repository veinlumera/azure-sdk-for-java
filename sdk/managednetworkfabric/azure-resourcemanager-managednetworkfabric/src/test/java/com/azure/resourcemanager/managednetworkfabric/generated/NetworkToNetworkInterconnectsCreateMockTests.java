// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.Layer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnect;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkToNetworkInterconnectsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"nniType\":\"NPB\",\"administrativeState\":\"Disabled\",\"isManagementType\":\"True\",\"useOptionB\":\"True\",\"layer2Configuration\":{\"portCount\":579053482,\"mtu\":1201500013,\"interfaces\":[]},\"layer3Configuration\":{\"importRoutePolicyId\":\"yparybjufptbjc\",\"exportRoutePolicyId\":\"nciuiyqvldaswvpp\",\"peerASN\":376114868,\"vlanId\":1027588492,\"fabricASN\":1049923210,\"primaryIpv4Prefix\":\"ndhzx\",\"primaryIpv6Prefix\":\"fcfsrhkhgsnx\",\"secondaryIpv4Prefix\":\"wkpphefsb\",\"secondaryIpv6Prefix\":\"lbzxomeikjc\"},\"provisioningState\":\"Succeeded\"},\"id\":\"cnmwpfsuqtaa\",\"name\":\"yqbxyxoyf\",\"type\":\"uqqiqezxlhd\"}";

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

        NetworkToNetworkInterconnect response =
            manager
                .networkToNetworkInterconnects()
                .define("zwjiqullq")
                .withExistingNetworkFabric("baevwjcnkottl", "uhvajmailfemjjza")
                .withNniType(NniType.NPB)
                .withIsManagementType(BooleanEnumProperty.TRUE)
                .withUseOptionB(BooleanEnumProperty.TRUE)
                .withLayer2Configuration(new Layer2Configuration().withPortCount(1898735756).withMtu(977245576))
                .withLayer3Configuration(
                    new Layer3Configuration()
                        .withPrimaryIpv4Prefix("bbcbrwji")
                        .withPrimaryIpv6Prefix("gn")
                        .withSecondaryIpv4Prefix("zbeewoiymrvzbju")
                        .withSecondaryIpv6Prefix("srziuct")
                        .withImportRoutePolicyId("rnyeofltfnnxrk")
                        .withExportRoutePolicyId("jfynnfmuiiirip")
                        .withPeerAsn(1895935525)
                        .withVlanId(1531073984))
                .create();

        Assertions.assertEquals(NniType.NPB, response.nniType());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, response.isManagementType());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, response.useOptionB());
        Assertions.assertEquals(579053482, response.layer2Configuration().portCount());
        Assertions.assertEquals(1201500013, response.layer2Configuration().mtu());
        Assertions.assertEquals("ndhzx", response.layer3Configuration().primaryIpv4Prefix());
        Assertions.assertEquals("fcfsrhkhgsnx", response.layer3Configuration().primaryIpv6Prefix());
        Assertions.assertEquals("wkpphefsb", response.layer3Configuration().secondaryIpv4Prefix());
        Assertions.assertEquals("lbzxomeikjc", response.layer3Configuration().secondaryIpv6Prefix());
        Assertions.assertEquals("yparybjufptbjc", response.layer3Configuration().importRoutePolicyId());
        Assertions.assertEquals("nciuiyqvldaswvpp", response.layer3Configuration().exportRoutePolicyId());
        Assertions.assertEquals(376114868, response.layer3Configuration().peerAsn());
        Assertions.assertEquals(1027588492, response.layer3Configuration().vlanId());
    }
}