// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.addUsersToTestingGroup method
 */
public class AppsAddUsersToTestingGroupQuery extends AbstractQueryBuilder<AppsAddUsersToTestingGroupQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Maximum is 25. Minimum is 1. Entity - owner
     *
     * @param userIds value of "user ids" parameter.
     */
    public AppsAddUsersToTestingGroupQuery(VkApiClient client, ServiceActor actor, Long groupId,
            Long... userIds) {
        super(client, "apps.addUsersToTestingGroup", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Maximum is 25. Minimum is 1. Entity - owner
     *
     * @param userIds value of "user ids" parameter.
     */
    public AppsAddUsersToTestingGroupQuery(VkApiClient client, ServiceActor actor, Long groupId,
            List<Long> userIds) {
        super(client, "apps.addUsersToTestingGroup", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsAddUsersToTestingGroupQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.addUsersToTestingGroup", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Maximum is 25. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public AppsAddUsersToTestingGroupQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * userIds
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public AppsAddUsersToTestingGroupQuery userIds(Long... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public AppsAddUsersToTestingGroupQuery userIds(List<Long> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected AppsAddUsersToTestingGroupQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "user_ids", "access_token");
    }
}
