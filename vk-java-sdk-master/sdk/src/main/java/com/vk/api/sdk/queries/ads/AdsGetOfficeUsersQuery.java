// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetOfficeUsersResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getOfficeUsers method
 */
public class AdsGetOfficeUsersQuery extends AbstractQueryBuilder<AdsGetOfficeUsersQuery, List<GetOfficeUsersResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetOfficeUsersQuery(VkApiClient client, UserActor actor, Integer accountId) {
        super(client, "ads.getOfficeUsers", Utils.buildParametrizedType(List.class, GetOfficeUsersResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsGetOfficeUsersQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.getOfficeUsers", Utils.buildParametrizedType(List.class, GetOfficeUsersResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsGetOfficeUsersQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    @Override
    protected AdsGetOfficeUsersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}
