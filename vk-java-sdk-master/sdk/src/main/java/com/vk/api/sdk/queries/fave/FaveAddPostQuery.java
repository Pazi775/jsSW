// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.addPost method
 */
public class FaveAddPostQuery extends AbstractQueryBuilder<FaveAddPostQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param id value of "id" parameter.
     */
    public FaveAddPostQuery(VkApiClient client, UserActor actor, Long ownerId, Integer id) {
        super(client, "fave.addPost", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        id(id);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveAddPostQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.addPost", OkResponse.class);
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
    public FaveAddPostQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set id
     *
     * @param value value of "id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("id")
    public FaveAddPostQuery id(Integer value) {
        return unsafeParam("id", value);
    }

    /**
     * Set access key
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("access_key")
    public FaveAddPostQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    @Override
    protected FaveAddPostQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("id", "owner_id", "access_token");
    }
}
