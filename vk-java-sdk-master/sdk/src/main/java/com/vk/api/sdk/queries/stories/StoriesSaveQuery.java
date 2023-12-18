// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.stories;

import com.google.gson.Gson;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.stories.UploadResult;
import com.vk.api.sdk.objects.stories.responses.SaveResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.save method
 */
public class StoriesSaveQuery extends AbstractQueryBuilder<StoriesSaveQuery, SaveResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesSaveQuery(VkApiClient client, GroupActor actor) {
        super(client, "stories.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesSaveQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public StoriesSaveQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * uploadResults
     * Set upload results
     *
     * @param value value of "upload results" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("upload_results")
    public StoriesSaveQuery uploadResults(String... value) {
        return unsafeParam("upload_results", value);
    }

    /**
     * Set upload results
     *
     * @param value value of "upload results" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("upload_results")
    public StoriesSaveQuery uploadResults(List<String> value) {
        return unsafeParam("upload_results", value);
    }

    /**
     * uploadResultsJson
     * Set upload results json
     *
     * @param value value of "upload results json" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("upload_results_json")
    public StoriesSaveQuery uploadResultsJson(UploadResult... value) {
        return unsafeParam("upload_results_json", new Gson().toJson(value));
    }

    /**
     * Set upload results json
     *
     * @param value value of "upload results json" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("upload_results_json")
    public StoriesSaveQuery uploadResultsJson(List<UploadResult> value) {
        return unsafeParam("upload_results_json", new Gson().toJson(value));
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public StoriesSaveQuery fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public StoriesSaveQuery fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected StoriesSaveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
