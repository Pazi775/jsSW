// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * VideoAlbum object
 */
public class VideoAlbum implements Validable {
    /**
     * Album ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Album owner's ID
     * Entity: owner
     */
    @SerializedName("owner_id")
    @Required
    private Long ownerId;

    @SerializedName("response_type")
    private VideoAlbumResponseType responseType;

    /**
     * Album title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Album trackcode
     */
    @SerializedName("track_code")
    private String trackCode;

    public Integer getId() {
        return id;
    }

    public VideoAlbum setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public VideoAlbum setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public VideoAlbumResponseType getResponseType() {
        return responseType;
    }

    public VideoAlbum setResponseType(VideoAlbumResponseType responseType) {
        this.responseType = responseType;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public VideoAlbum setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public VideoAlbum setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackCode, responseType, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoAlbum videoAlbum = (VideoAlbum) o;
        return Objects.equals(ownerId, videoAlbum.ownerId) &&
                Objects.equals(responseType, videoAlbum.responseType) &&
                Objects.equals(trackCode, videoAlbum.trackCode) &&
                Objects.equals(id, videoAlbum.id) &&
                Objects.equals(title, videoAlbum.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoAlbum{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", responseType='").append(responseType).append("'");
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}