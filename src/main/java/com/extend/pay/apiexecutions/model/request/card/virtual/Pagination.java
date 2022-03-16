
package com.extend.pay.apiexecutions.model.request.card.virtual;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page",
    "pageItemCount",
    "totalItems",
    "numberOfPages"
})
@Generated("jsonschema2pojo")
public class Pagination implements Serializable
{

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("pageItemCount")
    private Integer pageItemCount;
    @JsonProperty("totalItems")
    private Integer totalItems;
    @JsonProperty("numberOfPages")
    private Integer numberOfPages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8475991512737989320L;

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    public Pagination withPage(Integer page) {
        this.page = page;
        return this;
    }

    @JsonProperty("pageItemCount")
    public Integer getPageItemCount() {
        return pageItemCount;
    }

    @JsonProperty("pageItemCount")
    public void setPageItemCount(Integer pageItemCount) {
        this.pageItemCount = pageItemCount;
    }

    public Pagination withPageItemCount(Integer pageItemCount) {
        this.pageItemCount = pageItemCount;
        return this;
    }

    @JsonProperty("totalItems")
    public Integer getTotalItems() {
        return totalItems;
    }

    @JsonProperty("totalItems")
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Pagination withTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    @JsonProperty("numberOfPages")
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    @JsonProperty("numberOfPages")
    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Pagination withNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Pagination withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pagination.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("page");
        sb.append('=');
        sb.append(((this.page == null)?"<null>":this.page));
        sb.append(',');
        sb.append("pageItemCount");
        sb.append('=');
        sb.append(((this.pageItemCount == null)?"<null>":this.pageItemCount));
        sb.append(',');
        sb.append("totalItems");
        sb.append('=');
        sb.append(((this.totalItems == null)?"<null>":this.totalItems));
        sb.append(',');
        sb.append("numberOfPages");
        sb.append('=');
        sb.append(((this.numberOfPages == null)?"<null>":this.numberOfPages));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
