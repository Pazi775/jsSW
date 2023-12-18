// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.storage;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Storage.set method
 */
public class StorageSetQuery extends AbstractQueryBuilder<StorageSetQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param key value of "key" parameter.
     */
    public StorageSetQuery(VkApiClient client, GroupActor actor, String key) {
        super(client, "storage.set", OkResponse.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageSetQuery(VkApiClient client, GroupActor actor) {
        super(client, "storage.set", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param key value of "key" parameter.
     */
    public StorageSetQuery(VkApiClient client, UserActor actor, String key) {
        super(client, "storage.set", OkResponse.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageSetQuery(VkApiClient client, UserActor actor) {
        super(client, "storage.set", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param key value of "key" parameter.
     */
    public StorageSetQuery(VkApiClient client, ServiceActor actor, String key) {
        super(client, "storage.set", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        key(key);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageSetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "storage.set", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set key
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("key")
    public StorageSetQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Set value
     *
     * @param value value of "value" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("value")
    public StorageSetQuery value(String value) {
        return unsafeParam("value", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public StorageSetQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected StorageSetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("key", "access_token");
    }
}
