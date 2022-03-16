
package com.extend.pay.apiexecutions.model.response.transaction;

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
    "source",
    "virtualCardId",
    "type",
    "status",
    "approvalCode",
    "authBillingAmountCents",
    "authBillingCurrency",
    "authMerchantAmountCents",
    "authMerchantCurrency",
    "clearingBillingAmountCents",
    "clearingMerchantAmountCents",
    "mcc",
    "mccGroup",
    "mccDescription",
    "merchantName",
    "referenceId",
    "creditCardId"
})
@Generated("jsonschema2pojo")
public class TransactionResponse implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("source")
    private String source;
    @JsonProperty("virtualCardId")
    private String virtualCardId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("status")
    private String status;
    @JsonProperty("approvalCode")
    private String approvalCode;
    @JsonProperty("authBillingAmountCents")
    private Integer authBillingAmountCents;
    @JsonProperty("authBillingCurrency")
    private String authBillingCurrency;
    @JsonProperty("authMerchantAmountCents")
    private Integer authMerchantAmountCents;
    @JsonProperty("authMerchantCurrency")
    private String authMerchantCurrency;
    @JsonProperty("clearingBillingAmountCents")
    private Integer clearingBillingAmountCents;
    @JsonProperty("clearingMerchantAmountCents")
    private Integer clearingMerchantAmountCents;
    @JsonProperty("mcc")
    private String mcc;
    @JsonProperty("mccGroup")
    private String mccGroup;
    @JsonProperty("mccDescription")
    private String mccDescription;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("referenceId")
    private String referenceId;
    @JsonProperty("creditCardId")
    private String creditCardId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6700156203151395396L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TransactionResponse withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public TransactionResponse withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("virtualCardId")
    public String getVirtualCardId() {
        return virtualCardId;
    }

    @JsonProperty("virtualCardId")
    public void setVirtualCardId(String virtualCardId) {
        this.virtualCardId = virtualCardId;
    }

    public TransactionResponse withVirtualCardId(String virtualCardId) {
        this.virtualCardId = virtualCardId;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public TransactionResponse withType(String type) {
        this.type = type;
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

    public TransactionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("approvalCode")
    public String getApprovalCode() {
        return approvalCode;
    }

    @JsonProperty("approvalCode")
    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public TransactionResponse withApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
        return this;
    }

    @JsonProperty("authBillingAmountCents")
    public Integer getAuthBillingAmountCents() {
        return authBillingAmountCents;
    }

    @JsonProperty("authBillingAmountCents")
    public void setAuthBillingAmountCents(Integer authBillingAmountCents) {
        this.authBillingAmountCents = authBillingAmountCents;
    }

    public TransactionResponse withAuthBillingAmountCents(Integer authBillingAmountCents) {
        this.authBillingAmountCents = authBillingAmountCents;
        return this;
    }

    @JsonProperty("authBillingCurrency")
    public String getAuthBillingCurrency() {
        return authBillingCurrency;
    }

    @JsonProperty("authBillingCurrency")
    public void setAuthBillingCurrency(String authBillingCurrency) {
        this.authBillingCurrency = authBillingCurrency;
    }

    public TransactionResponse withAuthBillingCurrency(String authBillingCurrency) {
        this.authBillingCurrency = authBillingCurrency;
        return this;
    }

    @JsonProperty("authMerchantAmountCents")
    public Integer getAuthMerchantAmountCents() {
        return authMerchantAmountCents;
    }

    @JsonProperty("authMerchantAmountCents")
    public void setAuthMerchantAmountCents(Integer authMerchantAmountCents) {
        this.authMerchantAmountCents = authMerchantAmountCents;
    }

    public TransactionResponse withAuthMerchantAmountCents(Integer authMerchantAmountCents) {
        this.authMerchantAmountCents = authMerchantAmountCents;
        return this;
    }

    @JsonProperty("authMerchantCurrency")
    public String getAuthMerchantCurrency() {
        return authMerchantCurrency;
    }

    @JsonProperty("authMerchantCurrency")
    public void setAuthMerchantCurrency(String authMerchantCurrency) {
        this.authMerchantCurrency = authMerchantCurrency;
    }

    public TransactionResponse withAuthMerchantCurrency(String authMerchantCurrency) {
        this.authMerchantCurrency = authMerchantCurrency;
        return this;
    }

    @JsonProperty("clearingBillingAmountCents")
    public Integer getClearingBillingAmountCents() {
        return clearingBillingAmountCents;
    }

    @JsonProperty("clearingBillingAmountCents")
    public void setClearingBillingAmountCents(Integer clearingBillingAmountCents) {
        this.clearingBillingAmountCents = clearingBillingAmountCents;
    }

    public TransactionResponse withClearingBillingAmountCents(Integer clearingBillingAmountCents) {
        this.clearingBillingAmountCents = clearingBillingAmountCents;
        return this;
    }

    @JsonProperty("clearingMerchantAmountCents")
    public Integer getClearingMerchantAmountCents() {
        return clearingMerchantAmountCents;
    }

    @JsonProperty("clearingMerchantAmountCents")
    public void setClearingMerchantAmountCents(Integer clearingMerchantAmountCents) {
        this.clearingMerchantAmountCents = clearingMerchantAmountCents;
    }

    public TransactionResponse withClearingMerchantAmountCents(Integer clearingMerchantAmountCents) {
        this.clearingMerchantAmountCents = clearingMerchantAmountCents;
        return this;
    }

    @JsonProperty("mcc")
    public String getMcc() {
        return mcc;
    }

    @JsonProperty("mcc")
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public TransactionResponse withMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    @JsonProperty("mccGroup")
    public String getMccGroup() {
        return mccGroup;
    }

    @JsonProperty("mccGroup")
    public void setMccGroup(String mccGroup) {
        this.mccGroup = mccGroup;
    }

    public TransactionResponse withMccGroup(String mccGroup) {
        this.mccGroup = mccGroup;
        return this;
    }

    @JsonProperty("mccDescription")
    public String getMccDescription() {
        return mccDescription;
    }

    @JsonProperty("mccDescription")
    public void setMccDescription(String mccDescription) {
        this.mccDescription = mccDescription;
    }

    public TransactionResponse withMccDescription(String mccDescription) {
        this.mccDescription = mccDescription;
        return this;
    }

    @JsonProperty("merchantName")
    public String getMerchantName() {
        return merchantName;
    }

    @JsonProperty("merchantName")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public TransactionResponse withMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public TransactionResponse withReferenceId(String referenceId) {
        this.referenceId = referenceId;
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

    public TransactionResponse withCreditCardId(String creditCardId) {
        this.creditCardId = creditCardId;
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

    public TransactionResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("virtualCardId");
        sb.append('=');
        sb.append(((this.virtualCardId == null)?"<null>":this.virtualCardId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("approvalCode");
        sb.append('=');
        sb.append(((this.approvalCode == null)?"<null>":this.approvalCode));
        sb.append(',');
        sb.append("authBillingAmountCents");
        sb.append('=');
        sb.append(((this.authBillingAmountCents == null)?"<null>":this.authBillingAmountCents));
        sb.append(',');
        sb.append("authBillingCurrency");
        sb.append('=');
        sb.append(((this.authBillingCurrency == null)?"<null>":this.authBillingCurrency));
        sb.append(',');
        sb.append("authMerchantAmountCents");
        sb.append('=');
        sb.append(((this.authMerchantAmountCents == null)?"<null>":this.authMerchantAmountCents));
        sb.append(',');
        sb.append("authMerchantCurrency");
        sb.append('=');
        sb.append(((this.authMerchantCurrency == null)?"<null>":this.authMerchantCurrency));
        sb.append(',');
        sb.append("clearingBillingAmountCents");
        sb.append('=');
        sb.append(((this.clearingBillingAmountCents == null)?"<null>":this.clearingBillingAmountCents));
        sb.append(',');
        sb.append("clearingMerchantAmountCents");
        sb.append('=');
        sb.append(((this.clearingMerchantAmountCents == null)?"<null>":this.clearingMerchantAmountCents));
        sb.append(',');
        sb.append("mcc");
        sb.append('=');
        sb.append(((this.mcc == null)?"<null>":this.mcc));
        sb.append(',');
        sb.append("mccGroup");
        sb.append('=');
        sb.append(((this.mccGroup == null)?"<null>":this.mccGroup));
        sb.append(',');
        sb.append("mccDescription");
        sb.append('=');
        sb.append(((this.mccDescription == null)?"<null>":this.mccDescription));
        sb.append(',');
        sb.append("merchantName");
        sb.append('=');
        sb.append(((this.merchantName == null)?"<null>":this.merchantName));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
        sb.append(',');
        sb.append("creditCardId");
        sb.append('=');
        sb.append(((this.creditCardId == null)?"<null>":this.creditCardId));
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
