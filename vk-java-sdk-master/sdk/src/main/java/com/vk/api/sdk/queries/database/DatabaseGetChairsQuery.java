// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.database.responses.GetChairsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getChairs method
 */
public class DatabaseGetChairsQuery extends AbstractQueryBuilder<DatabaseGetChairsQuery, GetChairsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param facultyId value of "faculty id" parameter. Minimum is 0.
     */
    public DatabaseGetChairsQuery(VkApiClient client, UserActor actor, Integer facultyId) {
        super(client, "database.getChairs", GetChairsResponse.class);
        accessToken(actor.getAccessToken());
        facultyId(facultyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DatabaseGetChairsQuery(VkApiClient client, UserActor actor) {
        super(client, "database.getChairs", GetChairsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param facultyId value of "faculty id" parameter. Minimum is 0.
     */
    public DatabaseGetChairsQuery(VkApiClient client, ServiceActor actor, Integer facultyId) {
        super(client, "database.getChairs", GetChairsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        facultyId(facultyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DatabaseGetChairsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "database.getChairs", GetChairsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Id of the faculty to get chairs from
     *
     * @param value value of "faculty id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("faculty_id")
    public DatabaseGetChairsQuery facultyId(Integer value) {
        return unsafeParam("faculty_id", value);
    }

    /**
     * Offset required to get a certain subset of chairs
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public DatabaseGetChairsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Amount of chairs to get
     *
     * @param value value of "count" parameter. Maximum is 10000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public DatabaseGetChairsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetChairsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("faculty_id", "access_token");
    }
}