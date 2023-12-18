// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Occupation object
 */
public class Occupation implements Validable {
    @SerializedName("city_id")
    private Integer cityId;

    @SerializedName("country_id")
    private Integer countryId;

    @SerializedName("graduate_year")
    private Integer graduateYear;

    /**
     * ID of school, university, company group
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Name of occupation
     */
    @SerializedName("name")
    private String name;

    /**
     * Type of occupation
     */
    @SerializedName("type")
    private OccupationType type;

    public Integer getCityId() {
        return cityId;
    }

    public Occupation setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Occupation setCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }

    public Integer getGraduateYear() {
        return graduateYear;
    }

    public Occupation setGraduateYear(Integer graduateYear) {
        this.graduateYear = graduateYear;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Occupation setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Occupation setName(String name) {
        this.name = name;
        return this;
    }

    public OccupationType getType() {
        return type;
    }

    public Occupation setType(OccupationType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, graduateYear, id, cityId, type, countryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Occupation occupation = (Occupation) o;
        return Objects.equals(graduateYear, occupation.graduateYear) &&
                Objects.equals(name, occupation.name) &&
                Objects.equals(id, occupation.id) &&
                Objects.equals(type, occupation.type) &&
                Objects.equals(countryId, occupation.countryId) &&
                Objects.equals(cityId, occupation.cityId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Occupation{");
        sb.append("graduateYear=").append(graduateYear);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append(", countryId=").append(countryId);
        sb.append(", cityId=").append(cityId);
        sb.append('}');
        return sb.toString();
    }
}