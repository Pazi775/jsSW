// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetCampaignsResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getCampaigns method
 */
public class AdsGetCampaignsQuery extends AbstractQueryBuilder<AdsGetCampaignsQuery, List<GetCampaignsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetCampaignsQuery(VkApiClient client, UserActor actor, Integer accountId) {
        super(client, "ads.getCampaigns", Utils.buildParametrizedType(List.class, GetCampaignsResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsGetCampaignsQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.getCampaigns", Utils.buildParametrizedType(List.class, GetCampaignsResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsGetCampaignsQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * 'For advertising agencies'. ID of the client advertising campaigns are retrieved from.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("client_id")
    public AdsGetCampaignsQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Flag that specifies whether archived ads shall be shown. *0 - show only active campaigns,, *1 - show all campaigns.
     *
     * @param value value of "include deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("include_deleted")
    public AdsGetCampaignsQuery includeDeleted(Boolean value) {
        return unsafeParam("include_deleted", value);
    }

    /**
     * Filter of advertising campaigns to show. Serialized JSON array with campaign IDs. Only campaigns that exist in 'campaign_ids' and belong to the specified advertising account will be shown. If the parameter is null, all campaigns will be shown.
     *
     * @param value value of "campaign ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("campaign_ids")
    public AdsGetCampaignsQuery campaignIds(String value) {
        return unsafeParam("campaign_ids", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public AdsGetCampaignsQuery fields(String... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public AdsGetCampaignsQuery fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected AdsGetCampaignsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}