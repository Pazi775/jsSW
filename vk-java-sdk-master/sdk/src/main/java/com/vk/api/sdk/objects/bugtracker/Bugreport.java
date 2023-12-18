// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.bugtracker;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Bugreport object
 */
public class Bugreport implements Validable {
    @SerializedName("can_bookmark")
    private Boolean canBookmark;

    @SerializedName("can_change_product")
    private Boolean canChangeProduct;

    @SerializedName("can_change_status")
    private Boolean canChangeStatus;

    @SerializedName("can_edit")
    private Boolean canEdit;

    @SerializedName("can_remove")
    private Boolean canRemove;

    @SerializedName("can_restore")
    private Boolean canRestore;

    @SerializedName("clones_count")
    private Integer clonesCount;

    @SerializedName("comments_count")
    private Integer commentsCount;

    @SerializedName("company_id")
    @Required
    private Integer companyId;

    @SerializedName("created")
    @Required
    private Integer created;

    @SerializedName("description")
    private String description;

    @SerializedName("hidden_docs")
    private Boolean hiddenDocs;

    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("is_bookmarked")
    private Boolean isBookmarked;

    @SerializedName("is_deleted")
    private Boolean isDeleted;

    @SerializedName("is_severity_by_moderator")
    private Boolean isSeverityByModerator;

    @SerializedName("is_vulnerability")
    private Boolean isVulnerability;

    @SerializedName("original_id")
    private Integer originalId;

    /**
     * Entity: owner
     */
    @SerializedName("owner_id")
    @Required
    private Long ownerId;

    @SerializedName("phone")
    private String phone;

    @SerializedName("private_comment")
    private String privateComment;

    @SerializedName("state_actual")
    private String stateActual;

    @SerializedName("state_supposed")
    private String stateSupposed;

    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("updated")
    @Required
    private Integer updated;

    public Boolean getCanBookmark() {
        return canBookmark;
    }

    public Bugreport setCanBookmark(Boolean canBookmark) {
        this.canBookmark = canBookmark;
        return this;
    }

    public Boolean getCanChangeProduct() {
        return canChangeProduct;
    }

    public Bugreport setCanChangeProduct(Boolean canChangeProduct) {
        this.canChangeProduct = canChangeProduct;
        return this;
    }

    public Boolean getCanChangeStatus() {
        return canChangeStatus;
    }

