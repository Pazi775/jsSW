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
 * Query for Apps.removeTestingGroup method
 */
public class AppsRemoveTestingGroupQuery extends AbstractQueryBuilder<AppsRemoveTestingGroupQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Maximum is 25. Minimum is 1. Entity - owner
     *
     */
    public AppsRemoveTestingGroupQuery(VkApiClient client, ServiceActor actor, Long groupId) {
        super(client, "apps.removeTestingGroup", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsRemoveTestingGroupQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.removeTestingGroup", BoolResponse.class);
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
    public AppsRemoveTestingGroupQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected AppsRemoveTestingGroupQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
