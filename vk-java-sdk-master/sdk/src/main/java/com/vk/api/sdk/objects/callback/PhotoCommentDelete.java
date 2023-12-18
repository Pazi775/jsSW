// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * PhotoCommentDelete object
 */
public class PhotoCommentDelete implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Entity: owner
     */
    @SerializedName("owner_id")
    @Required
    private Long ownerId;

    @SerializedName("photo_id")
    @Required
    private Integer photoId;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    @Required
    private Long userId;

    public Integer getId() {
        return id;
    }

    public PhotoCommentDelete setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public PhotoCommentDelete setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public PhotoCommentDelete setPhotoId(Integer photoId) {
        this.photoId = photoId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public PhotoCommentDelete setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoId, id, ownerId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoCommentDelete photoCommentDelete = (PhotoCommentDelete) o;
        return Objects.equals(photoId, photoCommentDelete.photoId) &&
                Objects.equals(userId, photoCommentDelete.userId) &&
                Objects.equals(ownerId, photoCommentDelete.ownerId) &&
                Objects.equals(id, photoCommentDelete.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoCommentDelete{");
        sb.append("photoId=").append(photoId);
        sb.append(", userId=").append(userId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}