// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum KeyboardButtonActionOpenLinkType implements EnumParam {
    @SerializedName("open_link")
    OPEN_LINK("open_link");

    private final String value;

    KeyboardButtonActionOpenLinkType(String value) {
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
