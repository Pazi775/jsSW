// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.bugtracker;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.bugtracker.responses.GetDownloadVersionUrlResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Bugtracker.getDownloadVersionUrl method
 */
public class BugtrackerGetDownloadVersionUrlQuery extends AbstractQueryBuilder<BugtrackerGetDownloadVersionUrlQuery, GetDownloadVersionUrlResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param productId value of "product id" parameter. Minimum is 0.
     * @param versionId value of "version id" parameter. Minimum is 0.
     */
    public BugtrackerGetDownloadVersionUrlQuery(VkApiClient client, ServiceActor actor,
            Integer productId, Integer versionId) {
        super(client, "bugtracker.getDownloadVersionUrl", GetDownloadVersionUrlResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        productId(productId);
        versionId(versionId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public BugtrackerGetDownloadVersionUrlQuery(VkApiClient client, ServiceActor actor) {
        super(client, "bugtracker.getDownloadVersionUrl", GetDownloadVersionUrlResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param productId value of "product id" parameter. Minimum is 0.
     * @param versionId value of "version id" parameter. Minimum is 0.
     */
    public BugtrackerGetDownloadVersionUrlQuery(VkApiClient client, UserActor actor,
            Integer productId, Integer versionId) {
        super(client, "bugtracker.getDownloadVersionUrl", GetDownloadVersionUrlResponse.class);
        accessToken(actor.getAccessToken());
        productId(productId);
        versionId(versionId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public BugtrackerGetDownloadVersionUrlQuery(VkApiClient client, UserActor actor) {
        super(client, "bugtracker.getDownloadVersionUrl", GetDownloadVersionUrlResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set product id
     *
     * @param value value of "product id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BugtrackerGetDownloadVersionUrlQuery productId(Integer value) {
        return unsafeParam("product_id", value);
    }

    /**
     * Set version id
     *
     * @param value value of "version id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BugtrackerGetDownloadVersionUrlQuery versionId(Integer value) {
        return unsafeParam("version_id", value);
    }

    /**
     * Set ttl
     *
     * @param value value of "ttl" parameter. Maximum is 31536000. Minimum is 1. By default 600.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BugtrackerGetDownloadVersionUrlQuery ttl(Integer value) {
        return unsafeParam("ttl", value);
    }

    @Override
    protected BugtrackerGetDownloadVersionUrlQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("product_id", "version_id", "access_token");
    }
}
