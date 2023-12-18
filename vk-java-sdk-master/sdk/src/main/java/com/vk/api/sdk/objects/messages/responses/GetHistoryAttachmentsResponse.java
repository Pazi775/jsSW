// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.messages.HistoryAttachment;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetHistoryAttachmentsResponse object
 */
public class GetHistoryAttachmentsResponse implements Validable {
    @SerializedName("groups")
    private List<GroupFull> groups;

    @SerializedName("items")
    private List<HistoryAttachment> items;

    /**
     * Value for pagination
     */
    @SerializedName("next_from")
    private String nextFrom;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetHistoryAttachmentsResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public List<HistoryAttachment> getItems() {
        return items;
    }

    public GetHistoryAttachmentsResponse setItems(List<HistoryAttachment> items) {
        this.items = items;
        return this;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    public GetHistoryAttachmentsResponse setNextFrom(String nextFrom) {
        this.nextFrom = nextFrom;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetHistoryAttachmentsResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups, nextFrom, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetHistoryAttachmentsResponse getHistoryAttachmentsResponse = (GetHistoryAttachmentsResponse) o;
        return Objects.equals(nextFrom, getHistoryAttachmentsResponse.nextFrom) &&
                Objects.equals(profiles, getHistoryAttachmentsResponse.profiles) &&
                Objects.equals(groups, getHistoryAttachmentsResponse.groups) &&
                Objects.equals(items, getHistoryAttachmentsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetHistoryAttachmentsResponse{");
        sb.append("nextFrom='").append(nextFrom).append("'");
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}