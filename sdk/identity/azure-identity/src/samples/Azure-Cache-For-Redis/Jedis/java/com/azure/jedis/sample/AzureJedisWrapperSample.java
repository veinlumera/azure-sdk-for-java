// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.jedis.sample;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.jedis.AzureJedisClientBuilder;
import redis.clients.jedis.Jedis;

/**
 * Sample of a simple Azure Jedis wrapper.
 */
public class AzureJedisWrapperSample {
    /**
     * The runnable sample.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {

        //Construct a Token Credential from Identity library, e.g. DefaultAzureCredential / ClientSecretCredential / Client CertificateCredential / ManagedIdentityCredential etc.
        DefaultAzureCredential defaultAzureCredential = new DefaultAzureCredentialBuilder().build();

        // Create Jedis Client using the builder as follows.
        Jedis jedisClient = new AzureJedisClientBuilder()
            .cacheHostName("<HOST_NAME>") // TODO: Replace <HOST_NAME> with Azure Cache for Redis Host name.
            .port(6380) // Port is requried.
            .useSSL(true) // SSL Connection is required.
            .credential(defaultAzureCredential) // A Token Credential is required to fetch Microsoft Entra access tokens.
            .buildClient();

        // Set a value against your key in the Redis cache.
        jedisClient.set("Az:key", "sample");
        System.out.println(jedisClient.get("Az:key"));

        // Close the Jedis Client
        jedisClient.close();
    }
}