    public Bugreport setCanChangeStatus(Boolean canChangeStatus) {
        this.canChangeStatus = canChangeStatus;
        return this;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public Bugreport setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    public Boolean getCanRemove() {
        return canRemove;
    }

    public Bugreport setCanRemove(Boolean canRemove) {
        this.canRemove = canRemove;
        return this;
    }

    public Boolean getCanRestore() {
        return canRestore;
    }

    public Bugreport setCanRestore(Boolean canRestore) {
        this.canRestore = canRestore;
        return this;
    }

    public Integer getClonesCount() {
        return clonesCount;
    }

    public Bugreport setClonesCount(Integer clonesCount) {
        this.clonesCount = clonesCount;
        return this;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public Bugreport setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
        return this;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public Bugreport setCompanyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public Bugreport setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Bugreport setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getHiddenDocs() {
        return hiddenDocs;
    }

    public Bugreport setHiddenDocs(Boolean hiddenDocs) {
        this.hiddenDocs = hiddenDocs;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Bugreport setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsBookmarked() {
        return isBookmarked;
    }

    public Bugreport setIsBookmarked(Boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
        return this;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public Bugreport setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Boolean getIsSeverityByModerator() {
        return isSeverityByModerator;
    }

    public Bugreport setIsSeverityByModerator(Boolean isSeverityByModerator) {
        this.isSeverityByModerator = isSeverityByModerator;
        return this;
    }

    public Boolean getIsVulnerability() {
        return isVulnerability;
    }

    public Bugreport setIsVulnerability(Boolean isVulnerability) {
        this.isVulnerability = isVulnerability;
        return this;
    }

    public Integer getOriginalId() {
        return originalId;
    }

    public Bugreport setOriginalId(Integer originalId) {
        this.originalId = originalId;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Bugreport setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Bugreport setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPrivateComment() {
        return privateComment;
    }

    public Bugreport setPrivateComment(String privateComment) {
        this.privateComment = privateComment;
        return this;
    }

    public String getStateActual() {
        return stateActual;
    }

    public Bugreport setStateActual(String stateActual) {
        this.stateActual = stateActual;
        return this;
    }

    public String getStateSupposed() {
        return stateSupposed;
    }

    public Bugreport setStateSupposed(String stateSupposed) {
        this.stateSupposed = stateSupposed;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Bugreport setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getUpdated() {
        return updated;
    }

    public Bugreport setUpdated(Integer updated) {
        this.updated = updated;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canChangeStatus, isBookmarked, canChangeProduct, canEdit, description, ownerId, title, hiddenDocs, canRemove, isDeleted, stateSupposed, id, stateActual, isSeverityByModerator, isVulnerability, created, canRestore, canBookmark, clonesCount, privateComment, companyId, phone, commentsCount, originalId, updated);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bugreport bugreport = (Bugreport) o;
        return Objects.equals(canRemove, bugreport.canRemove) &&
                Objects.equals(ownerId, bugreport.ownerId) &&
                Objects.equals(stateActual, bugreport.stateActual) &&
                Objects.equals(canChangeStatus, bugreport.canChangeStatus) &&
                Objects.equals(description, bugreport.description) &&
                Objects.equals(title, bugreport.title) &&
                Objects.equals(canBookmark, bugreport.canBookmark) &&
                Objects.equals(isDeleted, bugreport.isDeleted) &&
                Objects.equals(isBookmarked, bugreport.isBookmarked) &&
                Objects.equals(id, bugreport.id) &&
                Objects.equals(hiddenDocs, bugreport.hiddenDocs) &&
                Objects.equals(isSeverityByModerator, bugreport.isSeverityByModerator) &&
                Objects.equals(companyId, bugreport.companyId) &&
                Objects.equals(privateComment, bugreport.privateComment) &&
                Objects.equals(created, bugreport.created) &&
                Objects.equals(canEdit, bugreport.canEdit) &&
                Objects.equals(isVulnerability, bugreport.isVulnerability) &&
                Objects.equals(canChangeProduct, bugreport.canChangeProduct) &&
                Objects.equals(clonesCount, bugreport.clonesCount) &&
                Objects.equals(phone, bugreport.phone) &&
                Objects.equals(commentsCount, bugreport.commentsCount) &&
                Objects.equals(canRestore, bugreport.canRestore) &&
                Objects.equals(originalId, bugreport.originalId) &&
                Objects.equals(updated, bugreport.updated) &&
                Objects.equals(stateSupposed, bugreport.stateSupposed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Bugreport{");
        sb.append("canRemove=").append(canRemove);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", stateActual='").append(stateActual).append("'");
        sb.append(", canChangeStatus=").append(canChangeStatus);
        sb.append(", description='").append(description).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", canBookmark=").append(canBookmark);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isBookmarked=").append(isBookmarked);
        sb.append(", id=").append(id);
        sb.append(", hiddenDocs=").append(hiddenDocs);
        sb.append(", isSeverityByModerator=").append(isSeverityByModerator);
        sb.append(", companyId=").append(companyId);
        sb.append(", privateComment='").append(privateComment).append("'");
        sb.append(", created=").append(created);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", isVulnerability=").append(isVulnerability);
        sb.append(", canChangeProduct=").append(canChangeProduct);
        sb.append(", clonesCount=").append(clonesCount);
        sb.append(", phone='").append(phone).append("'");
        sb.append(", commentsCount=").append(commentsCount);
        sb.append(", canRestore=").append(canRestore);
        sb.append(", originalId=").append(originalId);
        sb.append(", updated=").append(updated);
        sb.append(", stateSupposed='").append(stateSupposed).append("'");
        sb.append('}');
        return sb.toString();
    }
}
