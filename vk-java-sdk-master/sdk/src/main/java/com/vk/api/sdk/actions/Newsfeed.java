// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.objects.newsfeed.IgnoreItemType;
import com.vk.api.sdk.objects.newsfeed.UnsubscribeType;
import com.vk.api.sdk.queries.newsfeed.NewsfeedAddBanQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedDeleteBanQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedDeleteListQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetBannedQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetBannedQueryWithExtended;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetCommentsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetListsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetListsQueryWithExtended;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetMentionsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetRecommendedQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetSuggestedSourcesQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedIgnoreItemQueryWithItem;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSaveListQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSearchQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSearchQueryWithExtended;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSearchQueryWithExtendedStrict;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSearchQueryWithStrict;
import com.vk.api.sdk.queries.newsfeed.NewsfeedUnignoreItemQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedUnsubscribeQuery;

/**
 * List of Newsfeed methods
 */
public class Newsfeed extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Newsfeed(VkApiClient client) {
        super(client);
    }

    /**
     * Prevents news from specified users and communities from appearing in the current user's newsfeed.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.addBan")
    public NewsfeedAddBanQuery addBan(UserActor actor) {
        return new NewsfeedAddBanQuery(getClient(), actor);
    }

    /**
     * Allows news from previously banned users and communities to be shown in the current user's newsfeed.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.deleteBan")
    public NewsfeedDeleteBanQuery deleteBan(UserActor actor) {
        return new NewsfeedDeleteBanQuery(getClient(), actor);
    }

    /**
     * @param actor vk user actor
     * @param listId
     * @return query
     */
    @ApiMethod("newsfeed.deleteList")
    public NewsfeedDeleteListQuery deleteList(UserActor actor, Integer listId) {
        return new NewsfeedDeleteListQuery(getClient(), actor, listId);
    }

    /**
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("newsfeed.deleteList")
    public NewsfeedDeleteListQuery deleteList(UserActor actor) {
        return new NewsfeedDeleteListQuery(getClient(), actor);
    }

    /**
     * Returns data required to show newsfeed for the current user.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.get")
    public NewsfeedGetQuery get(UserActor actor) {
        return new NewsfeedGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getBanned")
    public NewsfeedGetBannedQuery getBanned(UserActor actor) {
        return new NewsfeedGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getBanned")
    public NewsfeedGetBannedQueryWithExtended getBannedExtended(UserActor actor) {
        return new NewsfeedGetBannedQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of comments in the current user's newsfeed.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getComments")
    public NewsfeedGetCommentsQuery getComments(UserActor actor) {
        return new NewsfeedGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds followed by the current user.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getLists")
    public NewsfeedGetListsQueryWithExtended getListsExtended(UserActor actor) {
        return new NewsfeedGetListsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds followed by the current user.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getLists")
    public NewsfeedGetListsQuery getLists(UserActor actor) {
        return new NewsfeedGetListsQuery(getClient(), actor);
    }

    /**
     * Returns a list of posts on user walls in which the current user is mentioned.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getMentions")
    public NewsfeedGetMentionsQuery getMentions(UserActor actor) {
        return new NewsfeedGetMentionsQuery(getClient(), actor);
    }

    /**
     * , Returns a list of newsfeeds recommended to the current user.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getRecommended")
    public NewsfeedGetRecommendedQuery getRecommended(UserActor actor) {
        return new NewsfeedGetRecommendedQuery(getClient(), actor);
    }

    /**
     * Returns communities and users that current user is suggested to follow.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.getSuggestedSources")
    public NewsfeedGetSuggestedSourcesQuery getSuggestedSources(UserActor actor) {
        return new NewsfeedGetSuggestedSourcesQuery(getClient(), actor);
    }

    /**
     * Hides an item from the newsfeed.
     *
     * @param actor vk user actor
     * @param type Item type. Possible values: *'wall' - post on the wall,, *'tag' - tag on a photo,, *'profilephoto' - profile photo,, *'video' - video,, *'audio' - audio.
     * @return query
     */
    @ApiMethod("newsfeed.ignoreItem")
    public NewsfeedIgnoreItemQueryWithItem ignoreItemItem(UserActor actor, IgnoreItemType type) {
        return new NewsfeedIgnoreItemQueryWithItem(getClient(), actor, type);
    }

    /**
     * Creates and edits user newsfeed lists
     *
     * @param actor vk user actor
     * @param title list name.
     * @return query
     */
    @ApiMethod("newsfeed.saveList")
    public NewsfeedSaveListQuery saveList(UserActor actor, String title) {
        return new NewsfeedSaveListQuery(getClient(), actor, title);
    }

    /**
     * Creates and edits user newsfeed lists
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("newsfeed.saveList")
    public NewsfeedSaveListQuery saveList(UserActor actor) {
        return new NewsfeedSaveListQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQueryWithExtendedStrict searchExtendedStrict(UserActor actor) {
        return new NewsfeedSearchQueryWithExtendedStrict(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQueryWithExtendedStrict searchExtendedStrict(ServiceActor actor) {
        return new NewsfeedSearchQueryWithExtendedStrict(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQuery search(UserActor actor) {
        return new NewsfeedSearchQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQuery search(ServiceActor actor) {
        return new NewsfeedSearchQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQueryWithExtended searchExtended(UserActor actor) {
        return new NewsfeedSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQueryWithExtended searchExtended(ServiceActor actor) {
        return new NewsfeedSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQueryWithStrict searchStrict(UserActor actor) {
        return new NewsfeedSearchQueryWithStrict(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("newsfeed.search")
    public NewsfeedSearchQueryWithStrict searchStrict(ServiceActor actor) {
        return new NewsfeedSearchQueryWithStrict(getClient(), actor);
    }

    /**
     * Returns a hidden item to the newsfeed.
     *
     * @param actor vk user actor
     * @param type Item type. Possible values: *'wall' - post on the wall,, *'tag' - tag on a photo,, *'profilephoto' - profile photo,, *'video' - video,, *'audio' - audio.
     * @param ownerId Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' - user , 'owner_id=-1' - community "
     * @param itemId Item identifier
     * @return query
     */
    @ApiMethod("newsfeed.unignoreItem")
    public NewsfeedUnignoreItemQuery unignoreItem(UserActor actor, IgnoreItemType type,
            Long ownerId, Integer itemId) {
        return new NewsfeedUnignoreItemQuery(getClient(), actor, type, ownerId, itemId);
    }

    /**
     * Returns a hidden item to the newsfeed.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("newsfeed.unignoreItem")
    public NewsfeedUnignoreItemQuery unignoreItem(UserActor actor) {
        return new NewsfeedUnignoreItemQuery(getClient(), actor);
    }

    /**
     * Unsubscribes the current user from specified newsfeeds.
     *
     * @param actor vk user actor
     * @param type Type of object from which to unsubscribe: 'note' - note, 'photo' - photo, 'post' - post on user wall or community wall, 'topic' - topic, 'video' - video
     * @param itemId Object ID.
     * @return query
     */
    @ApiMethod("newsfeed.unsubscribe")
    public NewsfeedUnsubscribeQuery unsubscribe(UserActor actor, UnsubscribeType type,
            Integer itemId) {
        return new NewsfeedUnsubscribeQuery(getClient(), actor, type, itemId);
    }

    /**
     * Unsubscribes the current user from specified newsfeeds.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("newsfeed.unsubscribe")
    public NewsfeedUnsubscribeQuery unsubscribe(UserActor actor) {
        return new NewsfeedUnsubscribeQuery(getClient(), actor);
    }
}