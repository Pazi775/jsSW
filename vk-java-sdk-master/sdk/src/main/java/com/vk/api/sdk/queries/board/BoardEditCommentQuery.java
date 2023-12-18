// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Board.editComment method
 */
public class BoardEditCommentQuery extends AbstractQueryBuilder<BoardEditCommentQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param topicId value of "topic id" parameter. Minimum is 0.
     * @param commentId value of "comment id" parameter. Minimum is 0.
     */
    public BoardEditCommentQuery(VkApiClient client, UserActor actor, Long groupId, Integer topicId,
            Integer commentId) {
        super(client, "board.editComment", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        topicId(topicId);
        commentId(commentId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public BoardEditCommentQuery(VkApiClient client, UserActor actor) {
        super(client, "board.editComment", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the community that owns the discussion board.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public BoardEditCommentQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Topic ID.
     *
     * @param value value of "topic id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("topic_id")
    public BoardEditCommentQuery topicId(Integer value) {
        return unsafeParam("topic_id", value);
    }

    /**
     * ID of the comment on the topic.
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("comment_id")
    public BoardEditCommentQuery commentId(Integer value) {
        return unsafeParam("comment_id", value);
    }

    /**
     * (Required if 'attachments' is not set). New comment text.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message")
    public BoardEditCommentQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * attachments
     * (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", ' - Type of media object: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media owner. '<media_id>' - Media ID. Example: "photo100172_166443618,photo66748_265827614"
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("attachments")
    public BoardEditCommentQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", ' - Type of media object: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media owner. '<media_id>' - Media ID. Example: "photo100172_166443618,photo66748_265827614"
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("attachments")
    public BoardEditCommentQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    @Override
    protected BoardEditCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "topic_id", "comment_id", "access_token");
    }
}