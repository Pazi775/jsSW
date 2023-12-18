// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.account.CountersFilter;
import com.vk.api.sdk.objects.account.responses.GetCountersResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getCounters method
 */
public class AccountGetCountersQuery extends AbstractQueryBuilder<AccountGetCountersQuery, GetCountersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AccountGetCountersQuery(VkApiClient client, UserActor actor) {
        super(client, "account.getCounters", GetCountersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * filter
     * Counters to be returned.
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("filter")
    public AccountGetCountersQuery filter(CountersFilter... value) {
        return unsafeParam("filter", value);
    }

    /**
     * Counters to be returned.
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("filter")
    public AccountGetCountersQuery filter(List<CountersFilter> value) {
        return unsafeParam("filter", value);
    }

    @Override
    protected AccountGetCountersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
