// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * DonutSubscriptionPriceChanged object
 */
public class DonutSubscriptionPriceChanged implements Validable {
    @SerializedName("amount_diff")
    private Number amountDiff;

    @SerializedName("amount_diff_without_fee")
    private Number amountDiffWithoutFee;

    @SerializedName("amount_new")
    @Required
    private Integer amountNew;

    @SerializedName("amount_old")
    @Required
    private Integer amountOld;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    private Long userId;

    public Number getAmountDiff() {
        return amountDiff;
    }

    public DonutSubscriptionPriceChanged setAmountDiff(Number amountDiff) {
        this.amountDiff = amountDiff;
        return this;
    }

    public Number getAmountDiffWithoutFee() {
        return amountDiffWithoutFee;
    }

    public DonutSubscriptionPriceChanged setAmountDiffWithoutFee(Number amountDiffWithoutFee) {
        this.amountDiffWithoutFee = amountDiffWithoutFee;
        return this;
    }

    public Integer getAmountNew() {
        return amountNew;
    }

    public DonutSubscriptionPriceChanged setAmountNew(Integer amountNew) {
        this.amountNew = amountNew;
        return this;
    }

    public Integer getAmountOld() {
        return amountOld;
    }

    public DonutSubscriptionPriceChanged setAmountOld(Integer amountOld) {
        this.amountOld = amountOld;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public DonutSubscriptionPriceChanged setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOld, amountNew, amountDiff, amountDiffWithoutFee, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonutSubscriptionPriceChanged donutSubscriptionPriceChanged = (DonutSubscriptionPriceChanged) o;
        return Objects.equals(amountDiffWithoutFee, donutSubscriptionPriceChanged.amountDiffWithoutFee) &&
                Objects.equals(userId, donutSubscriptionPriceChanged.userId) &&
                Objects.equals(amountDiff, donutSubscriptionPriceChanged.amountDiff) &&
                Objects.equals(amountOld, donutSubscriptionPriceChanged.amountOld) &&
                Objects.equals(amountNew, donutSubscriptionPriceChanged.amountNew);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DonutSubscriptionPriceChanged{");
        sb.append("amountDiffWithoutFee=").append(amountDiffWithoutFee);
        sb.append(", userId=").append(userId);
        sb.append(", amountDiff=").append(amountDiff);
        sb.append(", amountOld=").append(amountOld);
        sb.append(", amountNew=").append(amountNew);
        sb.append('}');
        return sb.toString();
    }
}