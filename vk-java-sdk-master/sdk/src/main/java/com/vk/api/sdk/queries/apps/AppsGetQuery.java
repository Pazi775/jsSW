// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.apps.AppFields;
import com.vk.api.sdk.objects.apps.GetPlatform;
import com.vk.api.sdk.objects.apps.responses.GetResponse;
import com.vk.api.sdk.objects.base.NameCase;
import com.vk.api.sdk.objects.users.Fields;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.get method
 */
public class AppsGetQuery extends AbstractQueryBuilder<AppsGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsGetQuery(VkApiClient client, UserActor actor) {
        super(client, "apps.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsGetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.get", GetResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Application ID
     *
     * @param value value of "app id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("app_id")
    public AppsGetQuery appId(Integer value) {
        return unsafeParam("app_id", value);
    }

    /**
     * Platform. Possible values: *'ios' - iOS,, *'android' - Android,, *'winphone' - Windows Phone,, *'web' - приложения на vk.com. By default: 'web'.
     *
     * @param value value of "platform" parameter. By default web.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("platform")
    public AppsGetQuery platform(GetPlatform value) {
        return unsafeParam("platform", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public AppsGetQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set return friends
     *
     * @param value value of "return friends" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("return_friends")
    public AppsGetQuery returnFriends(Boolean value) {
        return unsafeParam("return_friends", value);
    }

    /**
     * Case for declension of user name and surname: 'nom' - nominative (default),, 'gen' - genitive,, 'dat' - dative,, 'acc' - accusative,, 'ins' - instrumental,, 'abl' - prepositional. (only if 'return_friends' = '1')
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("name_case")
    public AppsGetQuery nameCase(NameCase value) {
        return unsafeParam("name_case", value);
    }

    /**
     * appIds
     * List of application ID
     *
     * @param value value of "app ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("app_ids")
    public AppsGetQuery appIds(Integer... value) {
        return unsafeParam("app_ids", value);
    }

    /**
     * List of application ID
     *
     * @param value value of "app ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("app_ids")
    public AppsGetQuery appIds(List<Integer> value) {
        return unsafeParam("app_ids", value);
    }

    /**
     * fields
     * Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'contacts', 'education', 'online', 'counters', 'relation', 'last_seen', 'activity', 'can_write_private_message', 'can_see_all_posts', 'can_post', 'universities', (only if return_friends - 1)
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public AppsGetQuery fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'contacts', 'education', 'online', 'counters', 'relation', 'last_seen', 'activity', 'can_write_private_message', 'can_see_all_posts', 'can_post', 'universities', (only if return_friends - 1)
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public AppsGetQuery fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    /**
     * appFields
     * List of app fields to return. Fields 'id', 'type' and 'title' will always be in response. Leave this field empty to get all fields
     *
     * @param value value of "app fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("app_fields")
    public AppsGetQuery appFields(AppFields... value) {
        return unsafeParam("app_fields", value);
    }

    /**
     * List of app fields to return. Fields 'id', 'type' and 'title' will always be in response. Leave this field empty to get all fields
     *
     * @param value value of "app fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("app_fields")
    public AppsGetQuery appFields(List<AppFields> value) {
        return unsafeParam("app_fields", value);
    }

    @Override
    protected AppsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}