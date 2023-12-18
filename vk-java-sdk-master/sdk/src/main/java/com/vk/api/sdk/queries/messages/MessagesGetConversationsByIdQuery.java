// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.messages.responses.GetConversationsByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getConversationsById method
 */
public class MessagesGetConversationsByIdQuery extends AbstractQueryBuilder<MessagesGetConversationsByIdQuery, GetConversationsByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerIds value of "peer ids" parameter.
     */
    public MessagesGetConversationsByIdQuery(VkApiClient client, GroupActor actor,
            Long... peerIds) {
        super(client, "messages.getConversationsById", GetConversationsByIdResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        peerIds(peerIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerIds value of "peer ids" parameter.
     */
    public MessagesGetConversationsByIdQuery(VkApiClient client, GroupActor actor,
            List<Long> peerIds) {
        super(client, "messages.getConversationsById", GetConversationsByIdResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        peerIds(peerIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetConversationsByIdQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getConversationsById", GetConversationsByIdResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerIds value of "peer ids" parameter.
     */
    public MessagesGetConversationsByIdQuery(VkApiClient client, UserActor actor, Long... peerIds) {
        super(client, "messages.getConversationsById", GetConversationsByIdResponse.class);
        accessToken(actor.getAccessToken());
        peerIds(peerIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerIds value of "peer ids" parameter.
     */
    public MessagesGetConversationsByIdQuery(VkApiClient client, UserActor actor,
            List<Long> peerIds) {
        super(client, "messages.getConversationsById", GetConversationsByIdResponse.class);
        accessToken(actor.getAccessToken());
        peerIds(peerIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetConversationsByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getConversationsById", GetConversationsByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Return extended properties
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public MessagesGetConversationsByIdQuery extended(Boolean value) {
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
    public MessagesGetConversationsByIdQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * peerIds
     * Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     *
     * @param value value of "peer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_ids")
    public MessagesGetConversationsByIdQuery peerIds(Long... value) {
        return unsafeParam("peer_ids", value);
    }

    /**
     * Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     *
     * @param value value of "peer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_ids")
    public MessagesGetConversationsByIdQuery peerIds(List<Long> value) {
        return unsafeParam("peer_ids", value);
    }

    /**
     * fields
     * Profile and communities fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesGetConversationsByIdQuery fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile and communities fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesGetConversationsByIdQuery fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesGetConversationsByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_ids", "access_token");
    }
}
