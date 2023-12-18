// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Reason for the complaint: '0' - spam, '1' - child pornography, '2' - extremism, '3' - violence, '4' - drug propaganda, '5' - adult material, '6' - insult, abuse
 */
public enum ReportReason implements EnumParam {
    @SerializedName("0")
    _0(0),

    @SerializedName("1")
    _1(1),

    @SerializedName("2")
    _2(2),

    @SerializedName("4")
    _4(4),

    @SerializedName("5")
    _5(5),

    @SerializedName("6")
    _6(6),

    @SerializedName("8")
    _8(8),

    @SerializedName("9")
    _9(9),

    @SerializedName("10")
    _10(10),

    @SerializedName("11")
    _11(11),

    @SerializedName("12")
    _12(12),

    @SerializedName("13")
    _13(13),

    @SerializedName("15")
    _15(15),

    @SerializedName("27")
    _27(27),

    @SerializedName("41")
    _41(41),

    @SerializedName("42")
    _42(42),

    @SerializedName("43")
    _43(43),

    @SerializedName("101")
    _101(101);

    private final Integer value;

    ReportReason(Integer value) {
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
