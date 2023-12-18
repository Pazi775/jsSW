// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.bugtracker.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.bugtracker.BugreportSubscribeState;
import com.vk.api.sdk.objects.bugtracker.Comment;
import java.util.Objects;

/**
 * CreateCommentResponse object
 */
public class CreateCommentResponse implements Validable {
    @SerializedName("comment")
    @Required
    private Comment comment;

    @SerializedName("comment_flood")
    private Boolean commentFlood;

    @SerializedName("subscribe_state")
    private BugreportSubscribeState subscribeState;

    public Comment getComment() {
        return comment;
    }

    public CreateCommentResponse setComment(Comment comment) {
        this.comment = comment;
        return this;
    }

    public Boolean getCommentFlood() {
        return commentFlood;
    }

    public CreateCommentResponse setCommentFlood(Boolean commentFlood) {
        this.commentFlood = commentFlood;
        return this;
    }

    public BugreportSubscribeState getSubscribeState() {
        return subscribeState;
    }

    public CreateCommentResponse setSubscribeState(BugreportSubscribeState subscribeState) {
        this.subscribeState = subscribeState;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribeState, commentFlood, comment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCommentResponse createCommentResponse = (CreateCommentResponse) o;
        return Objects.equals(subscribeState, createCommentResponse.subscribeState) &&
                Objects.equals(commentFlood, createCommentResponse.commentFlood) &&
                Objects.equals(comment, createCommentResponse.comment);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CreateCommentResponse{");
        sb.append("subscribeState=").append(subscribeState);
        sb.append(", commentFlood=").append(commentFlood);
        sb.append(", comment=").append(comment);
        sb.append('}');
        return sb.toString();
    }
}
