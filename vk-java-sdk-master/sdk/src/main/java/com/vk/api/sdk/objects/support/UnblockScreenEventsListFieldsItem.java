// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * UnblockScreenEventsListFieldsItem object
 */
public class UnblockScreenEventsListFieldsItem implements Validable {
    /**
     * Дата блокировки
     */
    @SerializedName("date")
    private String date;

    /**
     * Причина блокировки
     */
    @SerializedName("reason")
    private String reason;

    public String getDate() {
        return date;
    }

    public UnblockScreenEventsListFieldsItem setDate(String date) {
        this.date = date;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public UnblockScreenEventsListFieldsItem setReason(String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, reason);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenEventsListFieldsItem unblockScreenEventsListFieldsItem = (UnblockScreenEventsListFieldsItem) o;
        return Objects.equals(date, unblockScreenEventsListFieldsItem.date) &&
                Objects.equals(reason, unblockScreenEventsListFieldsItem.reason);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenEventsListFieldsItem{");
        sb.append("date='").append(date).append("'");
        sb.append(", reason='").append(reason).append("'");
        sb.append('}');
        return sb.toString();
    }
}
