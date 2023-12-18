// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.messages.ChatPushSettings;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * GetChatChatIdsResponse object
 */
public class GetChatChatIdsResponse implements Validable {
    /**
     * Chat creator ID
     * Entity: owner
     */
    @SerializedName("admin_id")
    @Required
    private Long adminId;

    /**
     * Chat ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * If provided photo is default
     */
    @SerializedName("is_default_photo")
    private Boolean isDefaultPhoto;

    /**
     * If chat is group channel
     */
    @SerializedName("is_group_channel")
    private Boolean isGroupChannel;

    /**
     * Shows that user has been kicked from the chat
     */
    @SerializedName("kicked")
    private BoolInt kicked;

    /**
     * Shows that user has been left the chat
     */
    @SerializedName("left")
    private BoolInt left;

    /**
     * Count members in a chat
     */
    @SerializedName("members_count")
    @Required
    private Integer membersCount;

    /**
     * URL of the preview image with 100 px in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * URL of the preview image with 200 px in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    /**
     * URL of the preview image with 50 px in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    @SerializedName("push_settings")
    private ChatPushSettings pushSettings;

    /**
     * Chat title
     */
    @SerializedName("title")
    private String title;

    /**
     * Chat type
     */
    @SerializedName("type")
    @Required
    private String type;

    @SerializedName("users")
    @Required
    private List<Long> users;

    public Long getAdminId() {
        return adminId;
    }

    public GetChatChatIdsResponse setAdminId(Long adminId) {
        this.adminId = adminId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetChatChatIdsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsDefaultPhoto() {
        return isDefaultPhoto;
    }

    public GetChatChatIdsResponse setIsDefaultPhoto(Boolean isDefaultPhoto) {
        this.isDefaultPhoto = isDefaultPhoto;
        return this;
    }

    public Boolean getIsGroupChannel() {
        return isGroupChannel;
    }

    public GetChatChatIdsResponse setIsGroupChannel(Boolean isGroupChannel) {
        this.isGroupChannel = isGroupChannel;
        return this;
    }

    public boolean isKicked() {
        return kicked == BoolInt.YES;
    }

    public BoolInt getKicked() {
        return kicked;
    }

    public boolean isLeft() {
        return left == BoolInt.YES;
    }

    public BoolInt getLeft() {
        return left;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public GetChatChatIdsResponse setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public GetChatChatIdsResponse setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public GetChatChatIdsResponse setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public GetChatChatIdsResponse setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public ChatPushSettings getPushSettings() {
        return pushSettings;
    }

    public GetChatChatIdsResponse setPushSettings(ChatPushSettings pushSettings) {
        this.pushSettings = pushSettings;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetChatChatIdsResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetChatChatIdsResponse setType(String type) {
        this.type = type;
        return this;
    }

    public List<Long> getUsers() {
        return users;
    }

    public GetChatChatIdsResponse setUsers(List<Long> users) {
        this.users = users;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(membersCount, photo50, kicked, photo200, title, type, users, photo100, left, isGroupChannel, adminId, pushSettings, id, isDefaultPhoto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetChatChatIdsResponse getChatChatIdsResponse = (GetChatChatIdsResponse) o;
        return Objects.equals(photo50, getChatChatIdsResponse.photo50) &&
                Objects.equals(isDefaultPhoto, getChatChatIdsResponse.isDefaultPhoto) &&
                Objects.equals(isGroupChannel, getChatChatIdsResponse.isGroupChannel) &&
                Objects.equals(kicked, getChatChatIdsResponse.kicked) &&
                Objects.equals(title, getChatChatIdsResponse.title) &&
                Objects.equals(type, getChatChatIdsResponse.type) &&
                Objects.equals(users, getChatChatIdsResponse.users) &&
                Objects.equals(left, getChatChatIdsResponse.left) &&
                Objects.equals(pushSettings, getChatChatIdsResponse.pushSettings) &&
                Objects.equals(adminId, getChatChatIdsResponse.adminId) &&
                Objects.equals(membersCount, getChatChatIdsResponse.membersCount) &&
                Objects.equals(id, getChatChatIdsResponse.id) &&
                Objects.equals(photo100, getChatChatIdsResponse.photo100) &&
                Objects.equals(photo200, getChatChatIdsResponse.photo200);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetChatChatIdsResponse{");
        sb.append("photo50=").append(photo50);
        sb.append(", isDefaultPhoto=").append(isDefaultPhoto);
        sb.append(", isGroupChannel=").append(isGroupChannel);
        sb.append(", kicked=").append(kicked);
        sb.append(", title='").append(title).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", users=").append(users);
        sb.append(", left=").append(left);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", adminId=").append(adminId);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", id=").append(id);
        sb.append(", photo100=").append(photo100);
        sb.append(", photo200=").append(photo200);
        sb.append('}');
        return sb.toString();
    }
}