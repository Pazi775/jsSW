// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Geo object
 */
public class Geo implements Validable {
    /**
     * Coordinates as string. <latitude> <longtitude>
     */
    @SerializedName("coordinates")
    private String coordinates;

    /**
     * Information whether a map is showed
     */
    @SerializedName("showmap")
    private Integer showmap;

    /**
     * Place type
     */
    @SerializedName("type")
    private GeoType type;

    public String getCoordinates() {
        return coordinates;
    }

    public Geo setCoordinates(String coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public Integer getShowmap() {
        return showmap;
    }

    public Geo setShowmap(Integer showmap) {
        this.showmap = showmap;
        return this;
    }

    public GeoType getType() {
        return type;
    }

    public Geo setType(GeoType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(showmap, coordinates, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geo geo = (Geo) o;
        return Objects.equals(showmap, geo.showmap) &&
                Objects.equals(coordinates, geo.coordinates) &&
                Objects.equals(type, geo.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Geo{");
        sb.append("showmap=").append(showmap);
        sb.append(", coordinates='").append(coordinates).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
