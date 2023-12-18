// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;
import java.util.Objects;

/**
 * GroupChangePhoto object
 */
public class GroupChangePhoto implements Validable {
    @SerializedName("photo")
    @Required
    private Photo photo;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    @Required
    private Long userId;

    public Photo getPhoto() {
        return photo;
    }

    public GroupChangePhoto setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public GroupChangePhoto setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupChangePhoto groupChangePhoto = (GroupChangePhoto) o;
        return Objects.equals(userId, groupChangePhoto.userId) &&
                Objects.equals(photo, groupChangePhoto.photo);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupChangePhoto{");
        sb.append("userId=").append(userId);
        sb.append(", photo=").append(photo);
        sb.append('}');
        return sb.toString();
    }
}