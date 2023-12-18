// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.notifications;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Notifications.markAsViewed method
 */
public class NotificationsMarkAsViewedQuery extends AbstractQueryBuilder<NotificationsMarkAsViewedQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public NotificationsMarkAsViewedQuery(VkApiClient client, UserActor actor) {
        super(client, "notifications.markAsViewed", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected NotificationsMarkAsViewedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
