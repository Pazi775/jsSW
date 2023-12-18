// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * UnblockScreenButtonFields object
 */
public class UnblockScreenButtonFields implements Validable {
    @SerializedName("id")
    private Number id;

    /**
     * Надпись на кнопке
     */
    @SerializedName("text")
    private String text;

    @SerializedName("type")
    @Required
    private UnblockScreenButtonFieldsType type;

    public Number getId() {
        return id;
    }

    public UnblockScreenButtonFields setId(Number id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public UnblockScreenButtonFields setText(String text) {
        this.text = text;
        return this;
    }

    public UnblockScreenButtonFieldsType getType() {
        return type;
    }

    public UnblockScreenButtonFields setType(UnblockScreenButtonFieldsType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenButtonFields unblockScreenButtonFields = (UnblockScreenButtonFields) o;
        return Objects.equals(id, unblockScreenButtonFields.id) &&
                Objects.equals(text, unblockScreenButtonFields.text) &&
                Objects.equals(type, unblockScreenButtonFields.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenButtonFields{");
        sb.append("id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}