// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class RulesHelpUrl {
    private JsonObject data;

    private Gson gson;

    public RulesHelpUrl(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }
}
