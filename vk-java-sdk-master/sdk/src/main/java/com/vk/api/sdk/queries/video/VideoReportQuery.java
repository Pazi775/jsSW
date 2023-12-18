// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.video.ReportReason;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.report method
 */
public class VideoReportQuery extends AbstractQueryBuilder<VideoReportQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoReportQuery(VkApiClient client, UserActor actor, Long ownerId, Integer videoId) {
        super(client, "video.report", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        videoId(videoId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public VideoReportQuery(VkApiClient client, UserActor actor) {
        super(client, "video.report", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public VideoReportQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("video_id")
    public VideoReportQuery videoId(Integer value) {
        return unsafeParam("video_id", value);
    }

    /**
     * Reason for the complaint: '0' - spam, '1' - child pornography, '2' - extremism, '3' - violence, '4' - drug propaganda, '5' - adult material, '6' - insult, abuse
     *
     * @param value value of "reason" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("reason")
    public VideoReportQuery reason(ReportReason value) {
        return unsafeParam("reason", value);
    }

    /**
     * Comment describing the complaint.
     *
     * @param value value of "comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("comment")
    public VideoReportQuery comment(String value) {
        return unsafeParam("comment", value);
    }

    /**
     * (If the video was found in search results.) Search query string.
     *
     * @param value value of "search query" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("search_query")
    public VideoReportQuery searchQuery(String value) {
        return unsafeParam("search_query", value);
    }

    @Override
    protected VideoReportQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "owner_id", "access_token");
    }
}
