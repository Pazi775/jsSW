// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * GetTagsResponse object
 */
public class GetTagsResponse implements Validable {
    /**
     * Date when tag has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Tagged description.
     */
    @SerializedName("description")
    private String description;

    /**
     * Tag ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * ID of the tag creator
     */
    @SerializedName("placer_id")
    @Required
    private Integer placerId;

    /**
     * Tag description
     */
    @SerializedName("tagged_name")
    @Required
    private String taggedName;

    /**
     * Tagged user ID
     * Entity: owner
     */
    @SerializedName("user_id")
    @Required
    private Long userId;

    /**
     * Information whether the tag is reviewed
     */
    @SerializedName("viewed")
    @Required
    private BoolInt viewed;

    /**
     * Coordinate X of the left upper corner
     */
    @SerializedName("x")
    @Required
    private Number x;

    /**
     * Coordinate X of the right lower corner
     */
    @SerializedName("x2")
    @Required
    private Number x2;

    /**
     * Coordinate Y of the left upper corner
     */
    @SerializedName("y")
    @Required
    private Number y;

    /**
     * Coordinate Y of the right lower corner
     */
    @SerializedName("y2")
    @Required
    private Number y2;

    public Integer getDate() {
        return date;
    }

    public GetTagsResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetTagsResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetTagsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPlacerId() {
        return placerId;
    }

    public GetTagsResponse setPlacerId(Integer placerId) {
        this.placerId = placerId;
        return this;
    }

    public String getTaggedName() {
        return taggedName;
    }

    public GetTagsResponse setTaggedName(String taggedName) {
        this.taggedName = taggedName;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public GetTagsResponse setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public boolean isViewed() {
        return viewed == BoolInt.YES;
    }

    public BoolInt getViewed() {
        return viewed;
    }

    public Number getX() {
        return x;
    }

    public GetTagsResponse setX(Number x) {
        this.x = x;
        return this;
    }

    public Number getX2() {
        return x2;
    }

    public GetTagsResponse setX2(Number x2) {
        this.x2 = x2;
        return this;
    }

    public Number getY() {
        return y;
    }

    public GetTagsResponse setY(Number y) {
        this.y = y;
        return this;
    }

    public Number getY2() {
        return y2;
    }

    public GetTagsResponse setY2(Number y2) {
        this.y2 = y2;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, viewed, taggedName, x, description, y, y2, x2, id, placerId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTagsResponse getTagsResponse = (GetTagsResponse) o;
        return Objects.equals(date, getTagsResponse.date) &&
                Objects.equals(taggedName, getTagsResponse.taggedName) &&
                Objects.equals(userId, getTagsResponse.userId) &&
                Objects.equals(viewed, getTagsResponse.viewed) &&
                Objects.equals(x, getTagsResponse.x) &&
                Objects.equals(description, getTagsResponse.description) &&
                Objects.equals(y, getTagsResponse.y) &&
                Objects.equals(y2, getTagsResponse.y2) &&
                Objects.equals(x2, getTagsResponse.x2) &&
                Objects.equals(id, getTagsResponse.id) &&
                Objects.equals(placerId, getTagsResponse.placerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTagsResponse{");
        sb.append("date=").append(date);
        sb.append(", taggedName='").append(taggedName).append("'");
        sb.append(", userId=").append(userId);
        sb.append(", viewed=").append(viewed);
        sb.append(", x=").append(x);
        sb.append(", description='").append(description).append("'");
        sb.append(", y=").append(y);
        sb.append(", y2=").append(y2);
        sb.append(", x2=").append(x2);
        sb.append(", id=").append(id);
        sb.append(", placerId=").append(placerId);
        sb.append('}');
        return sb.toString();
    }
}
