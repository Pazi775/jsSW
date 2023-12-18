// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.friends.responses.AddResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.add method
 */
public class FriendsAddQuery extends AbstractQueryBuilder<FriendsAddQuery, AddResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FriendsAddQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.add", AddResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user whose friend request will be approved or to whom a friend request will be sent.
     *
     * @param value value of "user id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public FriendsAddQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Text of the message (up to 500 characters) for the friend request, if any.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("text")
    public FriendsAddQuery text(String value) {
        return unsafeParam("text", value);
    }

    /**
     * '1' to pass an incoming request to followers list.
     *
     * @param value value of "follow" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("follow")
    public FriendsAddQuery follow(Boolean value) {
        return unsafeParam("follow", value);
    }

    @Override
    protected FriendsAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}