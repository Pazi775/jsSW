// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.adsweb;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetFraudHistoryResponseEntriesEntry object
 */
public class GetFraudHistoryResponseEntriesEntry implements Validable {
    @SerializedName("day")
    @Required
    private String day;

    @SerializedName("site_id")
    @Required
    private Integer siteId;

    public String getDay() {
        return day;
    }

    public GetFraudHistoryResponseEntriesEntry setDay(String day) {
        this.day = day;
        return this;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public GetFraudHistoryResponseEntriesEntry setSiteId(Integer siteId) {
        this.siteId = siteId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFraudHistoryResponseEntriesEntry getFraudHistoryResponseEntriesEntry = (GetFraudHistoryResponseEntriesEntry) o;
        return Objects.equals(siteId, getFraudHistoryResponseEntriesEntry.siteId) &&
                Objects.equals(day, getFraudHistoryResponseEntriesEntry.day);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetFraudHistoryResponseEntriesEntry{");
        sb.append("siteId=").append(siteId);
        sb.append(", day='").append(day).append("'");
        sb.append('}');
        return sb.toString();
    }
}