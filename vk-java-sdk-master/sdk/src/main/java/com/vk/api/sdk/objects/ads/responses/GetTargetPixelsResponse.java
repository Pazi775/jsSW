// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetTargetPixelsResponse object
 */
public class GetTargetPixelsResponse implements Validable {
    @SerializedName("category_id")
    @Required
    private Integer categoryId;

    @SerializedName("domain")
    @Required
    private String domain;

    @SerializedName("last_updated")
    @Required
    private Integer lastUpdated;

    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("pixel")
    @Required
    private String pixel;

    @SerializedName("target_pixel_id")
    @Required
    private Integer targetPixelId;

    public Integer getCategoryId() {
        return categoryId;
    }

    public GetTargetPixelsResponse setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public GetTargetPixelsResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public Integer getLastUpdated() {
        return lastUpdated;
    }

    public GetTargetPixelsResponse setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetTargetPixelsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPixel() {
        return pixel;
    }

    public GetTargetPixelsResponse setPixel(String pixel) {
        this.pixel = pixel;
        return this;
    }

    public Integer getTargetPixelId() {
        return targetPixelId;
    }

    public GetTargetPixelsResponse setTargetPixelId(Integer targetPixelId) {
        this.targetPixelId = targetPixelId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdated, targetPixelId, domain, name, pixel, categoryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTargetPixelsResponse getTargetPixelsResponse = (GetTargetPixelsResponse) o;
        return Objects.equals(lastUpdated, getTargetPixelsResponse.lastUpdated) &&
                Objects.equals(categoryId, getTargetPixelsResponse.categoryId) &&
                Objects.equals(domain, getTargetPixelsResponse.domain) &&
                Objects.equals(name, getTargetPixelsResponse.name) &&
                Objects.equals(targetPixelId, getTargetPixelsResponse.targetPixelId) &&
                Objects.equals(pixel, getTargetPixelsResponse.pixel);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTargetPixelsResponse{");
        sb.append("lastUpdated=").append(lastUpdated);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", domain='").append(domain).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", targetPixelId=").append(targetPixelId);
        sb.append(", pixel='").append(pixel).append("'");
        sb.append('}');
        return sb.toString();
    }
}
