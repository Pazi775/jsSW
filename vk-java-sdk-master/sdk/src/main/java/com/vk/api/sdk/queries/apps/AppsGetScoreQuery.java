// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getScore method
 */
public class AppsGetScoreQuery extends AbstractQueryBuilder<AppsGetScoreQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsGetScoreQuery(VkApiClient client, UserActor actor) {
        super(client, "apps.getScore", Integer.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public AppsGetScoreQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected AppsGetScoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}