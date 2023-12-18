// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Url view event stats
 */
public class StoryItemStatsUrlView implements Validable {
    /**
     * Event type
     */
    @SerializedName("event_type")
    private String eventType;

    /**
     * Event hash
     */
    @SerializedName("rhash")
    private String rhash;

    public String getEventType() {
        return eventType;
    }

    public StoryItemStatsUrlView setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getRhash() {
        return rhash;
    }

    public StoryItemStatsUrlView setRhash(String rhash) {
        this.rhash = rhash;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rhash, eventType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoryItemStatsUrlView storyItemStatsUrlView = (StoryItemStatsUrlView) o;
        return Objects.equals(eventType, storyItemStatsUrlView.eventType) &&
                Objects.equals(rhash, storyItemStatsUrlView.rhash);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StoryItemStatsUrlView{");
        sb.append("eventType='").append(eventType).append("'");
        sb.append(", rhash='").append(rhash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
