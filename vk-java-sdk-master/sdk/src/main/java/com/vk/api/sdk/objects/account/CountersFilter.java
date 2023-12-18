// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum CountersFilter implements EnumParam {
    @SerializedName("app_requests")
    APP_REQUESTS("app_requests"),

    @SerializedName("events")
    EVENTS("events"),

    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("friends_recommendations")
    FRIENDS_RECOMMENDATIONS("friends_recommendations"),

    @SerializedName("gifts")
    GIFTS("gifts"),

    @SerializedName("groups")
    GROUPS("groups"),

    @SerializedName("messages")
    MESSAGES("messages"),

    @SerializedName("notes")
    NOTES("notes"),

    @SerializedName("notifications")
    NOTIFICATIONS("notifications"),

    @SerializedName("photos")
    PHOTOS("photos"),

    @SerializedName("faves")
    FAVES("faves"),

    @SerializedName("memories")
    MEMORIES("memories");

    private final String value;

    CountersFilter(String value) {
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
