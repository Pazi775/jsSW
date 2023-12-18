// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ImageTheme implements EnumParam {
    @SerializedName("light")
    LIGHT("light"),

    @SerializedName("dark")
    DARK("dark");

    private final String value;

    ImageTheme(String value) {
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
