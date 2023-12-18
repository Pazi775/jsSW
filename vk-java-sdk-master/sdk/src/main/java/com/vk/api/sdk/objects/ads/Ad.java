// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.List;
import java.util.Objects;

/**
 * Ad object
 */
public class Ad implements Validable {
    /**
     * Ad format
     */
    @SerializedName("ad_format")
    @Required
    private Integer adFormat;

    /**
     * Ad platform
     */
    @SerializedName("ad_platform")
    @Required
    private JsonPrimitive adPlatform;

    /**
     * Ad platform no ad network
     */
    @SerializedName("ad_platform_no_ad_network")
    private Integer adPlatformNoAdNetwork;

    /**
     * Ad platform no wall
     */
    @SerializedName("ad_platform_no_wall")
    private Integer adPlatformNoWall;

    /**
     * Age restriction
     */
    @SerializedName("age_restriction")
    private Integer ageRestriction;

    /**
     * Total limit
     */
    @SerializedName("all_limit")
    @Required
    private String allLimit;

    @SerializedName("approved")
    @Required
    private AdApproved approved;

    /**
     * Autobidding
     */
    @SerializedName("autobidding")
    private BoolInt autobidding;

    /**
     * Max cost of target actions for autobidding, kopecks
     */
    @SerializedName("autobidding_max_cost")
    private String autobiddingMaxCost;

    /**
     * Campaign ID
     */
    @SerializedName("campaign_id")
    @Required
    private Integer campaignId;

    /**
     * Category ID
     */
    @SerializedName("category1_id")
    private Integer category1Id;

    /**
     * Additional category ID
     */
    @SerializedName("category2_id")
    private Integer category2Id;

    /**
     * Conversion event id
     */
    @SerializedName("conversion_event_id")
    private Integer conversionEventId;

    /**
     * Conversion pixel id
     */
    @SerializedName("conversion_pixel_id")
    private Integer conversionPixelId;

    @SerializedName("cost_type")
    @Required
    private AdCostType costType;

    /**
     * Cost of an action, kopecks
     */
    @SerializedName("cpa")
    private String cpa;

    /**
     * Cost of a click, kopecks
     */
    @SerializedName("cpc")
    private String cpc;

    /**
     * Cost of 1000 impressions, kopecks
     */
    @SerializedName("cpm")
    private String cpm;

    /**
     * Create time
     */
    @SerializedName("create_time")
    private Integer createTime;

    /**
     * Day limit
     */
    @SerializedName("day_limit")
    private String dayLimit;

    /**
     * Disclaimer finance
     */
    @SerializedName("disclaimer_finance")
    private Integer disclaimerFinance;

    /**
     * Disclaimer finance license no
     */
    @SerializedName("disclaimer_finance_license_no")
    private String disclaimerFinanceLicenseNo;

    /**
     * Disclaimer finance name
     */
    @SerializedName("disclaimer_finance_name")
    private String disclaimerFinanceName;

    /**
     * Information whether disclaimer is enabled
     */
    @SerializedName("disclaimer_medical")
    private BoolInt disclaimerMedical;

    /**
     * Information whether disclaimer is enabled
     */
    @SerializedName("disclaimer_specialist")
    private BoolInt disclaimerSpecialist;

    /**
     * Information whether disclaimer is enabled
     */
    @SerializedName("disclaimer_supplements")
    private BoolInt disclaimerSupplements;

    /**
     * Events retargeting groups
     */
    @SerializedName("events_retargeting_groups")
    private List<EventsRetargetingGroup> eventsRetargetingGroups;

    /**
     * Goal type
     */
    @SerializedName("goal_type")
    private Integer goalType;

    /**
     * Has campaign budget optimization
     */
    @SerializedName("has_campaign_budget_optimization")
    private Boolean hasCampaignBudgetOptimization;

    /**
     * Ad ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Impressions limit
     */
    @SerializedName("impressions_limit")
    private Integer impressionsLimit;

    /**
     * Impressions limit period
     */
    @SerializedName("impressions_limit_period")
    private Integer impressionsLimitPeriod;

    /**
     * Information whether impressions are limited
     */
    @SerializedName("impressions_limited")
    private BoolInt impressionsLimited;

    /**
     * is promo
     */
    @SerializedName("is_promo")
    private Boolean isPromo;

    /**
     * Link id
     */
    @SerializedName("link_id")
    private Integer linkId;

    /**
     * Link owner id
     */
    @SerializedName("link_owner_id")
    private Long linkOwnerId;

    /**
     * Link type
     */
    @SerializedName("link_type")
    private Integer linkType;

