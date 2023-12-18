// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.deleteList method
 */
public class NewsfeedDeleteListQuery extends AbstractQueryBuilder<NewsfeedDeleteListQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param listId value of "list id" parameter. Minimum is 0.
     */
    public NewsfeedDeleteListQuery(VkApiClient client, UserActor actor, Integer listId) {
        super(client, "newsfeed.deleteList", OkResponse.class);
        accessToken(actor.getAccessToken());
        listId(listId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public NewsfeedDeleteListQuery(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.deleteList", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set list id
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("list_id")
    public NewsfeedDeleteListQuery listId(Integer value) {
        return unsafeParam("list_id", value);
    }

    @Override
    protected NewsfeedDeleteListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("list_id", "access_token");
    }
}
