// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.WallpostCommentsDonut;
import java.util.List;
import java.util.Objects;

/**
 * CommentsInfo object
 */
public class CommentsInfo implements Validable {
    @SerializedName("can_close")
    private BoolInt canClose;

    @SerializedName("can_open")
    private BoolInt canOpen;

    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private BoolInt canPost;

    /**
     * Information whether current user can view the comments
     */
    @SerializedName("can_view")
    private BoolInt canView;

    /**
     * Comments number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("donut")
    private WallpostCommentsDonut donut;

    /**
     * Information whether groups can comment the post
     */
    @SerializedName("groups_can_post")
    private Boolean groupsCanPost;

    @SerializedName("list")
    private List<WallComment> list;

    public boolean canClose() {
        return canClose == BoolInt.YES;
    }

    public BoolInt getCanClose() {
        return canClose;
    }

    public boolean canOpen() {
        return canOpen == BoolInt.YES;
    }

    public BoolInt getCanOpen() {
        return canOpen;
    }

    public boolean canPost() {
        return canPost == BoolInt.YES;
    }

    public BoolInt getCanPost() {
        return canPost;
    }

    public boolean canView() {
        return canView == BoolInt.YES;
    }

    public BoolInt getCanView() {
        return canView;
    }

    public Integer getCount() {
        return count;
    }

    public CommentsInfo setCount(Integer count) {
        this.count = count;
        return this;
    }

    public WallpostCommentsDonut getDonut() {
        return donut;
    }

    public CommentsInfo setDonut(WallpostCommentsDonut donut) {
        this.donut = donut;
        return this;
    }

    public Boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public CommentsInfo setGroupsCanPost(Boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
        return this;
    }

    public List<WallComment> getList() {
        return list;
    }

    public CommentsInfo setList(List<WallComment> list) {
        this.list = list;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canClose, canView, canPost, donut, count, canOpen, groupsCanPost, list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsInfo commentsInfo = (CommentsInfo) o;
        return Objects.equals(canClose, commentsInfo.canClose) &&
                Objects.equals(canView, commentsInfo.canView) &&
                Objects.equals(donut, commentsInfo.donut) &&
                Objects.equals(count, commentsInfo.count) &&
                Objects.equals(groupsCanPost, commentsInfo.groupsCanPost) &&
                Objects.equals(canPost, commentsInfo.canPost) &&
                Objects.equals(list, commentsInfo.list) &&
                Objects.equals(canOpen, commentsInfo.canOpen);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentsInfo{");
        sb.append("canClose=").append(canClose);
        sb.append(", canView=").append(canView);
        sb.append(", donut=").append(donut);
        sb.append(", count=").append(count);
        sb.append(", groupsCanPost=").append(groupsCanPost);
        sb.append(", canPost=").append(canPost);
        sb.append(", list=").append(list);
        sb.append(", canOpen=").append(canOpen);
        sb.append('}');
        return sb.toString();
    }
}
