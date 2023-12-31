// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.leadforms.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.leadforms.QuestionItem;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * ListResponse object
 */
public class ListResponse implements Validable {
    @SerializedName("active")
    private BoolInt active;

    @SerializedName("confirmation")
    private String confirmation;

    @SerializedName("description")
    private String description;

    @SerializedName("form_id")
    @Required
    private Integer formId;

    /**
     * Entity: groups
     */
    @SerializedName("group_id")
    @Required
    private Long groupId;

    @SerializedName("leads_count")
    @Required
    private Integer leadsCount;

    @SerializedName("name")
    private String name;

    @SerializedName("notify_admins")
    private String notifyAdmins;

    @SerializedName("notify_emails")
    private String notifyEmails;

    @SerializedName("once_per_user")
    private Integer oncePerUser;

    @SerializedName("photo")
    private String photo;

    @SerializedName("pixel_code")
    private String pixelCode;

    @SerializedName("policy_link_url")
    private URI policyLinkUrl;

    @SerializedName("questions")
    private List<QuestionItem> questions;

    @SerializedName("site_link_url")
    private URI siteLinkUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("url")
    @Required
    private URI url;

    public boolean isActive() {
        return active == BoolInt.YES;
    }

    public BoolInt getActive() {
        return active;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public ListResponse setConfirmation(String confirmation) {
        this.confirmation = confirmation;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ListResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getFormId() {
        return formId;
    }

    public ListResponse setFormId(Integer formId) {
        this.formId = formId;
        return this;
    }

    public Long getGroupId() {
        return groupId;
    }

    public ListResponse setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public Integer getLeadsCount() {
        return leadsCount;
    }

    public ListResponse setLeadsCount(Integer leadsCount) {
        this.leadsCount = leadsCount;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getNotifyAdmins() {
        return notifyAdmins;
    }

    public ListResponse setNotifyAdmins(String notifyAdmins) {
        this.notifyAdmins = notifyAdmins;
        return this;
    }

    public String getNotifyEmails() {
        return notifyEmails;
    }

    public ListResponse setNotifyEmails(String notifyEmails) {
        this.notifyEmails = notifyEmails;
        return this;
    }

    public Integer getOncePerUser() {
        return oncePerUser;
    }

    public ListResponse setOncePerUser(Integer oncePerUser) {
        this.oncePerUser = oncePerUser;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ListResponse setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getPixelCode() {
        return pixelCode;
    }

    public ListResponse setPixelCode(String pixelCode) {
        this.pixelCode = pixelCode;
        return this;
    }

    public URI getPolicyLinkUrl() {
        return policyLinkUrl;
    }

    public ListResponse setPolicyLinkUrl(URI policyLinkUrl) {
        this.policyLinkUrl = policyLinkUrl;
        return this;
    }

    public List<QuestionItem> getQuestions() {
        return questions;
    }

    public ListResponse setQuestions(List<QuestionItem> questions) {
        this.questions = questions;
        return this;
    }

    public URI getSiteLinkUrl() {
        return siteLinkUrl;
    }

    public ListResponse setSiteLinkUrl(URI siteLinkUrl) {
        this.siteLinkUrl = siteLinkUrl;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ListResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public ListResponse setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, leadsCount, oncePerUser, groupId, questions, active, description, photo, confirmation, title, notifyAdmins, notifyEmails, url, pixelCode, siteLinkUrl, name, policyLinkUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListResponse listResponse = (ListResponse) o;
        return Objects.equals(formId, listResponse.formId) &&
                Objects.equals(questions, listResponse.questions) &&
                Objects.equals(active, listResponse.active) &&
                Objects.equals(description, listResponse.description) &&
                Objects.equals(photo, listResponse.photo) &&
                Objects.equals(siteLinkUrl, listResponse.siteLinkUrl) &&
                Objects.equals(notifyAdmins, listResponse.notifyAdmins) &&
                Objects.equals(confirmation, listResponse.confirmation) &&
                Objects.equals(oncePerUser, listResponse.oncePerUser) &&
                Objects.equals(pixelCode, listResponse.pixelCode) &&
                Objects.equals(title, listResponse.title) &&
                Objects.equals(url, listResponse.url) &&
                Objects.equals(leadsCount, listResponse.leadsCount) &&
                Objects.equals(notifyEmails, listResponse.notifyEmails) &&
                Objects.equals(groupId, listResponse.groupId) &&
                Objects.equals(name, listResponse.name) &&
                Objects.equals(policyLinkUrl, listResponse.policyLinkUrl);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ListResponse{");
        sb.append("formId=").append(formId);
        sb.append(", questions=").append(questions);
        sb.append(", active=").append(active);
        sb.append(", description='").append(description).append("'");
        sb.append(", photo='").append(photo).append("'");
        sb.append(", siteLinkUrl=").append(siteLinkUrl);
        sb.append(", notifyAdmins='").append(notifyAdmins).append("'");
        sb.append(", confirmation='").append(confirmation).append("'");
        sb.append(", oncePerUser=").append(oncePerUser);
        sb.append(", pixelCode='").append(pixelCode).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", url=").append(url);
        sb.append(", leadsCount=").append(leadsCount);
        sb.append(", notifyEmails='").append(notifyEmails).append("'");
        sb.append(", groupId=").append(groupId);
        sb.append(", name='").append(name).append("'");
        sb.append(", policyLinkUrl=").append(policyLinkUrl);
        sb.append('}');
        return sb.toString();
    }
}
