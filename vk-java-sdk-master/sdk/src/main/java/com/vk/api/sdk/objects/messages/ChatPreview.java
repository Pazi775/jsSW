// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.LinkButton;
import java.util.List;
import java.util.Objects;

/**
 * ChatPreview object
 */
public class ChatPreview implements Validable {
    /**
     * Entity: owner
     */
    @SerializedName("admin_id")
    private Long adminId;

    @SerializedName("button")
    private LinkButton button;

    @SerializedName("is_don")
    private Boolean isDon;

    @SerializedName("is_group_channel")
    private Boolean isGroupChannel;

    @SerializedName("is_member")
    private Boolean isMember;

    @SerializedName("is_nft")
    private Boolean isNft;

    @SerializedName("joined")
    private Boolean joined;

    @SerializedName("local_id")
    private Integer localId;

    @SerializedName("members")
    private List<Long> members;

    @SerializedName("members_count")
    private Integer membersCount;

    @SerializedName("photo")
    private ChatSettingsPhoto photo;

    @SerializedName("title")
    private String title;

    public Long getAdminId() {
        return adminId;
    }

    public ChatPreview setAdminId(Long adminId) {
        this.adminId = adminId;
        return this;
    }

    public LinkButton getButton() {
        return button;
    }

    public ChatPreview setButton(LinkButton button) {
        this.button = button;
        return this;
    }

    public Boolean getIsDon() {
        return isDon;
    }

    public ChatPreview setIsDon(Boolean isDon) {
        this.isDon = isDon;
        return this;
    }

    public Boolean getIsGroupChannel() {
        return isGroupChannel;
    }

    public ChatPreview setIsGroupChannel(Boolean isGroupChannel) {
        this.isGroupChannel = isGroupChannel;
        return this;
    }

    public Boolean getIsMember() {
        return isMember;
    }

    public ChatPreview setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }

    public Boolean getIsNft() {
        return isNft;
    }

    public ChatPreview setIsNft(Boolean isNft) {
        this.isNft = isNft;
        return this;
    }

    public Boolean getJoined() {
        return joined;
    }

    public ChatPreview setJoined(Boolean joined) {
        this.joined = joined;
        return this;
    }

    public Integer getLocalId() {
        return localId;
    }

    public ChatPreview setLocalId(Integer localId) {
        this.localId = localId;
        return this;
    }

    public List<Long> getMembers() {
        return members;
    }

    public ChatPreview setMembers(List<Long> members) {
        this.members = members;
        return this;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public ChatPreview setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public ChatSettingsPhoto getPhoto() {
        return photo;
    }

    public ChatPreview setPhoto(ChatSettingsPhoto photo) {
        this.photo = photo;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ChatPreview setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(button, membersCount, isDon, joined, members, isGroupChannel, adminId, photo, isMember, title, localId, isNft);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatPreview chatPreview = (ChatPreview) o;
        return Objects.equals(button, chatPreview.button) &&
                Objects.equals(isDon, chatPreview.isDon) &&
                Objects.equals(isMember, chatPreview.isMember) &&
                Objects.equals(localId, chatPreview.localId) &&
                Objects.equals(isGroupChannel, chatPreview.isGroupChannel) &&
                Objects.equals(joined, chatPreview.joined) &&
                Objects.equals(adminId, chatPreview.adminId) &&
                Objects.equals(members, chatPreview.members) &&
                Objects.equals(isNft, chatPreview.isNft) &&
                Objects.equals(photo, chatPreview.photo) &&
                Objects.equals(membersCount, chatPreview.membersCount) &&
                Objects.equals(title, chatPreview.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatPreview{");
        sb.append("button=").append(button);
        sb.append(", isDon=").append(isDon);
        sb.append(", isMember=").append(isMember);
        sb.append(", localId=").append(localId);
        sb.append(", isGroupChannel=").append(isGroupChannel);
        sb.append(", joined=").append(joined);
        sb.append(", adminId=").append(adminId);
        sb.append(", members=").append(members);
        sb.append(", isNft=").append(isNft);
        sb.append(", photo=").append(photo);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}