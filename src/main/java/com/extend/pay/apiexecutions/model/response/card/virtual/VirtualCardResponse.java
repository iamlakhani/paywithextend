
package com.extend.pay.apiexecutions.model.response.card.virtual;

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
    "status",
    "recipientId",
    "cardholderId",
    "displayName",
    "expires",
    "currency",
    "limitCents",
    "balanceCents",
    "spentCents",
    "lifetimeSpentCents",
    "last4",
    "numberFormat",
    "validFrom",
    "validTo",
    "timezone",
    "creditCardId",
    "recurs",
    "notes",
    "createdAt",
    "updatedAt",
    "hasPlasticCard",
    "activeUntil",
    "companyName",
    "creditCardDisplayName"
})
@Generated("jsonschema2pojo")
public class VirtualCardResponse implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("recipientId")
    private String recipientId;
    @JsonProperty("cardholderId")
    private String cardholderId;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("expires")
    private String expires;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("limitCents")
    private Integer limitCents;
    @JsonProperty("balanceCents")
    private Integer balanceCents;
    @JsonProperty("spentCents")
    private Integer spentCents;
    @JsonProperty("lifetimeSpentCents")
    private Integer lifetimeSpentCents;
    @JsonProperty("last4")
    private String last4;
    @JsonProperty("numberFormat")
    private String numberFormat;
    @JsonProperty("validFrom")
    private String validFrom;
    @JsonProperty("validTo")
    private String validTo;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("creditCardId")
    private String creditCardId;
    @JsonProperty("recurs")
    private Boolean recurs;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("hasPlasticCard")
    private Boolean hasPlasticCard;
    @JsonProperty("activeUntil")
    private String activeUntil;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("creditCardDisplayName")
    private String creditCardDisplayName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2704852897526154763L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public VirtualCardResponse withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public VirtualCardResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("recipientId")
    public String getRecipientId() {
        return recipientId;
    }

    @JsonProperty("recipientId")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public VirtualCardResponse withRecipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    @JsonProperty("cardholderId")
    public String getCardholderId() {
        return cardholderId;
    }

    @JsonProperty("cardholderId")
    public void setCardholderId(String cardholderId) {
        this.cardholderId = cardholderId;
    }

    public VirtualCardResponse withCardholderId(String cardholderId) {
        this.cardholderId = cardholderId;
        return this;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public VirtualCardResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("expires")
    public String getExpires() {
        return expires;
    }

    @JsonProperty("expires")
    public void setExpires(String expires) {
        this.expires = expires;
    }

    public VirtualCardResponse withExpires(String expires) {
        this.expires = expires;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public VirtualCardResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("limitCents")
    public Integer getLimitCents() {
        return limitCents;
    }

    @JsonProperty("limitCents")
    public void setLimitCents(Integer limitCents) {
        this.limitCents = limitCents;
    }

    public VirtualCardResponse withLimitCents(Integer limitCents) {
        this.limitCents = limitCents;
        return this;
    }

    @JsonProperty("balanceCents")
    public Integer getBalanceCents() {
        return balanceCents;
    }

    @JsonProperty("balanceCents")
    public void setBalanceCents(Integer balanceCents) {
        this.balanceCents = balanceCents;
    }

    public VirtualCardResponse withBalanceCents(Integer balanceCents) {
        this.balanceCents = balanceCents;
        return this;
    }

    @JsonProperty("spentCents")
    public Integer getSpentCents() {
        return spentCents;
    }

    @JsonProperty("spentCents")
    public void setSpentCents(Integer spentCents) {
        this.spentCents = spentCents;
    }

    public VirtualCardResponse withSpentCents(Integer spentCents) {
        this.spentCents = spentCents;
        return this;
    }

    @JsonProperty("lifetimeSpentCents")
    public Integer getLifetimeSpentCents() {
        return lifetimeSpentCents;
    }

    @JsonProperty("lifetimeSpentCents")
    public void setLifetimeSpentCents(Integer lifetimeSpentCents) {
        this.lifetimeSpentCents = lifetimeSpentCents;
    }

    public VirtualCardResponse withLifetimeSpentCents(Integer lifetimeSpentCents) {
        this.lifetimeSpentCents = lifetimeSpentCents;
        return this;
    }

    @JsonProperty("last4")
    public String getLast4() {
        return last4;
    }

    @JsonProperty("last4")
    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public VirtualCardResponse withLast4(String last4) {
        this.last4 = last4;
        return this;
    }

    @JsonProperty("numberFormat")
    public String getNumberFormat() {
        return numberFormat;
    }

    @JsonProperty("numberFormat")
    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    public VirtualCardResponse withNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    @JsonProperty("validFrom")
    public String getValidFrom() {
        return validFrom;
    }

    @JsonProperty("validFrom")
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public VirtualCardResponse withValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    @JsonProperty("validTo")
    public String getValidTo() {
        return validTo;
    }

    @JsonProperty("validTo")
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public VirtualCardResponse withValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public VirtualCardResponse withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("creditCardId")
    public String getCreditCardId() {
        return creditCardId;
    }

    @JsonProperty("creditCardId")
    public void setCreditCardId(String creditCardId) {
        this.creditCardId = creditCardId;
    }

    public VirtualCardResponse withCreditCardId(String creditCardId) {
        this.creditCardId = creditCardId;
        return this;
    }

    @JsonProperty("recurs")
    public Boolean getRecurs() {
        return recurs;
    }

    @JsonProperty("recurs")
    public void setRecurs(Boolean recurs) {
        this.recurs = recurs;
    }

    public VirtualCardResponse withRecurs(Boolean recurs) {
        this.recurs = recurs;
        return this;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public VirtualCardResponse withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public VirtualCardResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public VirtualCardResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("hasPlasticCard")
    public Boolean getHasPlasticCard() {
        return hasPlasticCard;
    }

    @JsonProperty("hasPlasticCard")
    public void setHasPlasticCard(Boolean hasPlasticCard) {
        this.hasPlasticCard = hasPlasticCard;
    }

    public VirtualCardResponse withHasPlasticCard(Boolean hasPlasticCard) {
        this.hasPlasticCard = hasPlasticCard;
        return this;
    }

    @JsonProperty("activeUntil")
    public String getActiveUntil() {
        return activeUntil;
    }

    @JsonProperty("activeUntil")
    public void setActiveUntil(String activeUntil) {
        this.activeUntil = activeUntil;
    }

    public VirtualCardResponse withActiveUntil(String activeUntil) {
        this.activeUntil = activeUntil;
        return this;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public VirtualCardResponse withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @JsonProperty("creditCardDisplayName")
    public String getCreditCardDisplayName() {
        return creditCardDisplayName;
    }

    @JsonProperty("creditCardDisplayName")
    public void setCreditCardDisplayName(String creditCardDisplayName) {
        this.creditCardDisplayName = creditCardDisplayName;
    }

    public VirtualCardResponse withCreditCardDisplayName(String creditCardDisplayName) {
        this.creditCardDisplayName = creditCardDisplayName;
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

    public VirtualCardResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VirtualCardResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("recipientId");
        sb.append('=');
        sb.append(((this.recipientId == null)?"<null>":this.recipientId));
        sb.append(',');
        sb.append("cardholderId");
        sb.append('=');
        sb.append(((this.cardholderId == null)?"<null>":this.cardholderId));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("expires");
        sb.append('=');
        sb.append(((this.expires == null)?"<null>":this.expires));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("limitCents");
        sb.append('=');
        sb.append(((this.limitCents == null)?"<null>":this.limitCents));
        sb.append(',');
        sb.append("balanceCents");
        sb.append('=');
        sb.append(((this.balanceCents == null)?"<null>":this.balanceCents));
        sb.append(',');
        sb.append("spentCents");
        sb.append('=');
        sb.append(((this.spentCents == null)?"<null>":this.spentCents));
        sb.append(',');
        sb.append("lifetimeSpentCents");
        sb.append('=');
        sb.append(((this.lifetimeSpentCents == null)?"<null>":this.lifetimeSpentCents));
        sb.append(',');
        sb.append("last4");
        sb.append('=');
        sb.append(((this.last4 == null)?"<null>":this.last4));
        sb.append(',');
        sb.append("numberFormat");
        sb.append('=');
        sb.append(((this.numberFormat == null)?"<null>":this.numberFormat));
        sb.append(',');
        sb.append("validFrom");
        sb.append('=');
        sb.append(((this.validFrom == null)?"<null>":this.validFrom));
        sb.append(',');
        sb.append("validTo");
        sb.append('=');
        sb.append(((this.validTo == null)?"<null>":this.validTo));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("creditCardId");
        sb.append('=');
        sb.append(((this.creditCardId == null)?"<null>":this.creditCardId));
        sb.append(',');
        sb.append("recurs");
        sb.append('=');
        sb.append(((this.recurs == null)?"<null>":this.recurs));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("hasPlasticCard");
        sb.append('=');
        sb.append(((this.hasPlasticCard == null)?"<null>":this.hasPlasticCard));
        sb.append(',');
        sb.append("activeUntil");
        sb.append('=');
        sb.append(((this.activeUntil == null)?"<null>":this.activeUntil));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null)?"<null>":this.companyName));
        sb.append(',');
        sb.append("creditCardDisplayName");
        sb.append('=');
        sb.append(((this.creditCardDisplayName == null)?"<null>":this.creditCardDisplayName));
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
