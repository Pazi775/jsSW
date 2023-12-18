// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.bugtracker.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * AddCompanyMembersResponse object
 */
public class AddCompanyMembersResponse implements Validable {
    @SerializedName("errors")
    @Required
    private List<String> errors;

    public List<String> getErrors() {
        return errors;
    }

    public AddCompanyMembersResponse setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddCompanyMembersResponse addCompanyMembersResponse = (AddCompanyMembersResponse) o;
        return Objects.equals(errors, addCompanyMembersResponse.errors);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AddCompanyMembersResponse{");
        sb.append("errors='").append(errors).append("'");
        sb.append('}');
        return sb.toString();
    }
}
