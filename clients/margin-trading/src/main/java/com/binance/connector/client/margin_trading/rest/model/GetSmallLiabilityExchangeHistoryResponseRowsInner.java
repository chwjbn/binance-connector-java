/*
 * Binance Margin Trading REST API
 * OpenAPI Specification for the Binance Margin Trading REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.margin_trading.rest.model;

import com.binance.connector.client.margin_trading.rest.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** GetSmallLiabilityExchangeHistoryResponseRowsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetSmallLiabilityExchangeHistoryResponseRowsInner {
    public static final String SERIALIZED_NAME_ASSET = "asset";

    @SerializedName(SERIALIZED_NAME_ASSET)
    @jakarta.annotation.Nullable
    private String asset;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nullable
    private String amount;

    public static final String SERIALIZED_NAME_TARGET_ASSET = "targetAsset";

    @SerializedName(SERIALIZED_NAME_TARGET_ASSET)
    @jakarta.annotation.Nullable
    private String targetAsset;

    public static final String SERIALIZED_NAME_TARGET_AMOUNT = "targetAmount";

    @SerializedName(SERIALIZED_NAME_TARGET_AMOUNT)
    @jakarta.annotation.Nullable
    private String targetAmount;

    public static final String SERIALIZED_NAME_BIZ_TYPE = "bizType";

    @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
    @jakarta.annotation.Nullable
    private String bizType;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    @jakarta.annotation.Nullable
    private Long timestamp;

    public GetSmallLiabilityExchangeHistoryResponseRowsInner() {}

    public GetSmallLiabilityExchangeHistoryResponseRowsInner asset(
            @jakarta.annotation.Nullable String asset) {
        this.asset = asset;
        return this;
    }

    /**
     * Get asset
     *
     * @return asset
     */
    @jakarta.annotation.Nullable
    public String getAsset() {
        return asset;
    }

    public void setAsset(@jakarta.annotation.Nullable String asset) {
        this.asset = asset;
    }

    public GetSmallLiabilityExchangeHistoryResponseRowsInner amount(
            @jakarta.annotation.Nullable String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nullable
    public String getAmount() {
        return amount;
    }

    public void setAmount(@jakarta.annotation.Nullable String amount) {
        this.amount = amount;
    }

    public GetSmallLiabilityExchangeHistoryResponseRowsInner targetAsset(
            @jakarta.annotation.Nullable String targetAsset) {
        this.targetAsset = targetAsset;
        return this;
    }

    /**
     * Get targetAsset
     *
     * @return targetAsset
     */
    @jakarta.annotation.Nullable
    public String getTargetAsset() {
        return targetAsset;
    }

    public void setTargetAsset(@jakarta.annotation.Nullable String targetAsset) {
        this.targetAsset = targetAsset;
    }

    public GetSmallLiabilityExchangeHistoryResponseRowsInner targetAmount(
            @jakarta.annotation.Nullable String targetAmount) {
        this.targetAmount = targetAmount;
        return this;
    }

    /**
     * Get targetAmount
     *
     * @return targetAmount
     */
    @jakarta.annotation.Nullable
    public String getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(@jakarta.annotation.Nullable String targetAmount) {
        this.targetAmount = targetAmount;
    }

    public GetSmallLiabilityExchangeHistoryResponseRowsInner bizType(
            @jakarta.annotation.Nullable String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     *
     * @return bizType
     */
    @jakarta.annotation.Nullable
    public String getBizType() {
        return bizType;
    }

    public void setBizType(@jakarta.annotation.Nullable String bizType) {
        this.bizType = bizType;
    }

    public GetSmallLiabilityExchangeHistoryResponseRowsInner timestamp(
            @jakarta.annotation.Nullable Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     */
    @jakarta.annotation.Nullable
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(@jakarta.annotation.Nullable Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSmallLiabilityExchangeHistoryResponseRowsInner
                getSmallLiabilityExchangeHistoryResponseRowsInner =
                        (GetSmallLiabilityExchangeHistoryResponseRowsInner) o;
        return Objects.equals(this.asset, getSmallLiabilityExchangeHistoryResponseRowsInner.asset)
                && Objects.equals(
                        this.amount, getSmallLiabilityExchangeHistoryResponseRowsInner.amount)
                && Objects.equals(
                        this.targetAsset,
                        getSmallLiabilityExchangeHistoryResponseRowsInner.targetAsset)
                && Objects.equals(
                        this.targetAmount,
                        getSmallLiabilityExchangeHistoryResponseRowsInner.targetAmount)
                && Objects.equals(
                        this.bizType, getSmallLiabilityExchangeHistoryResponseRowsInner.bizType)
                && Objects.equals(
                        this.timestamp,
                        getSmallLiabilityExchangeHistoryResponseRowsInner.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asset, amount, targetAsset, targetAmount, bizType, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSmallLiabilityExchangeHistoryResponseRowsInner {\n");
        sb.append("		asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		targetAsset: ").append(toIndentedString(targetAsset)).append("\n");
        sb.append("		targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
        sb.append("		bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("		timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object assetValue = getAsset();
        String assetValueAsString = "";
        assetValueAsString = assetValue.toString();
        sb.append("asset=").append(urlEncode(assetValueAsString)).append("");
        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
        Object targetAssetValue = getTargetAsset();
        String targetAssetValueAsString = "";
        targetAssetValueAsString = targetAssetValue.toString();
        sb.append("targetAsset=").append(urlEncode(targetAssetValueAsString)).append("");
        Object targetAmountValue = getTargetAmount();
        String targetAmountValueAsString = "";
        targetAmountValueAsString = targetAmountValue.toString();
        sb.append("targetAmount=").append(urlEncode(targetAmountValueAsString)).append("");
        Object bizTypeValue = getBizType();
        String bizTypeValueAsString = "";
        bizTypeValueAsString = bizTypeValue.toString();
        sb.append("bizType=").append(urlEncode(bizTypeValueAsString)).append("");
        Object timestampValue = getTimestamp();
        String timestampValueAsString = "";
        timestampValueAsString = timestampValue.toString();
        sb.append("timestamp=").append(urlEncode(timestampValueAsString)).append("");
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
        openapiFields.add("asset");
        openapiFields.add("amount");
        openapiFields.add("targetAsset");
        openapiFields.add("targetAmount");
        openapiFields.add("bizType");
        openapiFields.add("timestamp");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetSmallLiabilityExchangeHistoryResponseRowsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetSmallLiabilityExchangeHistoryResponseRowsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " GetSmallLiabilityExchangeHistoryResponseRowsInner is not"
                                    + " found in the empty JSON string",
                                GetSmallLiabilityExchangeHistoryResponseRowsInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonNull())
                && !jsonObj.get("asset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `asset` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("asset").toString()));
        }
        if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull())
                && !jsonObj.get("amount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `amount` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("amount").toString()));
        }
        if ((jsonObj.get("targetAsset") != null && !jsonObj.get("targetAsset").isJsonNull())
                && !jsonObj.get("targetAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `targetAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("targetAsset").toString()));
        }
        if ((jsonObj.get("targetAmount") != null && !jsonObj.get("targetAmount").isJsonNull())
                && !jsonObj.get("targetAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `targetAmount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("targetAmount").toString()));
        }
        if ((jsonObj.get("bizType") != null && !jsonObj.get("bizType").isJsonNull())
                && !jsonObj.get("bizType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `bizType` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("bizType").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetSmallLiabilityExchangeHistoryResponseRowsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'GetSmallLiabilityExchangeHistoryResponseRowsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetSmallLiabilityExchangeHistoryResponseRowsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(GetSmallLiabilityExchangeHistoryResponseRowsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetSmallLiabilityExchangeHistoryResponseRowsInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                GetSmallLiabilityExchangeHistoryResponseRowsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetSmallLiabilityExchangeHistoryResponseRowsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetSmallLiabilityExchangeHistoryResponseRowsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetSmallLiabilityExchangeHistoryResponseRowsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     GetSmallLiabilityExchangeHistoryResponseRowsInner
     */
    public static GetSmallLiabilityExchangeHistoryResponseRowsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, GetSmallLiabilityExchangeHistoryResponseRowsInner.class);
    }

    /**
     * Convert an instance of GetSmallLiabilityExchangeHistoryResponseRowsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
