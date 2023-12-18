// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.invite method
 */
public class GroupsInviteQuery extends AbstractQueryBuilder<GroupsInviteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     */
    public GroupsInviteQuery(VkApiClient client, UserActor actor, Long groupId) {
        super(client, "groups.invite", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsInviteQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.invite", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public GroupsInviteQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public GroupsInviteQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * userIdsList
     * User IDs.
     *
     * @param value value of "user ids list" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids_list")
    public GroupsInviteQuery userIdsList(Long... value) {
        return unsafeParam("user_ids_list", value);
    }

    /**
     * User IDs.
     *
     * @param value value of "user ids list" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids_list")
    public GroupsInviteQuery userIdsList(List<Long> value) {
        return unsafeParam("user_ids_list", value);
    }

    @Override
    protected GroupsInviteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}