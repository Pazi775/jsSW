// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.photos.responses.SaveOwnerCoverPhotoResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveOwnerCoverPhoto method
 */
public class PhotosSaveOwnerCoverPhotoQuery extends AbstractQueryBuilder<PhotosSaveOwnerCoverPhotoQuery, SaveOwnerCoverPhotoResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosSaveOwnerCoverPhotoQuery(VkApiClient client, GroupActor actor) {
        super(client, "photos.saveOwnerCoverPhoto", SaveOwnerCoverPhotoResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosSaveOwnerCoverPhotoQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.saveOwnerCoverPhoto", SaveOwnerCoverPhotoResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set crop x
     *
     * @param value value of "crop x" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("crop_x")
    public PhotosSaveOwnerCoverPhotoQuery cropX(Integer value) {
        return unsafeParam("crop_x", value);
    }

    /**
     * Set crop height
     *
     * @param value value of "crop height" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("crop_height")
    public PhotosSaveOwnerCoverPhotoQuery cropHeight(Integer value) {
        return unsafeParam("crop_height", value);
    }

    /**
     * Set crop y
     *
     * @param value value of "crop y" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("crop_y")
    public PhotosSaveOwnerCoverPhotoQuery cropY(Integer value) {
        return unsafeParam("crop_y", value);
    }

    /**
     * Set crop width
     *
     * @param value value of "crop width" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("crop_width")
    public PhotosSaveOwnerCoverPhotoQuery cropWidth(Integer value) {
        return unsafeParam("crop_width", value);
    }

    /**
     * Set response json
     *
     * @param value value of "response json" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("response_json")
    public PhotosSaveOwnerCoverPhotoQuery responseJson(String value) {
        return unsafeParam("response_json", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("hash")
    public PhotosSaveOwnerCoverPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo")
    public PhotosSaveOwnerCoverPhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Set is video cover
     *
     * @param value value of "is video cover" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("is_video_cover")
    public PhotosSaveOwnerCoverPhotoQuery isVideoCover(Boolean value) {
        return unsafeParam("is_video_cover", value);
    }

    @Override
    protected PhotosSaveOwnerCoverPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}