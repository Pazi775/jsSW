// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.orders.responses.GetUserSubscriptionByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.getUserSubscriptionById method
 */
public class OrdersGetUserSubscriptionByIdQuery extends AbstractQueryBuilder<OrdersGetUserSubscriptionByIdQuery, GetUserSubscriptionByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @param subscriptionId value of "subscription id" parameter. Minimum is 0.
     */
    public OrdersGetUserSubscriptionByIdQuery(VkApiClient client, ServiceActor actor, Long userId,
            Integer subscriptionId) {
        super(client, "orders.getUserSubscriptionById", GetUserSubscriptionByIdResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userId(userId);
        subscriptionId(subscriptionId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public OrdersGetUserSubscriptionByIdQuery(VkApiClient client, ServiceActor actor) {
        super(client, "orders.getUserSubscriptionById", GetUserSubscriptionByIdResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public OrdersGetUserSubscriptionByIdQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set subscription id
     *
     * @param value value of "subscription id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("subscription_id")
    public OrdersGetUserSubscriptionByIdQuery subscriptionId(Integer value) {
        return unsafeParam("subscription_id", value);
    }

    @Override
    protected OrdersGetUserSubscriptionByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("subscription_id", "user_id", "access_token");
    }
}
