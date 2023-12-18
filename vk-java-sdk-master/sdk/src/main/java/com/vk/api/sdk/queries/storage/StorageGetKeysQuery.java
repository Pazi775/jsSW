// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.storage;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Storage.getKeys method
 */
public class StorageGetKeysQuery extends AbstractQueryBuilder<StorageGetKeysQuery, List<String>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetKeysQuery(VkApiClient client, GroupActor actor) {
        super(client, "storage.getKeys", Utils.buildParametrizedType(List.class, String.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetKeysQuery(VkApiClient client, UserActor actor) {
        super(client, "storage.getKeys", Utils.buildParametrizedType(List.class, String.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetKeysQuery(VkApiClient client, ServiceActor actor) {
        super(client, "storage.getKeys", Utils.buildParametrizedType(List.class, String.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * User id, whose variables names are returned if they were requested with a server method.
     *
     * @param value value of "user id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public StorageGetKeysQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public StorageGetKeysQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Amount of variable names the info needs to be collected from.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public StorageGetKeysQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected StorageGetKeysQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}