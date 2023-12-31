// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.queries.search.SearchGetHintsQuery;

/**
 * List of Search methods
 */
public class Search extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Search(VkApiClient client) {
        super(client);
    }

    /**
     * Allows the programmer to do a quick search for any substring.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("search.getHints")
    public SearchGetHintsQuery getHints(UserActor actor) {
        return new SearchGetHintsQuery(getClient(), actor);
    }
}
