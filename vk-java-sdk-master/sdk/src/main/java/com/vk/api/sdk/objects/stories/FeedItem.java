// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.apps.AppMin;
import java.util.List;
import java.util.Objects;

/**
 * FeedItem object
 */
public class FeedItem implements Validable {
    /**
     * App, which stories has been grouped (for type app_grouped_stories)
     */
    @SerializedName("app")
    private AppMin app;

    /**
     * Grouped stories of various authors (for types community_grouped_stories/app_grouped_stories type)
     */
    @SerializedName("grouped")
    private List<FeedItem> grouped;

    @SerializedName("has_unseen")
    private Boolean hasUnseen;

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    /**
     * Entity: owner
     */
    @SerializedName("owner_id")
    private Long ownerId;

    /**
     * Additional data for promo stories (for type promo_stories)
     */
    @SerializedName("promo_data")
    private PromoBlock promoData;

    /**
     * Author stories
     */
    @SerializedName("stories")
    private List<Story> stories;

    @SerializedName("track_code")
    private String trackCode;

    /**
     * Type of Feed Item
     */
    @SerializedName("type")
    @Required
    private FeedItemType type;

    public AppMin getApp() {
        return app;
    }

    public FeedItem setApp(AppMin app) {
        this.app = app;
        return this;
    }

    public List<FeedItem> getGrouped() {
        return grouped;
    }

    public FeedItem setGrouped(List<FeedItem> grouped) {
        this.grouped = grouped;
        return this;
    }

    public Boolean getHasUnseen() {
        return hasUnseen;
    }

    public FeedItem setHasUnseen(Boolean hasUnseen) {
        this.hasUnseen = hasUnseen;
        return this;
    }

    public String getId() {
        return id;
    }

    public FeedItem setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public FeedItem setName(String name) {
        this.name = name;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public FeedItem setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public PromoBlock getPromoData() {
        return promoData;
    }

    public FeedItem setPromoData(PromoBlock promoData) {
        this.promoData = promoData;
        return this;
    }

    public List<Story> getStories() {
        return stories;
    }

    public FeedItem setStories(List<Story> stories) {
        this.stories = stories;
        return this;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public FeedItem setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    public FeedItemType getType() {
        return type;
    }

    public FeedItem setType(FeedItemType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, trackCode, grouped, stories, hasUnseen, name, id, ownerId, type, promoData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedItem feedItem = (FeedItem) o;
        return Objects.equals(app, feedItem.app) &&
                Objects.equals(promoData, feedItem.promoData) &&
                Objects.equals(grouped, feedItem.grouped) &&
                Objects.equals(stories, feedItem.stories) &&
                Objects.equals(ownerId, feedItem.ownerId) &&
                Objects.equals(name, feedItem.name) &&
                Objects.equals(trackCode, feedItem.trackCode) &&
                Objects.equals(id, feedItem.id) &&
                Objects.equals(type, feedItem.type) &&
                Objects.equals(hasUnseen, feedItem.hasUnseen);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("FeedItem{");
        sb.append("app=").append(app);
        sb.append(", promoData=").append(promoData);
        sb.append(", grouped=").append(grouped);
        sb.append(", stories=").append(stories);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", name='").append(name).append("'");
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", hasUnseen=").append(hasUnseen);
        sb.append('}');
        return sb.toString();
    }
}