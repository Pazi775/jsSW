// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.GetUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getMarketAlbumUploadServer method
 */
public class PhotosGetMarketAlbumUploadServerQuery extends AbstractQueryBuilder<PhotosGetMarketAlbumUploadServerQuery, GetUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     */
    public PhotosGetMarketAlbumUploadServerQuery(VkApiClient client, UserActor actor,
            Long groupId) {
        super(client, "photos.getMarketAlbumUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetMarketAlbumUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getMarketAlbumUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public PhotosGetMarketAlbumUploadServerQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected PhotosGetMarketAlbumUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