    /**
     * Link url
     */
    @SerializedName("link_url")
    private String linkUrl;

    /**
     * Ad title
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Cost of 1000 impressions optimized, kopecks
     */
    @SerializedName("ocpm")
    private String ocpm;

    /**
     * Publisher platforms
     */
    @SerializedName("publisher_platforms")
    private String publisherPlatforms;

    /**
     * Publisher platform auto
     */
    @SerializedName("publisher_platforms_auto")
    private BoolInt publisherPlatformsAuto;

    /**
     * Start time
     */
    @SerializedName("start_time")
    private Integer startTime;

    @SerializedName("status")
    @Required
    private AdStatus status;

    /**
     * Stop time
     */
    @SerializedName("stop_time")
    private Integer stopTime;

    /**
     * Suggested criteria
     */
    @SerializedName("suggested_criteria")
    private Integer suggestedCriteria;

    /**
     * Update time
     */
    @SerializedName("update_time")
    private Integer updateTime;

    /**
     * User goal type
     */
    @SerializedName("user_goal_type")
    private Integer userGoalType;

    /**
     * Information whether the ad is a video
     */
    @SerializedName("video")
    private BoolInt video;

    /**
     * Weekly schedule hours
     */
    @SerializedName("weekly_schedule_hours")
    private List<String> weeklyScheduleHours;

    /**
     * Weekly schedule use holidays
     */
    @SerializedName("weekly_schedule_use_holidays")
    private Integer weeklyScheduleUseHolidays;

    public Integer getAdFormat() {
        return adFormat;
    }

    public Ad setAdFormat(Integer adFormat) {
        this.adFormat = adFormat;
        return this;
    }

    public JsonPrimitive getAdPlatform() {
        return adPlatform;
    }

    public Ad setAdPlatform(JsonPrimitive adPlatform) {
        this.adPlatform = adPlatform;
        return this;
    }

    public Integer getAdPlatformNoAdNetwork() {
        return adPlatformNoAdNetwork;
    }

    public Ad setAdPlatformNoAdNetwork(Integer adPlatformNoAdNetwork) {
        this.adPlatformNoAdNetwork = adPlatformNoAdNetwork;
        return this;
    }

    public Integer getAdPlatformNoWall() {
        return adPlatformNoWall;
    }

    public Ad setAdPlatformNoWall(Integer adPlatformNoWall) {
        this.adPlatformNoWall = adPlatformNoWall;
        return this;
    }

    public Integer getAgeRestriction() {
        return ageRestriction;
    }

    public Ad setAgeRestriction(Integer ageRestriction) {
        this.ageRestriction = ageRestriction;
        return this;
    }

    public String getAllLimit() {
        return allLimit;
    }

    public Ad setAllLimit(String allLimit) {
        this.allLimit = allLimit;
        return this;
    }

    public AdApproved getApproved() {
        return approved;
    }

    public Ad setApproved(AdApproved approved) {
        this.approved = approved;
        return this;
    }

    public boolean isAutobidding() {
        return autobidding == BoolInt.YES;
    }

    public BoolInt getAutobidding() {
        return autobidding;
    }

    public String getAutobiddingMaxCost() {
        return autobiddingMaxCost;
    }

