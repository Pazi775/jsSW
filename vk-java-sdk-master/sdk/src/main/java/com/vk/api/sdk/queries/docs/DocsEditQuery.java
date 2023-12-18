// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.edit method
 */
public class DocsEditQuery extends AbstractQueryBuilder<DocsEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param docId value of "doc id" parameter. Minimum is 0.
     * @param title value of "title" parameter.
     */
    public DocsEditQuery(VkApiClient client, UserActor actor, Integer docId, String title) {
        super(client, "docs.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        docId(docId);
        title(title);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DocsEditQuery(VkApiClient client, UserActor actor) {
        super(client, "docs.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public DocsEditQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Document ID.
     *
     * @param value value of "doc id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("doc_id")
    public DocsEditQuery docId(Integer value) {
        return unsafeParam("doc_id", value);
    }

    /**
     * Document title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("title")
    public DocsEditQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * tags
     * Document tags.
     *
     * @param value value of "tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("tags")
    public DocsEditQuery tags(String... value) {
        return unsafeParam("tags", value);
    }

    /**
     * Document tags.
     *
     * @param value value of "tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("tags")
    public DocsEditQuery tags(List<String> value) {
        return unsafeParam("tags", value);
    }

    @Override
    protected DocsEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "doc_id", "access_token");
    }
}