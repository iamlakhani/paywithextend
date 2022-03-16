
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
    "id",
    "contentType",
    "urls",
    "textColorRGBA",
    "hasTextShadow",
    "shadowTextColorRGBA"
})
@Generated("jsonschema2pojo")
public class CardImage implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("urls")
    private Urls urls;
    @JsonProperty("textColorRGBA")
    private String textColorRGBA;
    @JsonProperty("hasTextShadow")
    private Boolean hasTextShadow;
    @JsonProperty("shadowTextColorRGBA")
    private String shadowTextColorRGBA;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4887224511381808591L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CardImage withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public CardImage withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public CardImage withUrls(Urls urls) {
        this.urls = urls;
        return this;
    }

    @JsonProperty("textColorRGBA")
    public String getTextColorRGBA() {
        return textColorRGBA;
    }

    @JsonProperty("textColorRGBA")
    public void setTextColorRGBA(String textColorRGBA) {
        this.textColorRGBA = textColorRGBA;
    }

    public CardImage withTextColorRGBA(String textColorRGBA) {
        this.textColorRGBA = textColorRGBA;
        return this;
    }

    @JsonProperty("hasTextShadow")
    public Boolean getHasTextShadow() {
        return hasTextShadow;
    }

    @JsonProperty("hasTextShadow")
    public void setHasTextShadow(Boolean hasTextShadow) {
        this.hasTextShadow = hasTextShadow;
    }

    public CardImage withHasTextShadow(Boolean hasTextShadow) {
        this.hasTextShadow = hasTextShadow;
        return this;
    }

    @JsonProperty("shadowTextColorRGBA")
    public String getShadowTextColorRGBA() {
        return shadowTextColorRGBA;
    }

    @JsonProperty("shadowTextColorRGBA")
    public void setShadowTextColorRGBA(String shadowTextColorRGBA) {
        this.shadowTextColorRGBA = shadowTextColorRGBA;
    }

    public CardImage withShadowTextColorRGBA(String shadowTextColorRGBA) {
        this.shadowTextColorRGBA = shadowTextColorRGBA;
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

    public CardImage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CardImage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
        sb.append(',');
        sb.append("textColorRGBA");
        sb.append('=');
        sb.append(((this.textColorRGBA == null)?"<null>":this.textColorRGBA));
        sb.append(',');
        sb.append("hasTextShadow");
        sb.append('=');
        sb.append(((this.hasTextShadow == null)?"<null>":this.hasTextShadow));
        sb.append(',');
        sb.append("shadowTextColorRGBA");
        sb.append('=');
        sb.append(((this.shadowTextColorRGBA == null)?"<null>":this.shadowTextColorRGBA));
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
