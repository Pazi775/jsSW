// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.GetUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getChatUploadServer method
 */
public class PhotosGetChatUploadServerQuery extends AbstractQueryBuilder<PhotosGetChatUploadServerQuery, GetUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param chatId value of "chat id" parameter. Minimum is 0.
     */
    public PhotosGetChatUploadServerQuery(VkApiClient client, GroupActor actor, Integer chatId) {
        super(client, "photos.getChatUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetChatUploadServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "photos.getChatUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param chatId value of "chat id" parameter. Minimum is 0.
     */
    public PhotosGetChatUploadServerQuery(VkApiClient client, UserActor actor, Integer chatId) {
        super(client, "photos.getChatUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetChatUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getChatUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the chat for which you want to upload a cover photo.
     *
     * @param value value of "chat id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("chat_id")
    public PhotosGetChatUploadServerQuery chatId(Integer value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * Set crop x
     *
     * @param value value of "crop x" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("crop_x")
    public PhotosGetChatUploadServerQuery cropX(Integer value) {
        return unsafeParam("crop_x", value);
    }

    /**
     * Set crop y
     *
     * @param value value of "crop y" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("crop_y")
    public PhotosGetChatUploadServerQuery cropY(Integer value) {
        return unsafeParam("crop_y", value);
    }

    /**
     * Width (in pixels) of the photo after cropping.
     *
     * @param value value of "crop width" parameter. Minimum is 200.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("crop_width")
    public PhotosGetChatUploadServerQuery cropWidth(Integer value) {
        return unsafeParam("crop_width", value);
    }

    @Override
    protected PhotosGetChatUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("chat_id", "access_token");
    }
}