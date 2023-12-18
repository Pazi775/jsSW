// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.orders;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Order status
 */
public enum OrderStatus implements EnumParam {
    @SerializedName("created")
    CREATED("created"),

    @SerializedName("charged")
    CHARGED("charged"),

    @SerializedName("refunded")
    REFUNDED("refunded"),

    @SerializedName("chargeable")
    CHARGEABLE("chargeable"),

    @SerializedName("cancelled")
    CANCELLED("cancelled"),

    @SerializedName("declined")
    DECLINED("declined");

    private final String value;

    OrderStatus(String value) {
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
