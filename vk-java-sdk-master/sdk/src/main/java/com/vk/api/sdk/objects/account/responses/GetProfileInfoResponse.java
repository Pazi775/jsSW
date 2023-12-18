// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.account.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.users.UserSettingsXtr;
import java.net.URI;
import java.util.Objects;

/**
 * GetProfileInfoResponse object
 */
public class GetProfileInfoResponse extends UserSettingsXtr implements Validable {
    @SerializedName("can_access_closed")
    private Boolean canAccessClosed;

    /**
     * Returns if a profile is deleted or blocked
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * Returns if a profile is hidden.
     */
    @SerializedName("hidden")
    private Integer hidden;

    /**
     * User ID
     * Entity: owner
     */
    @SerializedName("id")
    @Required
    private Long id;

    @SerializedName("is_closed")
    private Boolean isClosed;

    /**
     * flag about service account
     */
    @SerializedName("is_service_account")
    private Boolean isServiceAccount;

    /**
     * URL of square photo of the user with 200 pixels in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    public Boolean getCanAccessClosed() {
        return canAccessClosed;
    }

    public GetProfileInfoResponse setCanAccessClosed(Boolean canAccessClosed) {
        this.canAccessClosed = canAccessClosed;
        return this;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public GetProfileInfoResponse setDeactivated(String deactivated) {
        this.deactivated = deactivated;
        return this;
    }

    public Integer getHidden() {
        return hidden;
    }

    public GetProfileInfoResponse setHidden(Integer hidden) {
        this.hidden = hidden;
        return this;
    }

    public Long getId() {
        return id;
    }

    public GetProfileInfoResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public GetProfileInfoResponse setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
        return this;
    }

    public Boolean getIsServiceAccount() {
        return isServiceAccount;
    }

    public GetProfileInfoResponse setIsServiceAccount(Boolean isServiceAccount) {
        this.isServiceAccount = isServiceAccount;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public GetProfileInfoResponse setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canAccessClosed, hidden, isClosed, id, photo200, deactivated, isServiceAccount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetProfileInfoResponse getProfileInfoResponse = (GetProfileInfoResponse) o;
        return Objects.equals(canAccessClosed, getProfileInfoResponse.canAccessClosed) &&
                Objects.equals(hidden, getProfileInfoResponse.hidden) &&
                Objects.equals(isServiceAccount, getProfileInfoResponse.isServiceAccount) &&
                Objects.equals(id, getProfileInfoResponse.id) &&
                Objects.equals(photo200, getProfileInfoResponse.photo200) &&
                Objects.equals(deactivated, getProfileInfoResponse.deactivated) &&
                Objects.equals(isClosed, getProfileInfoResponse.isClosed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetProfileInfoResponse{");
        sb.append("canAccessClosed=").append(canAccessClosed);
        sb.append(", hidden=").append(hidden);
        sb.append(", isServiceAccount=").append(isServiceAccount);
        sb.append(", id=").append(id);
        sb.append(", photo200=").append(photo200);
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", isClosed=").append(isClosed);
        sb.append('}');
        return sb.toString();
    }
}