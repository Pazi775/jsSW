// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.addToAlbum method
 */
public class MarketAddToAlbumQuery extends AbstractQueryBuilder<MarketAddToAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param itemIds value of "item ids" parameter.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketAddToAlbumQuery(VkApiClient client, UserActor actor, Long ownerId,
            Integer[] itemIds, Integer... albumIds) {
        super(client, "market.addToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemIds(itemIds);
        albumIds(albumIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param itemIds value of "item ids" parameter.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketAddToAlbumQuery(VkApiClient client, UserActor actor, Long ownerId,
            List<Integer> itemIds, List<Integer> albumIds) {
        super(client, "market.addToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemIds(itemIds);
        albumIds(albumIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketAddToAlbumQuery(VkApiClient client, UserActor actor) {
        super(client, "market.addToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of an item owner community.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public MarketAddToAlbumQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * itemIds
     * Set item ids
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("item_ids")
    public MarketAddToAlbumQuery itemIds(Integer... value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * Set item ids
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("item_ids")
    public MarketAddToAlbumQuery itemIds(List<Integer> value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * albumIds
     * Collections IDs to add item to.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_ids")
    public MarketAddToAlbumQuery albumIds(Integer... value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Collections IDs to add item to.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_ids")
    public MarketAddToAlbumQuery albumIds(List<Integer> value) {
        return unsafeParam("album_ids", value);
    }

    @Override
    protected MarketAddToAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_ids", "item_ids", "owner_id", "access_token");
    }
}