// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.SearchResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.search method
 */
public class MessagesSearchQuery extends AbstractQueryBuilder<MessagesSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSearchQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSearchQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("q")
    public MessagesSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesSearchQuery peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Date to search message before in Unixtime.
     *
     * @param value value of "date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("date")
    public MessagesSearchQuery date(Integer value) {
        return unsafeParam("date", value);
    }

    /**
     * Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
     *
     * @param value value of "preview length" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("preview_length")
    public MessagesSearchQuery previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * Offset needed to return a specific subset of messages.
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public MessagesSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of messages to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public MessagesSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public MessagesSearchQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Group ID (for group messages with group access token)
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MessagesSearchQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesSearchQuery fields(String... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesSearchQuery fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}