// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.MessageError;
import java.util.Objects;

/**
 * SendUserIdsResponse object
 */
public class SendUserIdsResponse implements Validable {
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

    public SendUserIdsResponse setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public MessageError getError() {
        return error;
    }

    public SendUserIdsResponse setError(MessageError error) {
        this.error = error;
        return this;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public SendUserIdsResponse setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    public Long getPeerId() {
        return peerId;
    }

    public SendUserIdsResponse setPeerId(Long peerId) {
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
        SendUserIdsResponse sendUserIdsResponse = (SendUserIdsResponse) o;
        return Objects.equals(messageId, sendUserIdsResponse.messageId) &&
                Objects.equals(error, sendUserIdsResponse.error) &&
                Objects.equals(conversationMessageId, sendUserIdsResponse.conversationMessageId) &&
                Objects.equals(peerId, sendUserIdsResponse.peerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SendUserIdsResponse{");
        sb.append("messageId=").append(messageId);
        sb.append(", error=").append(error);
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append(", peerId=").append(peerId);
        sb.append('}');
        return sb.toString();
    }
}