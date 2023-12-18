// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class KeyboardButtonPropertyAction {
    private JsonObject data;

    private Gson gson;

    public KeyboardButtonPropertyAction(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public KeyboardButtonActionLocation getOneOf0() {
        return gson.fromJson(data.toString(), KeyboardButtonActionLocation.class);
    }

    public KeyboardButtonActionOpenApp getOneOf1() {
        return gson.fromJson(data.toString(), KeyboardButtonActionOpenApp.class);
    }

    public KeyboardButtonActionOpenLink getOneOf2() {
        return gson.fromJson(data.toString(), KeyboardButtonActionOpenLink.class);
    }

    public KeyboardButtonActionOpenPhoto getOneOf3() {
        return gson.fromJson(data.toString(), KeyboardButtonActionOpenPhoto.class);
    }

    public KeyboardButtonActionText getOneOf4() {
        return gson.fromJson(data.toString(), KeyboardButtonActionText.class);
    }

    public KeyboardButtonActionCallback getOneOf5() {
        return gson.fromJson(data.toString(), KeyboardButtonActionCallback.class);
    }

    public KeyboardButtonActionVkpay getOneOf6() {
        return gson.fromJson(data.toString(), KeyboardButtonActionVkpay.class);
    }
}
