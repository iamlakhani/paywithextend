
package com.extend.pay.apiexecutions.model.request.transaction;

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
    "id",
    "cardholderId",
    "cardholderName",
    "cardholderEmail",
    "recipientName",
    "recipientEmail",
    "recipientId",
    "nameOnCard",
    "source",
    "vcnLast4",
    "vcnDisplayName",
    "virtualCardId",
    "type",
    "status",
    "approvalCode",
    "authBillingAmountCents",
    "authBillingCurrency",
    "authMerchantAmountCents",
    "authMerchantCurrency",
    "authExchangeRate",
    "clearingBillingAmountCents",
    "clearingBillingCurrency",
    "clearingMerchantAmountCents",
    "clearingMerchantCurrency",
    "clearingExchangeRate",
    "mcc",
    "mccGroup",
    "mccDescription",
    "merchantName",
    "merchantAddress",
    "merchantCity",
    "merchantState",
    "merchantZip",
    "authedAt",
    "clearedAt",
    "updatedAt",
    "hasAttachments",
    "referenceId",
    "creditCardId",
    "sentToExpensify",
    "sentToQuickbooks",
    "attachmentsCount",
    "referenceFields",
    "creditCardDisplayName",
    "creditCardHasReferenceFields",
    "creditCardType"
})
@Generated("jsonschema2pojo")
public class Transaction implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("cardholderId")
    private String cardholderId;
    @JsonProperty("cardholderName")
    private String cardholderName;
    @JsonProperty("cardholderEmail")
    private String cardholderEmail;
    @JsonProperty("recipientName")
    private String recipientName;
    @JsonProperty("recipientEmail")
    private String recipientEmail;
    @JsonProperty("recipientId")
    private String recipientId;
    @JsonProperty("nameOnCard")
    private String nameOnCard;
    @JsonProperty("source")
    private String source;
    @JsonProperty("vcnLast4")
    private String vcnLast4;
    @JsonProperty("vcnDisplayName")
    private String vcnDisplayName;
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
    @JsonProperty("authExchangeRate")
    private Double authExchangeRate;
    @JsonProperty("clearingBillingAmountCents")
    private Integer clearingBillingAmountCents;
    @JsonProperty("clearingBillingCurrency")
    private String clearingBillingCurrency;
    @JsonProperty("clearingMerchantAmountCents")
    private Integer clearingMerchantAmountCents;
    @JsonProperty("clearingMerchantCurrency")
    private String clearingMerchantCurrency;
    @JsonProperty("clearingExchangeRate")
    private Double clearingExchangeRate;
    @JsonProperty("mcc")
    private String mcc;
    @JsonProperty("mccGroup")
    private String mccGroup;
    @JsonProperty("mccDescription")
    private String mccDescription;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("merchantAddress")
    private String merchantAddress;
    @JsonProperty("merchantCity")
    private String merchantCity;
    @JsonProperty("merchantState")
    private String merchantState;
    @JsonProperty("merchantZip")
    private String merchantZip;
    @JsonProperty("authedAt")
    private String authedAt;
    @JsonProperty("clearedAt")
    private String clearedAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("hasAttachments")
    private Boolean hasAttachments;
    @JsonProperty("referenceId")
    private String referenceId;
    @JsonProperty("creditCardId")
    private String creditCardId;
    @JsonProperty("sentToExpensify")
    private Boolean sentToExpensify;
    @JsonProperty("sentToQuickbooks")
    private Boolean sentToQuickbooks;
    @JsonProperty("attachmentsCount")
    private Integer attachmentsCount;
    @JsonProperty("referenceFields")
    private List<Object> referenceFields = null;
    @JsonProperty("creditCardDisplayName")
    private String creditCardDisplayName;
    @JsonProperty("creditCardHasReferenceFields")
    private Boolean creditCardHasReferenceFields;
    @JsonProperty("creditCardType")
    private String creditCardType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5647776116346119206L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Transaction withId(String id) {
        this.id = id;
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

    public Transaction withCardholderId(String cardholderId) {
        this.cardholderId = cardholderId;
        return this;
    }

    @JsonProperty("cardholderName")
    public String getCardholderName() {
        return cardholderName;
    }

    @JsonProperty("cardholderName")
    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public Transaction withCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
        return this;
    }

    @JsonProperty("cardholderEmail")
    public String getCardholderEmail() {
        return cardholderEmail;
    }

    @JsonProperty("cardholderEmail")
    public void setCardholderEmail(String cardholderEmail) {
        this.cardholderEmail = cardholderEmail;
    }

    public Transaction withCardholderEmail(String cardholderEmail) {
        this.cardholderEmail = cardholderEmail;
        return this;
    }

    @JsonProperty("recipientName")
    public String getRecipientName() {
        return recipientName;
    }

    @JsonProperty("recipientName")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public Transaction withRecipientName(String recipientName) {
        this.recipientName = recipientName;
        return this;
    }

    @JsonProperty("recipientEmail")
    public String getRecipientEmail() {
        return recipientEmail;
    }

    @JsonProperty("recipientEmail")
    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public Transaction withRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
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

    public Transaction withRecipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    @JsonProperty("nameOnCard")
    public String getNameOnCard() {
        return nameOnCard;
    }

    @JsonProperty("nameOnCard")
    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public Transaction withNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
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

    public Transaction withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("vcnLast4")
    public String getVcnLast4() {
        return vcnLast4;
    }

    @JsonProperty("vcnLast4")
    public void setVcnLast4(String vcnLast4) {
        this.vcnLast4 = vcnLast4;
    }

    public Transaction withVcnLast4(String vcnLast4) {
        this.vcnLast4 = vcnLast4;
        return this;
    }

    @JsonProperty("vcnDisplayName")
    public String getVcnDisplayName() {
        return vcnDisplayName;
    }

    @JsonProperty("vcnDisplayName")
    public void setVcnDisplayName(String vcnDisplayName) {
        this.vcnDisplayName = vcnDisplayName;
    }

    public Transaction withVcnDisplayName(String vcnDisplayName) {
        this.vcnDisplayName = vcnDisplayName;
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

    public Transaction withVirtualCardId(String virtualCardId) {
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

    public Transaction withType(String type) {
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

    public Transaction withStatus(String status) {
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

    public Transaction withApprovalCode(String approvalCode) {
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

    public Transaction withAuthBillingAmountCents(Integer authBillingAmountCents) {
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

    public Transaction withAuthBillingCurrency(String authBillingCurrency) {
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

    public Transaction withAuthMerchantAmountCents(Integer authMerchantAmountCents) {
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

    public Transaction withAuthMerchantCurrency(String authMerchantCurrency) {
        this.authMerchantCurrency = authMerchantCurrency;
        return this;
    }

    @JsonProperty("authExchangeRate")
    public Double getAuthExchangeRate() {
        return authExchangeRate;
    }

    @JsonProperty("authExchangeRate")
    public void setAuthExchangeRate(Double authExchangeRate) {
        this.authExchangeRate = authExchangeRate;
    }

    public Transaction withAuthExchangeRate(Double authExchangeRate) {
        this.authExchangeRate = authExchangeRate;
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

    public Transaction withClearingBillingAmountCents(Integer clearingBillingAmountCents) {
        this.clearingBillingAmountCents = clearingBillingAmountCents;
        return this;
    }

    @JsonProperty("clearingBillingCurrency")
    public String getClearingBillingCurrency() {
        return clearingBillingCurrency;
    }

    @JsonProperty("clearingBillingCurrency")
    public void setClearingBillingCurrency(String clearingBillingCurrency) {
        this.clearingBillingCurrency = clearingBillingCurrency;
    }

    public Transaction withClearingBillingCurrency(String clearingBillingCurrency) {
        this.clearingBillingCurrency = clearingBillingCurrency;
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

    public Transaction withClearingMerchantAmountCents(Integer clearingMerchantAmountCents) {
        this.clearingMerchantAmountCents = clearingMerchantAmountCents;
        return this;
    }

    @JsonProperty("clearingMerchantCurrency")
    public String getClearingMerchantCurrency() {
        return clearingMerchantCurrency;
    }

    @JsonProperty("clearingMerchantCurrency")
    public void setClearingMerchantCurrency(String clearingMerchantCurrency) {
        this.clearingMerchantCurrency = clearingMerchantCurrency;
    }

    public Transaction withClearingMerchantCurrency(String clearingMerchantCurrency) {
        this.clearingMerchantCurrency = clearingMerchantCurrency;
        return this;
    }

    @JsonProperty("clearingExchangeRate")
    public Double getClearingExchangeRate() {
        return clearingExchangeRate;
    }

    @JsonProperty("clearingExchangeRate")
    public void setClearingExchangeRate(Double clearingExchangeRate) {
        this.clearingExchangeRate = clearingExchangeRate;
    }

    public Transaction withClearingExchangeRate(Double clearingExchangeRate) {
        this.clearingExchangeRate = clearingExchangeRate;
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

    public Transaction withMcc(String mcc) {
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

    public Transaction withMccGroup(String mccGroup) {
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

    public Transaction withMccDescription(String mccDescription) {
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

    public Transaction withMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    @JsonProperty("merchantAddress")
    public String getMerchantAddress() {
        return merchantAddress;
    }

    @JsonProperty("merchantAddress")
    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public Transaction withMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
        return this;
    }

    @JsonProperty("merchantCity")
    public String getMerchantCity() {
        return merchantCity;
    }

    @JsonProperty("merchantCity")
    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public Transaction withMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
        return this;
    }

    @JsonProperty("merchantState")
    public String getMerchantState() {
        return merchantState;
    }

    @JsonProperty("merchantState")
    public void setMerchantState(String merchantState) {
        this.merchantState = merchantState;
    }

    public Transaction withMerchantState(String merchantState) {
        this.merchantState = merchantState;
        return this;
    }

    @JsonProperty("merchantZip")
    public String getMerchantZip() {
        return merchantZip;
    }

    @JsonProperty("merchantZip")
    public void setMerchantZip(String merchantZip) {
        this.merchantZip = merchantZip;
    }

    public Transaction withMerchantZip(String merchantZip) {
        this.merchantZip = merchantZip;
        return this;
    }

    @JsonProperty("authedAt")
    public String getAuthedAt() {
        return authedAt;
    }

    @JsonProperty("authedAt")
    public void setAuthedAt(String authedAt) {
        this.authedAt = authedAt;
    }

    public Transaction withAuthedAt(String authedAt) {
        this.authedAt = authedAt;
        return this;
    }

    @JsonProperty("clearedAt")
    public String getClearedAt() {
        return clearedAt;
    }

    @JsonProperty("clearedAt")
    public void setClearedAt(String clearedAt) {
        this.clearedAt = clearedAt;
    }

    public Transaction withClearedAt(String clearedAt) {
        this.clearedAt = clearedAt;
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

    public Transaction withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("hasAttachments")
    public Boolean getHasAttachments() {
        return hasAttachments;
    }

    @JsonProperty("hasAttachments")
    public void setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public Transaction withHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
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

    public Transaction withReferenceId(String referenceId) {
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

    public Transaction withCreditCardId(String creditCardId) {
        this.creditCardId = creditCardId;
        return this;
    }

    @JsonProperty("sentToExpensify")
    public Boolean getSentToExpensify() {
        return sentToExpensify;
    }

    @JsonProperty("sentToExpensify")
    public void setSentToExpensify(Boolean sentToExpensify) {
        this.sentToExpensify = sentToExpensify;
    }

    public Transaction withSentToExpensify(Boolean sentToExpensify) {
        this.sentToExpensify = sentToExpensify;
        return this;
    }

    @JsonProperty("sentToQuickbooks")
    public Boolean getSentToQuickbooks() {
        return sentToQuickbooks;
    }

    @JsonProperty("sentToQuickbooks")
    public void setSentToQuickbooks(Boolean sentToQuickbooks) {
        this.sentToQuickbooks = sentToQuickbooks;
    }

    public Transaction withSentToQuickbooks(Boolean sentToQuickbooks) {
        this.sentToQuickbooks = sentToQuickbooks;
        return this;
    }

    @JsonProperty("attachmentsCount")
    public Integer getAttachmentsCount() {
        return attachmentsCount;
    }

    @JsonProperty("attachmentsCount")
    public void setAttachmentsCount(Integer attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }

    public Transaction withAttachmentsCount(Integer attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
        return this;
    }

    @JsonProperty("referenceFields")
    public List<Object> getReferenceFields() {
        return referenceFields;
    }

    @JsonProperty("referenceFields")
    public void setReferenceFields(List<Object> referenceFields) {
        this.referenceFields = referenceFields;
    }

    public Transaction withReferenceFields(List<Object> referenceFields) {
        this.referenceFields = referenceFields;
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

    public Transaction withCreditCardDisplayName(String creditCardDisplayName) {
        this.creditCardDisplayName = creditCardDisplayName;
        return this;
    }

    @JsonProperty("creditCardHasReferenceFields")
    public Boolean getCreditCardHasReferenceFields() {
        return creditCardHasReferenceFields;
    }

    @JsonProperty("creditCardHasReferenceFields")
    public void setCreditCardHasReferenceFields(Boolean creditCardHasReferenceFields) {
        this.creditCardHasReferenceFields = creditCardHasReferenceFields;
    }

    public Transaction withCreditCardHasReferenceFields(Boolean creditCardHasReferenceFields) {
        this.creditCardHasReferenceFields = creditCardHasReferenceFields;
        return this;
    }

    @JsonProperty("creditCardType")
    public String getCreditCardType() {
        return creditCardType;
    }

    @JsonProperty("creditCardType")
    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public Transaction withCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
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

    public Transaction withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Transaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("cardholderId");
        sb.append('=');
        sb.append(((this.cardholderId == null)?"<null>":this.cardholderId));
        sb.append(',');
        sb.append("cardholderName");
        sb.append('=');
        sb.append(((this.cardholderName == null)?"<null>":this.cardholderName));
        sb.append(',');
        sb.append("cardholderEmail");
        sb.append('=');
        sb.append(((this.cardholderEmail == null)?"<null>":this.cardholderEmail));
        sb.append(',');
        sb.append("recipientName");
        sb.append('=');
        sb.append(((this.recipientName == null)?"<null>":this.recipientName));
        sb.append(',');
        sb.append("recipientEmail");
        sb.append('=');
        sb.append(((this.recipientEmail == null)?"<null>":this.recipientEmail));
        sb.append(',');
        sb.append("recipientId");
        sb.append('=');
        sb.append(((this.recipientId == null)?"<null>":this.recipientId));
        sb.append(',');
        sb.append("nameOnCard");
        sb.append('=');
        sb.append(((this.nameOnCard == null)?"<null>":this.nameOnCard));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("vcnLast4");
        sb.append('=');
        sb.append(((this.vcnLast4 == null)?"<null>":this.vcnLast4));
        sb.append(',');
        sb.append("vcnDisplayName");
        sb.append('=');
        sb.append(((this.vcnDisplayName == null)?"<null>":this.vcnDisplayName));
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
        sb.append("authExchangeRate");
        sb.append('=');
        sb.append(((this.authExchangeRate == null)?"<null>":this.authExchangeRate));
        sb.append(',');
        sb.append("clearingBillingAmountCents");
        sb.append('=');
        sb.append(((this.clearingBillingAmountCents == null)?"<null>":this.clearingBillingAmountCents));
        sb.append(',');
        sb.append("clearingBillingCurrency");
        sb.append('=');
        sb.append(((this.clearingBillingCurrency == null)?"<null>":this.clearingBillingCurrency));
        sb.append(',');
        sb.append("clearingMerchantAmountCents");
        sb.append('=');
        sb.append(((this.clearingMerchantAmountCents == null)?"<null>":this.clearingMerchantAmountCents));
        sb.append(',');
        sb.append("clearingMerchantCurrency");
        sb.append('=');
        sb.append(((this.clearingMerchantCurrency == null)?"<null>":this.clearingMerchantCurrency));
        sb.append(',');
        sb.append("clearingExchangeRate");
        sb.append('=');
        sb.append(((this.clearingExchangeRate == null)?"<null>":this.clearingExchangeRate));
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
        sb.append("merchantAddress");
        sb.append('=');
        sb.append(((this.merchantAddress == null)?"<null>":this.merchantAddress));
        sb.append(',');
        sb.append("merchantCity");
        sb.append('=');
        sb.append(((this.merchantCity == null)?"<null>":this.merchantCity));
        sb.append(',');
        sb.append("merchantState");
        sb.append('=');
        sb.append(((this.merchantState == null)?"<null>":this.merchantState));
        sb.append(',');
        sb.append("merchantZip");
        sb.append('=');
        sb.append(((this.merchantZip == null)?"<null>":this.merchantZip));
        sb.append(',');
        sb.append("authedAt");
        sb.append('=');
        sb.append(((this.authedAt == null)?"<null>":this.authedAt));
        sb.append(',');
        sb.append("clearedAt");
        sb.append('=');
        sb.append(((this.clearedAt == null)?"<null>":this.clearedAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("hasAttachments");
        sb.append('=');
        sb.append(((this.hasAttachments == null)?"<null>":this.hasAttachments));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
        sb.append(',');
        sb.append("creditCardId");
        sb.append('=');
        sb.append(((this.creditCardId == null)?"<null>":this.creditCardId));
        sb.append(',');
        sb.append("sentToExpensify");
        sb.append('=');
        sb.append(((this.sentToExpensify == null)?"<null>":this.sentToExpensify));
        sb.append(',');
        sb.append("sentToQuickbooks");
        sb.append('=');
        sb.append(((this.sentToQuickbooks == null)?"<null>":this.sentToQuickbooks));
        sb.append(',');
        sb.append("attachmentsCount");
        sb.append('=');
        sb.append(((this.attachmentsCount == null)?"<null>":this.attachmentsCount));
        sb.append(',');
        sb.append("referenceFields");
        sb.append('=');
        sb.append(((this.referenceFields == null)?"<null>":this.referenceFields));
        sb.append(',');
        sb.append("creditCardDisplayName");
        sb.append('=');
        sb.append(((this.creditCardDisplayName == null)?"<null>":this.creditCardDisplayName));
        sb.append(',');
        sb.append("creditCardHasReferenceFields");
        sb.append('=');
        sb.append(((this.creditCardHasReferenceFields == null)?"<null>":this.creditCardHasReferenceFields));
        sb.append(',');
        sb.append("creditCardType");
        sb.append('=');
        sb.append(((this.creditCardType == null)?"<null>":this.creditCardType));
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
