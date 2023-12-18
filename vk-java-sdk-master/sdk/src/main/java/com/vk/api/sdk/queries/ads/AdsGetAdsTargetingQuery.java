// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetAdsTargetingResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getAdsTargeting method
 */
public class AdsGetAdsTargetingQuery extends AbstractQueryBuilder<AdsGetAdsTargetingQuery, List<GetAdsTargetingResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetAdsTargetingQuery(VkApiClient client, UserActor actor, Integer accountId) {
        super(client, "ads.getAdsTargeting", Utils.buildParametrizedType(List.class, GetAdsTargetingResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsGetAdsTargetingQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.getAdsTargeting", Utils.buildParametrizedType(List.class, GetAdsTargetingResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsGetAdsTargetingQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * 'For advertising agencies.' ID of the client ads are retrieved from.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("client_id")
    public AdsGetAdsTargetingQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Flag that specifies whether archived ads shall be shown: *0 - show only active ads,, *1 - show all ads.
     *
     * @param value value of "include deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("include_deleted")
    public AdsGetAdsTargetingQuery includeDeleted(Boolean value) {
        return unsafeParam("include_deleted", value);
    }

    /**
     * Set only deleted
     *
     * @param value value of "only deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("only_deleted")
    public AdsGetAdsTargetingQuery onlyDeleted(Boolean value) {
        return unsafeParam("only_deleted", value);
    }

    /**
     * Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
     *
     * @param value value of "campaign ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("campaign_ids")
    public AdsGetAdsTargetingQuery campaignIds(String value) {
        return unsafeParam("campaign_ids", value);
    }

    /**
     * Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
     *
     * @param value value of "ad ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("ad_ids")
    public AdsGetAdsTargetingQuery adIds(String value) {
        return unsafeParam("ad_ids", value);
    }

    /**
     * Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
     *
     * @param value value of "limit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("limit")
    public AdsGetAdsTargetingQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Offset needed to return a specific subset of results.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public AdsGetAdsTargetingQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected AdsGetAdsTargetingQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}
