// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum VideoResponseType implements EnumParam {
    @SerializedName("min")
    MIN("min"),

    @SerializedName("full")
    FULL("full");

    private final String value;

    VideoResponseType(String value) {
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
