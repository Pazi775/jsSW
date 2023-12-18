// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetTargetingStatsResponse object
 */
public class GetTargetingStatsResponse implements Validable {
    /**
     * Audience
     */
    @SerializedName("audience_count")
    @Required
    private Integer audienceCount;

    /**
     * Recommended CPC value for 50% reach (old format)
     */
    @SerializedName("recommended_cpc")
    private String recommendedCpc;

    /**
     * Recommended CPC value for 50% reach
     */
    @SerializedName("recommended_cpc_50")
    private String recommendedCpc50;

    /**
     * Recommended CPC value for 70% reach
     */
    @SerializedName("recommended_cpc_70")
    private String recommendedCpc70;

    /**
     * Recommended CPC value for 90% reach
     */
    @SerializedName("recommended_cpc_90")
    private String recommendedCpc90;

    /**
     * Recommended CPM value for 50% reach (old format)
     */
    @SerializedName("recommended_cpm")
    private String recommendedCpm;

    /**
     * Recommended CPM value for 50% reach
     */
    @SerializedName("recommended_cpm_50")
    private String recommendedCpm50;

    /**
     * Recommended CPM value for 70% reach
     */
    @SerializedName("recommended_cpm_70")
    private String recommendedCpm70;

    /**
     * Recommended CPM value for 90% reach
     */
    @SerializedName("recommended_cpm_90")
    private String recommendedCpm90;

    /**
     * Total alive audience
     */
    @SerializedName("total_alive_audience")
    private Integer totalAliveAudience;

    public Integer getAudienceCount() {
        return audienceCount;
    }

    public GetTargetingStatsResponse setAudienceCount(Integer audienceCount) {
        this.audienceCount = audienceCount;
        return this;
    }

    public String getRecommendedCpc() {
        return recommendedCpc;
    }

    public GetTargetingStatsResponse setRecommendedCpc(String recommendedCpc) {
        this.recommendedCpc = recommendedCpc;
        return this;
    }

    public String getRecommendedCpc50() {
        return recommendedCpc50;
    }

    public GetTargetingStatsResponse setRecommendedCpc50(String recommendedCpc50) {
        this.recommendedCpc50 = recommendedCpc50;
        return this;
    }

    public String getRecommendedCpc70() {
        return recommendedCpc70;
    }

    public GetTargetingStatsResponse setRecommendedCpc70(String recommendedCpc70) {
        this.recommendedCpc70 = recommendedCpc70;
        return this;
    }

    public String getRecommendedCpc90() {
        return recommendedCpc90;
    }

    public GetTargetingStatsResponse setRecommendedCpc90(String recommendedCpc90) {
        this.recommendedCpc90 = recommendedCpc90;
        return this;
    }

    public String getRecommendedCpm() {
        return recommendedCpm;
    }

    public GetTargetingStatsResponse setRecommendedCpm(String recommendedCpm) {
        this.recommendedCpm = recommendedCpm;
        return this;
    }

    public String getRecommendedCpm50() {
        return recommendedCpm50;
    }

    public GetTargetingStatsResponse setRecommendedCpm50(String recommendedCpm50) {
        this.recommendedCpm50 = recommendedCpm50;
        return this;
    }

    public String getRecommendedCpm70() {
        return recommendedCpm70;
    }

    public GetTargetingStatsResponse setRecommendedCpm70(String recommendedCpm70) {
        this.recommendedCpm70 = recommendedCpm70;
        return this;
    }

    public String getRecommendedCpm90() {
        return recommendedCpm90;
    }

    public GetTargetingStatsResponse setRecommendedCpm90(String recommendedCpm90) {
        this.recommendedCpm90 = recommendedCpm90;
        return this;
    }

    public Integer getTotalAliveAudience() {
        return totalAliveAudience;
    }

    public GetTargetingStatsResponse setTotalAliveAudience(Integer totalAliveAudience) {
        this.totalAliveAudience = totalAliveAudience;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAliveAudience, recommendedCpc90, recommendedCpm50, recommendedCpc50, recommendedCpm, recommendedCpc70, audienceCount, recommendedCpc, recommendedCpm70, recommendedCpm90);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTargetingStatsResponse getTargetingStatsResponse = (GetTargetingStatsResponse) o;
        return Objects.equals(recommendedCpc50, getTargetingStatsResponse.recommendedCpc50) &&
                Objects.equals(recommendedCpm70, getTargetingStatsResponse.recommendedCpm70) &&
                Objects.equals(totalAliveAudience, getTargetingStatsResponse.totalAliveAudience) &&
                Objects.equals(recommendedCpm50, getTargetingStatsResponse.recommendedCpm50) &&
                Objects.equals(recommendedCpc, getTargetingStatsResponse.recommendedCpc) &&
                Objects.equals(recommendedCpm90, getTargetingStatsResponse.recommendedCpm90) &&
                Objects.equals(audienceCount, getTargetingStatsResponse.audienceCount) &&
                Objects.equals(recommendedCpm, getTargetingStatsResponse.recommendedCpm) &&
                Objects.equals(recommendedCpc90, getTargetingStatsResponse.recommendedCpc90) &&
                Objects.equals(recommendedCpc70, getTargetingStatsResponse.recommendedCpc70);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTargetingStatsResponse{");
        sb.append("recommendedCpc50='").append(recommendedCpc50).append("'");
        sb.append(", recommendedCpm70='").append(recommendedCpm70).append("'");
        sb.append(", totalAliveAudience=").append(totalAliveAudience);
        sb.append(", recommendedCpm50='").append(recommendedCpm50).append("'");
        sb.append(", recommendedCpc='").append(recommendedCpc).append("'");
        sb.append(", recommendedCpm90='").append(recommendedCpm90).append("'");
        sb.append(", audienceCount=").append(audienceCount);
        sb.append(", recommendedCpm='").append(recommendedCpm).append("'");
        sb.append(", recommendedCpc90='").append(recommendedCpc90).append("'");
        sb.append(", recommendedCpc70='").append(recommendedCpc70).append("'");
        sb.append('}');
        return sb.toString();
    }
}