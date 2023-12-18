// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Information about the status of video notifications for the current user.
 */
public enum GroupFullVideoNotificationsStatus implements EnumParam {
    @SerializedName("none")
    NONE("none"),

    @SerializedName("all")
    ALL("all"),

    @SerializedName("preferred")
    PREFERRED("preferred");

    private final String value;

    GroupFullVideoNotificationsStatus(String value) {
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
