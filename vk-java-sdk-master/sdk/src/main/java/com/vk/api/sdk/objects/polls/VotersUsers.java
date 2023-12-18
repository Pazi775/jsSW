// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.polls;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * VotersUsers object
 */
public class VotersUsers implements Validable {
    /**
     * Votes number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Long> items;

    public Integer getCount() {
        return count;
    }

    public VotersUsers setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Long> getItems() {
        return items;
    }

    public VotersUsers setItems(List<Long> items) {
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
        VotersUsers votersUsers = (VotersUsers) o;
        return Objects.equals(count, votersUsers.count) &&
                Objects.equals(items, votersUsers.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VotersUsers{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}