    public Ad setAutobiddingMaxCost(String autobiddingMaxCost) {
        this.autobiddingMaxCost = autobiddingMaxCost;
        return this;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public Ad setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public Integer getCategory1Id() {
        return category1Id;
    }

    public Ad setCategory1Id(Integer category1Id) {
        this.category1Id = category1Id;
        return this;
    }

    public Integer getCategory2Id() {
        return category2Id;
    }

    public Ad setCategory2Id(Integer category2Id) {
        this.category2Id = category2Id;
        return this;
    }

    public Integer getConversionEventId() {
        return conversionEventId;
    }

    public Ad setConversionEventId(Integer conversionEventId) {
        this.conversionEventId = conversionEventId;
        return this;
    }

    public Integer getConversionPixelId() {
        return conversionPixelId;
    }

    public Ad setConversionPixelId(Integer conversionPixelId) {
        this.conversionPixelId = conversionPixelId;
        return this;
    }

    public AdCostType getCostType() {
        return costType;
    }

    public Ad setCostType(AdCostType costType) {
        this.costType = costType;
        return this;
    }

    public String getCpa() {
        return cpa;
    }

    public Ad setCpa(String cpa) {
        this.cpa = cpa;
        return this;
    }

    public String getCpc() {
        return cpc;
    }

    public Ad setCpc(String cpc) {
        this.cpc = cpc;
        return this;
    }

    public String getCpm() {
        return cpm;
    }

    public Ad setCpm(String cpm) {
        this.cpm = cpm;
        return this;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public Ad setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getDayLimit() {
        return dayLimit;
    }

    public Ad setDayLimit(String dayLimit) {
        this.dayLimit = dayLimit;
        return this;
    }

    public Integer getDisclaimerFinance() {
        return disclaimerFinance;
    }

    public Ad setDisclaimerFinance(Integer disclaimerFinance) {
        this.disclaimerFinance = disclaimerFinance;
        return this;
    }

    public String getDisclaimerFinanceLicenseNo() {
        return disclaimerFinanceLicenseNo;
    }

    public Ad setDisclaimerFinanceLicenseNo(String disclaimerFinanceLicenseNo) {
        this.disclaimerFinanceLicenseNo = disclaimerFinanceLicenseNo;
        return this;
    }

    public String getDisclaimerFinanceName() {
        return disclaimerFinanceName;
    }

    public Ad setDisclaimerFinanceName(String disclaimerFinanceName) {
        this.disclaimerFinanceName = disclaimerFinanceName;
        return this;
    }

    public boolean isDisclaimerMedical() {
        return disclaimerMedical == BoolInt.YES;
    }

    public BoolInt getDisclaimerMedical() {
        return disclaimerMedical;
    }

    public boolean isDisclaimerSpecialist() {
        return disclaimerSpecialist == BoolInt.YES;
    }

    public BoolInt getDisclaimerSpecialist() {
        return disclaimerSpecialist;
    }

    public boolean isDisclaimerSupplements() {
        return disclaimerSupplements == BoolInt.YES;
    }

    public BoolInt getDisclaimerSupplements() {
        return disclaimerSupplements;
    }

    public List<EventsRetargetingGroup> getEventsRetargetingGroups() {
        return eventsRetargetingGroups;
    }

    public Ad setEventsRetargetingGroups(List<EventsRetargetingGroup> eventsRetargetingGroups) {
        this.eventsRetargetingGroups = eventsRetargetingGroups;
        return this;
    }

    public Integer getGoalType() {
        return goalType;
    }

    public Ad setGoalType(Integer goalType) {
        this.goalType = goalType;
        return this;
    }

    public Boolean getHasCampaignBudgetOptimization() {
        return hasCampaignBudgetOptimization;
    }

    public Ad setHasCampaignBudgetOptimization(Boolean hasCampaignBudgetOptimization) {
        this.hasCampaignBudgetOptimization = hasCampaignBudgetOptimization;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Ad setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getImpressionsLimit() {
        return impressionsLimit;
    }

    public Ad setImpressionsLimit(Integer impressionsLimit) {
        this.impressionsLimit = impressionsLimit;
        return this;
    }

    public Integer getImpressionsLimitPeriod() {
        return impressionsLimitPeriod;
    }

    public Ad setImpressionsLimitPeriod(Integer impressionsLimitPeriod) {
        this.impressionsLimitPeriod = impressionsLimitPeriod;
        return this;
    }

    public boolean isImpressionsLimited() {
        return impressionsLimited == BoolInt.YES;
    }

    public BoolInt getImpressionsLimited() {
        return impressionsLimited;
    }

    public Boolean getIsPromo() {
        return isPromo;
    }

    public Ad setIsPromo(Boolean isPromo) {
        this.isPromo = isPromo;
        return this;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public Ad setLinkId(Integer linkId) {
        this.linkId = linkId;
        return this;
    }

    public Long getLinkOwnerId() {
        return linkOwnerId;
    }

    public Ad setLinkOwnerId(Long linkOwnerId) {
        this.linkOwnerId = linkOwnerId;
        return this;
    }

    public Integer getLinkType() {
        return linkType;
    }

    public Ad setLinkType(Integer linkType) {
        this.linkType = linkType;
        return this;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public Ad setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ad setName(String name) {
        this.name = name;
        return this;
    }

    public String getOcpm() {
        return ocpm;
    }

    public Ad setOcpm(String ocpm) {
        this.ocpm = ocpm;
        return this;
    }

    public String getPublisherPlatforms() {
        return publisherPlatforms;
    }

    public Ad setPublisherPlatforms(String publisherPlatforms) {
        this.publisherPlatforms = publisherPlatforms;
        return this;
    }

    public boolean isPublisherPlatformsAuto() {
        return publisherPlatformsAuto == BoolInt.YES;
    }

    public BoolInt getPublisherPlatformsAuto() {
        return publisherPlatformsAuto;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Ad setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public AdStatus getStatus() {
        return status;
    }

    public Ad setStatus(AdStatus status) {
        this.status = status;
        return this;
    }

    public Integer getStopTime() {
        return stopTime;
    }

    public Ad setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    public Integer getSuggestedCriteria() {
        return suggestedCriteria;
    }

    public Ad setSuggestedCriteria(Integer suggestedCriteria) {
        this.suggestedCriteria = suggestedCriteria;
        return this;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public Ad setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getUserGoalType() {
        return userGoalType;
    }

    public Ad setUserGoalType(Integer userGoalType) {
        this.userGoalType = userGoalType;
        return this;
    }

    public boolean isVideo() {
        return video == BoolInt.YES;
    }

    public BoolInt getVideo() {
        return video;
    }

    public List<String> getWeeklyScheduleHours() {
        return weeklyScheduleHours;
    }

    public Ad setWeeklyScheduleHours(List<String> weeklyScheduleHours) {
        this.weeklyScheduleHours = weeklyScheduleHours;
        return this;
    }

    public Integer getWeeklyScheduleUseHolidays() {
        return weeklyScheduleUseHolidays;
    }

    public Ad setWeeklyScheduleUseHolidays(Integer weeklyScheduleUseHolidays) {
        this.weeklyScheduleUseHolidays = weeklyScheduleUseHolidays;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(allLimit, category2Id, adPlatform, approved, cpa, eventsRetargetingGroups, costType, cpc, linkUrl, disclaimerFinanceLicenseNo, id, adPlatformNoWall, impressionsLimitPeriod, userGoalType, cpm, suggestedCriteria, campaignId, disclaimerSpecialist, disclaimerSupplements, linkOwnerId, autobidding, name, conversionPixelId, publisherPlatformsAuto, status, adPlatformNoAdNetwork, hasCampaignBudgetOptimization, disclaimerMedical, category1Id, weeklyScheduleHours, video, isPromo, startTime, stopTime, disclaimerFinanceName, autobiddingMaxCost, impressionsLimit, goalType, weeklyScheduleUseHolidays, ocpm, publisherPlatforms, updateTime, conversionEventId, disclaimerFinance, linkId, dayLimit, createTime, impressionsLimited, ageRestriction, linkType, adFormat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return Objects.equals(costType, ad.costType) &&
                Objects.equals(linkId, ad.linkId) &&
                Objects.equals(approved, ad.approved) &&
                Objects.equals(cpa, ad.cpa) &&
                Objects.equals(disclaimerFinance, ad.disclaimerFinance) &&
                Objects.equals(cpc, ad.cpc) &&
                Objects.equals(publisherPlatformsAuto, ad.publisherPlatformsAuto) &&
                Objects.equals(linkUrl, ad.linkUrl) &&
                Objects.equals(id, ad.id) &&
                Objects.equals(publisherPlatforms, ad.publisherPlatforms) &&
                Objects.equals(campaignId, ad.campaignId) &&
                Objects.equals(category2Id, ad.category2Id) &&
                Objects.equals(adFormat, ad.adFormat) &&
                Objects.equals(cpm, ad.cpm) &&
                Objects.equals(createTime, ad.createTime) &&
                Objects.equals(hasCampaignBudgetOptimization, ad.hasCampaignBudgetOptimization) &&
                Objects.equals(adPlatformNoAdNetwork, ad.adPlatformNoAdNetwork) &&
                Objects.equals(disclaimerFinanceLicenseNo, ad.disclaimerFinanceLicenseNo) &&
                Objects.equals(autobidding, ad.autobidding) &&
                Objects.equals(category1Id, ad.category1Id) &&
                Objects.equals(startTime, ad.startTime) &&
                Objects.equals(impressionsLimit, ad.impressionsLimit) &&
                Objects.equals(name, ad.name) &&
                Objects.equals(status, ad.status) &&
                Objects.equals(goalType, ad.goalType) &&
                Objects.equals(autobiddingMaxCost, ad.autobiddingMaxCost) &&
                Objects.equals(stopTime, ad.stopTime) &&
                Objects.equals(dayLimit, ad.dayLimit) &&
                Objects.equals(video, ad.video) &&
                Objects.equals(weeklyScheduleUseHolidays, ad.weeklyScheduleUseHolidays) &&
                Objects.equals(allLimit, ad.allLimit) &&
                Objects.equals(impressionsLimited, ad.impressionsLimited) &&
                Objects.equals(weeklyScheduleHours, ad.weeklyScheduleHours) &&
                Objects.equals(updateTime, ad.updateTime) &&
                Objects.equals(suggestedCriteria, ad.suggestedCriteria) &&
                Objects.equals(adPlatformNoWall, ad.adPlatformNoWall) &&
                Objects.equals(disclaimerSupplements, ad.disclaimerSupplements) &&
                Objects.equals(ocpm, ad.ocpm) &&
                Objects.equals(impressionsLimitPeriod, ad.impressionsLimitPeriod) &&
                Objects.equals(linkOwnerId, ad.linkOwnerId) &&
                Objects.equals(linkType, ad.linkType) &&
                Objects.equals(conversionEventId, ad.conversionEventId) &&
                Objects.equals(disclaimerSpecialist, ad.disclaimerSpecialist) &&
                Objects.equals(adPlatform, ad.adPlatform) &&
                Objects.equals(disclaimerFinanceName, ad.disclaimerFinanceName) &&
                Objects.equals(eventsRetargetingGroups, ad.eventsRetargetingGroups) &&
                Objects.equals(ageRestriction, ad.ageRestriction) &&
                Objects.equals(isPromo, ad.isPromo) &&
                Objects.equals(userGoalType, ad.userGoalType) &&
                Objects.equals(conversionPixelId, ad.conversionPixelId) &&
                Objects.equals(disclaimerMedical, ad.disclaimerMedical);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Ad{");
        sb.append("costType=").append(costType);
        sb.append(", linkId=").append(linkId);
        sb.append(", approved=").append(approved);
        sb.append(", cpa='").append(cpa).append("'");
        sb.append(", disclaimerFinance=").append(disclaimerFinance);
        sb.append(", cpc='").append(cpc).append("'");
        sb.append(", publisherPlatformsAuto=").append(publisherPlatformsAuto);
        sb.append(", linkUrl='").append(linkUrl).append("'");
        sb.append(", id=").append(id);
        sb.append(", publisherPlatforms='").append(publisherPlatforms).append("'");
        sb.append(", campaignId=").append(campaignId);
        sb.append(", category2Id=").append(category2Id);
        sb.append(", adFormat=").append(adFormat);
        sb.append(", cpm='").append(cpm).append("'");
        sb.append(", createTime=").append(createTime);
        sb.append(", hasCampaignBudgetOptimization=").append(hasCampaignBudgetOptimization);
        sb.append(", adPlatformNoAdNetwork=").append(adPlatformNoAdNetwork);
        sb.append(", disclaimerFinanceLicenseNo='").append(disclaimerFinanceLicenseNo).append("'");
        sb.append(", autobidding=").append(autobidding);
        sb.append(", category1Id=").append(category1Id);
        sb.append(", startTime=").append(startTime);
        sb.append(", impressionsLimit=").append(impressionsLimit);
        sb.append(", name='").append(name).append("'");
        sb.append(", status=").append(status);
        sb.append(", goalType=").append(goalType);
        sb.append(", autobiddingMaxCost='").append(autobiddingMaxCost).append("'");
        sb.append(", stopTime=").append(stopTime);
        sb.append(", dayLimit='").append(dayLimit).append("'");
        sb.append(", video=").append(video);
        sb.append(", weeklyScheduleUseHolidays=").append(weeklyScheduleUseHolidays);
        sb.append(", allLimit='").append(allLimit).append("'");
        sb.append(", impressionsLimited=").append(impressionsLimited);
        sb.append(", weeklyScheduleHours='").append(weeklyScheduleHours).append("'");
        sb.append(", updateTime=").append(updateTime);
        sb.append(", suggestedCriteria=").append(suggestedCriteria);
        sb.append(", adPlatformNoWall=").append(adPlatformNoWall);
        sb.append(", disclaimerSupplements=").append(disclaimerSupplements);
        sb.append(", ocpm='").append(ocpm).append("'");
        sb.append(", impressionsLimitPeriod=").append(impressionsLimitPeriod);
        sb.append(", linkOwnerId=").append(linkOwnerId);
        sb.append(", linkType=").append(linkType);
        sb.append(", conversionEventId=").append(conversionEventId);
        sb.append(", disclaimerSpecialist=").append(disclaimerSpecialist);
        sb.append(", adPlatform=").append(adPlatform);
        sb.append(", disclaimerFinanceName='").append(disclaimerFinanceName).append("'");
        sb.append(", eventsRetargetingGroups=").append(eventsRetargetingGroups);
        sb.append(", ageRestriction=").append(ageRestriction);
        sb.append(", isPromo=").append(isPromo);
        sb.append(", userGoalType=").append(userGoalType);
        sb.append(", conversionPixelId=").append(conversionPixelId);
        sb.append(", disclaimerMedical=").append(disclaimerMedical);
        sb.append('}');
        return sb.toString();
    }
}