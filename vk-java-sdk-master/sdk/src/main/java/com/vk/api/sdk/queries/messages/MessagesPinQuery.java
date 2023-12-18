// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.PinResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.pin method
 */
public class MessagesPinQuery extends AbstractQueryBuilder<MessagesPinQuery, PinResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter.
     */
    public MessagesPinQuery(VkApiClient client, GroupActor actor, Long peerId) {
        super(client, "messages.pin", PinResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesPinQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.pin", PinResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter.
     */
    public MessagesPinQuery(VkApiClient client, UserActor actor, Long peerId) {
        super(client, "messages.pin", PinResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesPinQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.pin", PinResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesPinQuery peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Message ID
     *
     * @param value value of "message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message_id")
    public MessagesPinQuery messageId(Integer value) {
        return unsafeParam("message_id", value);
    }

    /**
     * Conversation message ID
     *
     * @param value value of "cmid" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmid")
    public MessagesPinQuery cmid(Integer value) {
        return unsafeParam("cmid", value);
    }

    @Override
    protected MessagesPinQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token");
    }
}