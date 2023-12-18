// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.OnlineStatusType;
import java.util.Objects;

/**
 * GetOnlineStatusResponse object
 */
public class GetOnlineStatusResponse implements Validable {
    /**
     * Estimated time of answer (for status = answer_mark)
     */
    @SerializedName("minutes")
    private Integer minutes;

    @SerializedName("status")
    @Required
    private OnlineStatusType status;

    public Integer getMinutes() {
        return minutes;
    }

    public GetOnlineStatusResponse setMinutes(Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    public OnlineStatusType getStatus() {
        return status;
    }

    public GetOnlineStatusResponse setStatus(OnlineStatusType status) {
        this.status = status;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOnlineStatusResponse getOnlineStatusResponse = (GetOnlineStatusResponse) o;
        return Objects.equals(minutes, getOnlineStatusResponse.minutes) &&
                Objects.equals(status, getOnlineStatusResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetOnlineStatusResponse{");
        sb.append("minutes=").append(minutes);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
