// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.objects.groups.GroupFull;

public class SubscriptionsItem {
    private JsonObject data;

    private Gson gson;

    public SubscriptionsItem(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public UserFull getOneOf0() {
        return gson.fromJson(data.toString(), UserFull.class);
    }

    public GroupFull getOneOf1() {
        return gson.fromJson(data.toString(), GroupFull.class);
    }
}
