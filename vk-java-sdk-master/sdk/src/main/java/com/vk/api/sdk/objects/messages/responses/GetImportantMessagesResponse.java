// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.messages.Conversation;
import com.vk.api.sdk.objects.messages.MessagesArray;
import com.vk.api.sdk.objects.users.User;
import java.util.List;
import java.util.Objects;

/**
 * GetImportantMessagesResponse object
 */
public class GetImportantMessagesResponse implements Validable {
    @SerializedName("conversations")
    private List<Conversation> conversations;

    @SerializedName("groups")
    private List<GroupFull> groups;

    @SerializedName("messages")
    @Required
    private MessagesArray messages;

    @SerializedName("profiles")
    private List<User> profiles;

    public List<Conversation> getConversations() {
        return conversations;
    }

    public GetImportantMessagesResponse setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetImportantMessagesResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public MessagesArray getMessages() {
        return messages;
    }

    public GetImportantMessagesResponse setMessages(MessagesArray messages) {
        this.messages = messages;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetImportantMessagesResponse setProfiles(List<User> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups, messages, conversations);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetImportantMessagesResponse getImportantMessagesResponse = (GetImportantMessagesResponse) o;
        return Objects.equals(profiles, getImportantMessagesResponse.profiles) &&
                Objects.equals(groups, getImportantMessagesResponse.groups) &&
                Objects.equals(messages, getImportantMessagesResponse.messages) &&
                Objects.equals(conversations, getImportantMessagesResponse.conversations);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetImportantMessagesResponse{");
        sb.append("profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", messages=").append(messages);
        sb.append(", conversations=").append(conversations);
        sb.append('}');
        return sb.toString();
    }
}