// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.donut;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Donut.isDon method
 */
public class DonutIsDonQuery extends AbstractQueryBuilder<DonutIsDonQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     */
    public DonutIsDonQuery(VkApiClient client, UserActor actor, Long ownerId) {
        super(client, "donut.isDon", BoolResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DonutIsDonQuery(VkApiClient client, UserActor actor) {
        super(client, "donut.isDon", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public DonutIsDonQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected DonutIsDonQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}