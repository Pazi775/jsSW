// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.video.responses.GetAlbumByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getAlbumById method
 */
public class VideoGetAlbumByIdQuery extends AbstractQueryBuilder<VideoGetAlbumByIdQuery, GetAlbumByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param albumId value of "album id" parameter.
     */
    public VideoGetAlbumByIdQuery(VkApiClient client, UserActor actor, Integer albumId) {
        super(client, "video.getAlbumById", GetAlbumByIdResponse.class);
        accessToken(actor.getAccessToken());
        albumId(albumId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public VideoGetAlbumByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "video.getAlbumById", GetAlbumByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Identifier of a user or community to add a video to. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public VideoGetAlbumByIdQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Album ID.
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_id")
    public VideoGetAlbumByIdQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    @Override
    protected VideoGetAlbumByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_id", "access_token");
    }
}
