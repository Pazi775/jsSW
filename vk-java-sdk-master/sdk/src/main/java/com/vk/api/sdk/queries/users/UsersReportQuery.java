// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.users.ReportType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Users.report method
 */
public class UsersReportQuery extends AbstractQueryBuilder<UsersReportQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @param type value of "type" parameter.
     */
    public UsersReportQuery(VkApiClient client, UserActor actor, Long userId, ReportType type) {
        super(client, "users.report", OkResponse.class);
        accessToken(actor.getAccessToken());
        userId(userId);
        type(type);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public UsersReportQuery(VkApiClient client, UserActor actor) {
        super(client, "users.report", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user about whom a complaint is being made.
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public UsersReportQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Type of complaint: 'porn' - pornography, 'spam' - spamming, 'insult' - abusive behavior, 'advertisement' - disruptive advertisements
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("type")
    public UsersReportQuery type(ReportType value) {
        return unsafeParam("type", value);
    }

    /**
     * Comment describing the complaint.
     *
     * @param value value of "comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("comment")
    public UsersReportQuery comment(String value) {
        return unsafeParam("comment", value);
    }

    @Override
    protected UsersReportQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type", "user_id", "access_token");
    }
}