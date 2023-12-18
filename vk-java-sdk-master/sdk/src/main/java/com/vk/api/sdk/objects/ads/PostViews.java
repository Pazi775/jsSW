// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Views
 */
public class PostViews implements Validable {
    /**
     * Count
     */
    @SerializedName("count")
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public PostViews setCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostViews postViews = (PostViews) o;
        return Objects.equals(count, postViews.count);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PostViews{");
        sb.append("count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
