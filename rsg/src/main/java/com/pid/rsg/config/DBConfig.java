package com.pid.rsg.config;

import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosContainer;
import com.azure.cosmos.CosmosDatabase;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class DBConfig {
    private CosmosDatabase database;
    private CosmosClient client;
    private BlobServiceClient serviceClient;

    public DBConfig( String uri, String key,
                                String dbName,String connectionString) {
        log.info("Cosmos Config started----");
        client = new CosmosClientBuilder().endpoint(uri).key(key).buildClient();
        database = client.getDatabase(dbName);
        serviceClient = new BlobServiceClientBuilder().connectionString(connectionString)
                .buildClient();
    }

    public CosmosContainer getCosmosContainer(String containerName) {

        return database.getContainer(containerName);
    }

    public BlobContainerClient getContainerClient(String containerName) {
        return serviceClient.getBlobContainerClient(containerName);
    }
}
