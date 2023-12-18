// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.DeleteFullResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.delete method
 */
public class MessagesDeleteQueryWithFull extends AbstractQueryBuilder<MessagesDeleteQueryWithFull, List<DeleteFullResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesDeleteQueryWithFull(VkApiClient client, GroupActor actor) {
        super(client, "messages.delete", Utils.buildParametrizedType(List.class, DeleteFullResponse.class));
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesDeleteQueryWithFull(VkApiClient client, UserActor actor) {
        super(client, "messages.delete", Utils.buildParametrizedType(List.class, DeleteFullResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * '1' - to mark message as spam.
     *
     * @param value value of "spam" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("spam")
    public MessagesDeleteQueryWithFull spam(Boolean value) {
        return unsafeParam("spam", value);
    }

    /**
     * Group ID (for group messages with user access token)
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MessagesDeleteQueryWithFull groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * '1' - delete message for for all.
     *
     * @param value value of "delete for all" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("delete_for_all")
    public MessagesDeleteQueryWithFull deleteForAll(Boolean value) {
        return unsafeParam("delete_for_all", value);
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesDeleteQueryWithFull peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * messageIds
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message_ids")
    public MessagesDeleteQueryWithFull messageIds(Integer... value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message_ids")
    public MessagesDeleteQueryWithFull messageIds(List<Integer> value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * cmids
     * Conversation message IDs.
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesDeleteQueryWithFull cmids(Integer... value) {
        return unsafeParam("cmids", value);
    }

    /**
     * Conversation message IDs.
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesDeleteQueryWithFull cmids(List<Integer> value) {
        return unsafeParam("cmids", value);
    }

    @Override
    protected MessagesDeleteQueryWithFull getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
