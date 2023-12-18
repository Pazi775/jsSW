// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * MarketCategoryTree object
 */
public class MarketCategoryTree implements Validable {
    @SerializedName("children")
    private List<MarketCategoryTree> children;

    /**
     * Icon name
     */
    @SerializedName("icon_name")
    private String iconName;

    /**
     * Category ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Category name
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * SEO-friendly URL to page with category's items
     */
    @SerializedName("url")
    private String url;

    @SerializedName("view")
    private MarketCategoryTreeView view;

    public List<MarketCategoryTree> getChildren() {
        return children;
    }

    public MarketCategoryTree setChildren(List<MarketCategoryTree> children) {
        this.children = children;
        return this;
    }

    public String getIconName() {
        return iconName;
    }

    public MarketCategoryTree setIconName(String iconName) {
        this.iconName = iconName;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public MarketCategoryTree setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MarketCategoryTree setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MarketCategoryTree setUrl(String url) {
        this.url = url;
        return this;
    }

    public MarketCategoryTreeView getView() {
        return view;
    }

    public MarketCategoryTree setView(MarketCategoryTreeView view) {
        this.view = view;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(view, children, iconName, name, id, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketCategoryTree marketCategoryTree = (MarketCategoryTree) o;
        return Objects.equals(view, marketCategoryTree.view) &&
                Objects.equals(children, marketCategoryTree.children) &&
                Objects.equals(name, marketCategoryTree.name) &&
                Objects.equals(id, marketCategoryTree.id) &&
                Objects.equals(iconName, marketCategoryTree.iconName) &&
                Objects.equals(url, marketCategoryTree.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketCategoryTree{");
        sb.append("view=").append(view);
        sb.append(", children=").append(children);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", iconName='").append(iconName).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append('}');
        return sb.toString();
    }
}