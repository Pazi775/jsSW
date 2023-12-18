// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sets vertical alignment of a photo
 */
public enum PhotoVerticalAlign implements EnumParam {
    @SerializedName("top")
    TOP("top"),

    @SerializedName("middle")
    MIDDLE("middle"),

    @SerializedName("bottom")
    BOTTOM("bottom");

    private final String value;

    PhotoVerticalAlign(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
