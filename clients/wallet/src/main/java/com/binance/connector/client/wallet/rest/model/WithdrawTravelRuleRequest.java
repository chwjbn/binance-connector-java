/*
 * Binance Wallet REST API
 * OpenAPI Specification for the Binance Wallet REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.wallet.rest.model;

import com.binance.connector.client.wallet.rest.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** WithdrawTravelRuleRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WithdrawTravelRuleRequest {
    public static final String SERIALIZED_NAME_COIN = "coin";

    @SerializedName(SERIALIZED_NAME_COIN)
    @jakarta.annotation.Nonnull
    private String coin;

    public static final String SERIALIZED_NAME_WITHDRAW_ORDER_ID = "withdrawOrderId";

    @SerializedName(SERIALIZED_NAME_WITHDRAW_ORDER_ID)
    @jakarta.annotation.Nullable
    private String withdrawOrderId;

    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    @jakarta.annotation.Nullable
    private String network;

    public static final String SERIALIZED_NAME_ADDRESS = "address";

    @SerializedName(SERIALIZED_NAME_ADDRESS)
    @jakarta.annotation.Nonnull
    private String address;

    public static final String SERIALIZED_NAME_ADDRESS_TAG = "addressTag";

    @SerializedName(SERIALIZED_NAME_ADDRESS_TAG)
    @jakarta.annotation.Nullable
    private String addressTag;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nonnull
    private Double amount;

    public static final String SERIALIZED_NAME_TRANSACTION_FEE_FLAG = "transactionFeeFlag";

    @SerializedName(SERIALIZED_NAME_TRANSACTION_FEE_FLAG)
    @jakarta.annotation.Nullable
    private Boolean transactionFeeFlag;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @jakarta.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_WALLET_TYPE = "walletType";

    @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
    @jakarta.annotation.Nullable
    private Long walletType;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public static final String SERIALIZED_NAME_QUESTIONNAIRE = "questionnaire";

    @SerializedName(SERIALIZED_NAME_QUESTIONNAIRE)
    @jakarta.annotation.Nonnull
    private String questionnaire;

    public WithdrawTravelRuleRequest() {}

    public WithdrawTravelRuleRequest coin(@jakarta.annotation.Nonnull String coin) {
        this.coin = coin;
        return this;
    }

    /**
     * Get coin
     *
     * @return coin
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getCoin() {
        return coin;
    }

    public void setCoin(@jakarta.annotation.Nonnull String coin) {
        this.coin = coin;
    }

    public WithdrawTravelRuleRequest withdrawOrderId(
            @jakarta.annotation.Nullable String withdrawOrderId) {
        this.withdrawOrderId = withdrawOrderId;
        return this;
    }

    /**
     * Get withdrawOrderId
     *
     * @return withdrawOrderId
     */
    @jakarta.annotation.Nullable
    public String getWithdrawOrderId() {
        return withdrawOrderId;
    }

    public void setWithdrawOrderId(@jakarta.annotation.Nullable String withdrawOrderId) {
        this.withdrawOrderId = withdrawOrderId;
    }

    public WithdrawTravelRuleRequest network(@jakarta.annotation.Nullable String network) {
        this.network = network;
        return this;
    }

    /**
     * Get network
     *
     * @return network
     */
    @jakarta.annotation.Nullable
    public String getNetwork() {
        return network;
    }

    public void setNetwork(@jakarta.annotation.Nullable String network) {
        this.network = network;
    }

    public WithdrawTravelRuleRequest address(@jakarta.annotation.Nonnull String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@jakarta.annotation.Nonnull String address) {
        this.address = address;
    }

    public WithdrawTravelRuleRequest addressTag(@jakarta.annotation.Nullable String addressTag) {
        this.addressTag = addressTag;
        return this;
    }

    /**
     * Get addressTag
     *
     * @return addressTag
     */
    @jakarta.annotation.Nullable
    public String getAddressTag() {
        return addressTag;
    }

    public void setAddressTag(@jakarta.annotation.Nullable String addressTag) {
        this.addressTag = addressTag;
    }

    public WithdrawTravelRuleRequest amount(@jakarta.annotation.Nonnull Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getAmount() {
        return amount;
    }

    public void setAmount(@jakarta.annotation.Nonnull Double amount) {
        this.amount = amount;
    }

    public WithdrawTravelRuleRequest transactionFeeFlag(
            @jakarta.annotation.Nullable Boolean transactionFeeFlag) {
        this.transactionFeeFlag = transactionFeeFlag;
        return this;
    }

    /**
     * Get transactionFeeFlag
     *
     * @return transactionFeeFlag
     */
    @jakarta.annotation.Nullable
    public Boolean getTransactionFeeFlag() {
        return transactionFeeFlag;
    }

    public void setTransactionFeeFlag(@jakarta.annotation.Nullable Boolean transactionFeeFlag) {
        this.transactionFeeFlag = transactionFeeFlag;
    }

    public WithdrawTravelRuleRequest name(@jakarta.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@jakarta.annotation.Nullable String name) {
        this.name = name;
    }

    public WithdrawTravelRuleRequest walletType(@jakarta.annotation.Nullable Long walletType) {
        this.walletType = walletType;
        return this;
    }

    /**
     * Get walletType
     *
     * @return walletType
     */
    @jakarta.annotation.Nullable
    public Long getWalletType() {
        return walletType;
    }

    public void setWalletType(@jakarta.annotation.Nullable Long walletType) {
        this.walletType = walletType;
    }

    public WithdrawTravelRuleRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
        return this;
    }

    /**
     * Get recvWindow
     *
     * @return recvWindow
     */
    @jakarta.annotation.Nullable
    public Long getRecvWindow() {
        return recvWindow;
    }

    public void setRecvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
    }

    public WithdrawTravelRuleRequest questionnaire(
            @jakarta.annotation.Nonnull String questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }

    /**
     * Get questionnaire
     *
     * @return questionnaire
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(@jakarta.annotation.Nonnull String questionnaire) {
        this.questionnaire = questionnaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WithdrawTravelRuleRequest withdrawTravelRuleRequest = (WithdrawTravelRuleRequest) o;
        return Objects.equals(this.coin, withdrawTravelRuleRequest.coin)
                && Objects.equals(this.withdrawOrderId, withdrawTravelRuleRequest.withdrawOrderId)
                && Objects.equals(this.network, withdrawTravelRuleRequest.network)
                && Objects.equals(this.address, withdrawTravelRuleRequest.address)
                && Objects.equals(this.addressTag, withdrawTravelRuleRequest.addressTag)
                && Objects.equals(this.amount, withdrawTravelRuleRequest.amount)
                && Objects.equals(
                        this.transactionFeeFlag, withdrawTravelRuleRequest.transactionFeeFlag)
                && Objects.equals(this.name, withdrawTravelRuleRequest.name)
                && Objects.equals(this.walletType, withdrawTravelRuleRequest.walletType)
                && Objects.equals(this.recvWindow, withdrawTravelRuleRequest.recvWindow)
                && Objects.equals(this.questionnaire, withdrawTravelRuleRequest.questionnaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                coin,
                withdrawOrderId,
                network,
                address,
                addressTag,
                amount,
                transactionFeeFlag,
                name,
                walletType,
                recvWindow,
                questionnaire);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WithdrawTravelRuleRequest {\n");
        sb.append("		coin: ").append(toIndentedString(coin)).append("\n");
        sb.append("		withdrawOrderId: ").append(toIndentedString(withdrawOrderId)).append("\n");
        sb.append("		network: ").append(toIndentedString(network)).append("\n");
        sb.append("		address: ").append(toIndentedString(address)).append("\n");
        sb.append("		addressTag: ").append(toIndentedString(addressTag)).append("\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		transactionFeeFlag: ")
                .append(toIndentedString(transactionFeeFlag))
                .append("\n");
        sb.append("		name: ").append(toIndentedString(name)).append("\n");
        sb.append("		walletType: ").append(toIndentedString(walletType)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("		questionnaire: ").append(toIndentedString(questionnaire)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object coinValue = getCoin();
        String coinValueAsString = "";
        coinValueAsString = coinValue.toString();
        sb.append("coin=").append(urlEncode(coinValueAsString)).append("");
        Object withdrawOrderIdValue = getWithdrawOrderId();
        String withdrawOrderIdValueAsString = "";
        withdrawOrderIdValueAsString = withdrawOrderIdValue.toString();
        sb.append("withdrawOrderId=").append(urlEncode(withdrawOrderIdValueAsString)).append("");
        Object networkValue = getNetwork();
        String networkValueAsString = "";
        networkValueAsString = networkValue.toString();
        sb.append("network=").append(urlEncode(networkValueAsString)).append("");
        Object addressValue = getAddress();
        String addressValueAsString = "";
        addressValueAsString = addressValue.toString();
        sb.append("address=").append(urlEncode(addressValueAsString)).append("");
        Object addressTagValue = getAddressTag();
        String addressTagValueAsString = "";
        addressTagValueAsString = addressTagValue.toString();
        sb.append("addressTag=").append(urlEncode(addressTagValueAsString)).append("");
        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
        Object transactionFeeFlagValue = getTransactionFeeFlag();
        String transactionFeeFlagValueAsString = "";
        transactionFeeFlagValueAsString = transactionFeeFlagValue.toString();
        sb.append("transactionFeeFlag=")
                .append(urlEncode(transactionFeeFlagValueAsString))
                .append("");
        Object nameValue = getName();
        String nameValueAsString = "";
        nameValueAsString = nameValue.toString();
        sb.append("name=").append(urlEncode(nameValueAsString)).append("");
        Object walletTypeValue = getWalletType();
        String walletTypeValueAsString = "";
        walletTypeValueAsString = walletTypeValue.toString();
        sb.append("walletType=").append(urlEncode(walletTypeValueAsString)).append("");
        Object recvWindowValue = getRecvWindow();
        String recvWindowValueAsString = "";
        recvWindowValueAsString = recvWindowValue.toString();
        sb.append("recvWindow=").append(urlEncode(recvWindowValueAsString)).append("");
        Object questionnaireValue = getQuestionnaire();
        String questionnaireValueAsString = "";
        questionnaireValueAsString = questionnaireValue.toString();
        sb.append("questionnaire=").append(urlEncode(questionnaireValueAsString)).append("");
        return sb.toString();
    }

    public static String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(StandardCharsets.UTF_8.name() + " is unsupported", e);
        }
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n		");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("coin");
        openapiFields.add("withdrawOrderId");
        openapiFields.add("network");
        openapiFields.add("address");
        openapiFields.add("addressTag");
        openapiFields.add("amount");
        openapiFields.add("transactionFeeFlag");
        openapiFields.add("name");
        openapiFields.add("walletType");
        openapiFields.add("recvWindow");
        openapiFields.add("questionnaire");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("coin");
        openapiRequiredFields.add("address");
        openapiRequiredFields.add("amount");
        openapiRequiredFields.add("questionnaire");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WithdrawTravelRuleRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WithdrawTravelRuleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WithdrawTravelRuleRequest is not found"
                                        + " in the empty JSON string",
                                WithdrawTravelRuleRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WithdrawTravelRuleRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("coin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `coin` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("coin").toString()));
        }
        if ((jsonObj.get("withdrawOrderId") != null && !jsonObj.get("withdrawOrderId").isJsonNull())
                && !jsonObj.get("withdrawOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `withdrawOrderId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("withdrawOrderId").toString()));
        }
        if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull())
                && !jsonObj.get("network").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `network` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("network").toString()));
        }
        if (!jsonObj.get("address").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `address` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("address").toString()));
        }
        if ((jsonObj.get("addressTag") != null && !jsonObj.get("addressTag").isJsonNull())
                && !jsonObj.get("addressTag").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `addressTag` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("addressTag").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("questionnaire").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `questionnaire` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("questionnaire").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WithdrawTravelRuleRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WithdrawTravelRuleRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WithdrawTravelRuleRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WithdrawTravelRuleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WithdrawTravelRuleRequest>() {
                        @Override
                        public void write(JsonWriter out, WithdrawTravelRuleRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public WithdrawTravelRuleRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of WithdrawTravelRuleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WithdrawTravelRuleRequest
     * @throws IOException if the JSON string is invalid with respect to WithdrawTravelRuleRequest
     */
    public static WithdrawTravelRuleRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WithdrawTravelRuleRequest.class);
    }

    /**
     * Convert an instance of WithdrawTravelRuleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
