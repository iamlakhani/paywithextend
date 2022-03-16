
package com.extend.pay.apiexecutions.model.request.card.virtual;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "pagination",
    "virtualCards"
})
@Generated("jsonschema2pojo")
public class VirtualCards implements Serializable
{

    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("virtualCards")
    private List<VirtualCard> virtualCards = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -9051821079392311414L;

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public VirtualCards withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    @JsonProperty("virtualCards")
    public List<VirtualCard> getVirtualCards() {
        return virtualCards;
    }

    @JsonProperty("virtualCards")
    public void setVirtualCards(List<VirtualCard> virtualCards) {
        this.virtualCards = virtualCards;
    }

    public VirtualCards withVirtualCards(List<VirtualCard> virtualCards) {
        this.virtualCards = virtualCards;
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

    public VirtualCards withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VirtualCards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pagination");
        sb.append('=');
        sb.append(((this.pagination == null)?"<null>":this.pagination));
        sb.append(',');
        sb.append("virtualCards");
        sb.append('=');
        sb.append(((this.virtualCards == null)?"<null>":this.virtualCards));
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
