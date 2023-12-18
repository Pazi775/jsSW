// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.OrdData;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetClientsResponse object
 */
public class GetClientsResponse implements Validable {
    /**
     * Client's total limit, rubles
     */
    @SerializedName("all_limit")
    @Required
    private String allLimit;

    /**
     * Client's day limit, rubles
     */
    @SerializedName("day_limit")
    @Required
    private String dayLimit;

    /**
     * Client ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Client name
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Ord data
     */
    @SerializedName("ord_data")
    private OrdData ordData;

    public String getAllLimit() {
        return allLimit;
    }

    public GetClientsResponse setAllLimit(String allLimit) {
        this.allLimit = allLimit;
        return this;
    }

    public String getDayLimit() {
        return dayLimit;
    }

    public GetClientsResponse setDayLimit(String dayLimit) {
        this.dayLimit = dayLimit;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetClientsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetClientsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public OrdData getOrdData() {
        return ordData;
    }

    public GetClientsResponse setOrdData(OrdData ordData) {
        this.ordData = ordData;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayLimit, allLimit, ordData, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetClientsResponse getClientsResponse = (GetClientsResponse) o;
        return Objects.equals(allLimit, getClientsResponse.allLimit) &&
                Objects.equals(dayLimit, getClientsResponse.dayLimit) &&
                Objects.equals(name, getClientsResponse.name) &&
                Objects.equals(id, getClientsResponse.id) &&
                Objects.equals(ordData, getClientsResponse.ordData);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetClientsResponse{");
        sb.append("allLimit='").append(allLimit).append("'");
        sb.append(", dayLimit='").append(dayLimit).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", ordData=").append(ordData);
        sb.append('}');
        return sb.toString();
    }
}