
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
    "recurrence",
    "customAddress",
    "customMax"
})
@Generated("jsonschema2pojo")
public class Features implements Serializable
{

    @JsonProperty("recurrence")
    private Boolean recurrence;
    @JsonProperty("customAddress")
    private Boolean customAddress;
    @JsonProperty("customMax")
    private Boolean customMax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2206799368071173917L;

    @JsonProperty("recurrence")
    public Boolean getRecurrence() {
        return recurrence;
    }

    @JsonProperty("recurrence")
    public void setRecurrence(Boolean recurrence) {
        this.recurrence = recurrence;
    }

    public Features withRecurrence(Boolean recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    @JsonProperty("customAddress")
    public Boolean getCustomAddress() {
        return customAddress;
    }

    @JsonProperty("customAddress")
    public void setCustomAddress(Boolean customAddress) {
        this.customAddress = customAddress;
    }

    public Features withCustomAddress(Boolean customAddress) {
        this.customAddress = customAddress;
        return this;
    }

    @JsonProperty("customMax")
    public Boolean getCustomMax() {
        return customMax;
    }

    @JsonProperty("customMax")
    public void setCustomMax(Boolean customMax) {
        this.customMax = customMax;
    }

    public Features withCustomMax(Boolean customMax) {
        this.customMax = customMax;
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

    public Features withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Features.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recurrence");
        sb.append('=');
        sb.append(((this.recurrence == null)?"<null>":this.recurrence));
        sb.append(',');
        sb.append("customAddress");
        sb.append('=');
        sb.append(((this.customAddress == null)?"<null>":this.customAddress));
        sb.append(',');
        sb.append("customMax");
        sb.append('=');
        sb.append(((this.customMax == null)?"<null>":this.customMax));
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
