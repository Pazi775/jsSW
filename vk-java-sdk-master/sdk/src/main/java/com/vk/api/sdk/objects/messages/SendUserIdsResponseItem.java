// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.MessageError;
import java.util.Objects;

/**
 * SendUserIdsResponseItem object
 */
public class SendUserIdsResponseItem implements Validable {
    @SerializedName("conversation_message_id")
    private Integer conversationMessageId;

    @SerializedName("error")
    private MessageError error;

    @SerializedName("message_id")
    @Required
    private Integer messageId;

    /**
     * Entity: peer
     */
    @SerializedName("peer_id")
    @Required
    private Long peerId;

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public SendUserIdsResponseItem setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public MessageError getError() {
        return error;
    }

    public SendUserIdsResponseItem setError(MessageError error) {
        this.error = error;
        return this;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public SendUserIdsResponseItem setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    public Long getPeerId() {
        return peerId;
    }

    public SendUserIdsResponseItem setPeerId(Long peerId) {
        this.peerId = peerId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, conversationMessageId, messageId, error);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendUserIdsResponseItem sendUserIdsResponseItem = (SendUserIdsResponseItem) o;
        return Objects.equals(messageId, sendUserIdsResponseItem.messageId) &&
                Objects.equals(error, sendUserIdsResponseItem.error) &&
                Objects.equals(conversationMessageId, sendUserIdsResponseItem.conversationMessageId) &&
                Objects.equals(peerId, sendUserIdsResponseItem.peerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SendUserIdsResponseItem{");
        sb.append("messageId=").append(messageId);
        sb.append(", error=").append(error);
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append(", peerId=").append(peerId);
        sb.append('}');
        return sb.toString();
    }
}
