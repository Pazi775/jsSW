// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.wall.WallItem;
import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<WallItem> items;

    public Integer getCount() {
        return count;
    }

    public GetResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<WallItem> getItems() {
        return items;
    }

    public GetResponse setItems(List<WallItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(count, getResponse.count) &&
                Objects.equals(items, getResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
