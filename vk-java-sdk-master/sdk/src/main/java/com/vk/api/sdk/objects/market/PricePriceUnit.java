// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum PricePriceUnit implements EnumParam {
    @SerializedName("0")
    ITEM(0),

    @SerializedName("2")
    HOUR(2),

    @SerializedName("3")
    M3(3),

    @SerializedName("4")
    M2(4);

    private final Integer value;

    PricePriceUnit(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
