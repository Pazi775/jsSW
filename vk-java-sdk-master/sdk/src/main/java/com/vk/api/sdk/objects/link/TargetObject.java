// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.link;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * TargetObject object
 */
public class TargetObject implements Validable {
    /**
     * Item ID
     */
    @SerializedName("item_id")
    private Integer itemId;

    /**
     * Owner ID
     * Entity: owner
     */
    @SerializedName("owner_id")
    private Long ownerId;

    /**
     * Object type
     */
    @SerializedName("type")
    private String type;

    public Integer getItemId() {
        return itemId;
    }

    public TargetObject setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public TargetObject setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getType() {
        return type;
    }

    public TargetObject setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, ownerId, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetObject targetObject = (TargetObject) o;
        return Objects.equals(itemId, targetObject.itemId) &&
                Objects.equals(ownerId, targetObject.ownerId) &&
                Objects.equals(type, targetObject.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TargetObject{");
        sb.append("itemId=").append(itemId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}