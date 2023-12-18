// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.AbstractSecureQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.secure.responses.GetUserLevelResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.getUserLevel method
 */
public class SecureGetUserLevelQuery extends AbstractSecureQueryBuilder<SecureGetUserLevelQuery, List<GetUserLevelResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public SecureGetUserLevelQuery(VkApiClient client, ServiceActor actor, Long... userIds) {
        super(client, "secure.getUserLevel", Utils.buildParametrizedType(List.class, GetUserLevelResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public SecureGetUserLevelQuery(VkApiClient client, ServiceActor actor, List<Long> userIds) {
        super(client, "secure.getUserLevel", Utils.buildParametrizedType(List.class, GetUserLevelResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public SecureGetUserLevelQuery(VkApiClient client, ServiceActor actor) {
        super(client, "secure.getUserLevel", Utils.buildParametrizedType(List.class, GetUserLevelResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * userIds
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public SecureGetUserLevelQuery userIds(Long... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public SecureGetUserLevelQuery userIds(List<Long> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected SecureGetUserLevelQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_ids", "access_token");
    }
}
