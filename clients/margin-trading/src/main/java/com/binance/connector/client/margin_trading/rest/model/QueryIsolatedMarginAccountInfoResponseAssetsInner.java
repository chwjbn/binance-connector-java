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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** QueryIsolatedMarginAccountInfoResponseAssetsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryIsolatedMarginAccountInfoResponseAssetsInner {
    public static final String SERIALIZED_NAME_BASE_ASSET = "baseAsset";

    @SerializedName(SERIALIZED_NAME_BASE_ASSET)
    @jakarta.annotation.Nullable
    private QueryIsolatedMarginAccountInfoResponseAssetsInnerBaseAsset baseAsset;

    public static final String SERIALIZED_NAME_QUOTE_ASSET = "quoteAsset";

    @SerializedName(SERIALIZED_NAME_QUOTE_ASSET)
    @jakarta.annotation.Nullable
    private QueryIsolatedMarginAccountInfoResponseAssetsInnerQuoteAsset quoteAsset;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_ISOLATED_CREATED = "isolatedCreated";

    @SerializedName(SERIALIZED_NAME_ISOLATED_CREATED)
    @jakarta.annotation.Nullable
    private Boolean isolatedCreated;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean enabled;

    public static final String SERIALIZED_NAME_MARGIN_LEVEL = "marginLevel";

    @SerializedName(SERIALIZED_NAME_MARGIN_LEVEL)
    @jakarta.annotation.Nullable
    private String marginLevel;

    public static final String SERIALIZED_NAME_MARGIN_LEVEL_STATUS = "marginLevelStatus";

    @SerializedName(SERIALIZED_NAME_MARGIN_LEVEL_STATUS)
    @jakarta.annotation.Nullable
    private String marginLevelStatus;

    public static final String SERIALIZED_NAME_MARGIN_RATIO = "marginRatio";

    @SerializedName(SERIALIZED_NAME_MARGIN_RATIO)
    @jakarta.annotation.Nullable
    private String marginRatio;

    public static final String SERIALIZED_NAME_INDEX_PRICE = "indexPrice";

    @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
    @jakarta.annotation.Nullable
    private String indexPrice;

    public static final String SERIALIZED_NAME_LIQUIDATE_PRICE = "liquidatePrice";

    @SerializedName(SERIALIZED_NAME_LIQUIDATE_PRICE)
    @jakarta.annotation.Nullable
    private String liquidatePrice;

    public static final String SERIALIZED_NAME_LIQUIDATE_RATE = "liquidateRate";

    @SerializedName(SERIALIZED_NAME_LIQUIDATE_RATE)
    @jakarta.annotation.Nullable
    private String liquidateRate;

    public static final String SERIALIZED_NAME_TRADE_ENABLED = "tradeEnabled";

    @SerializedName(SERIALIZED_NAME_TRADE_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean tradeEnabled;

    public QueryIsolatedMarginAccountInfoResponseAssetsInner() {}

    public QueryIsolatedMarginAccountInfoResponseAssetsInner baseAsset(
            @jakarta.annotation.Nullable
                    QueryIsolatedMarginAccountInfoResponseAssetsInnerBaseAsset baseAsset) {
        this.baseAsset = baseAsset;
        return this;
    }

    /**
     * Get baseAsset
     *
     * @return baseAsset
     */
    @jakarta.annotation.Nullable
    @Valid
    public QueryIsolatedMarginAccountInfoResponseAssetsInnerBaseAsset getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(
            @jakarta.annotation.Nullable
                    QueryIsolatedMarginAccountInfoResponseAssetsInnerBaseAsset baseAsset) {
        this.baseAsset = baseAsset;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner quoteAsset(
            @jakarta.annotation.Nullable
                    QueryIsolatedMarginAccountInfoResponseAssetsInnerQuoteAsset quoteAsset) {
        this.quoteAsset = quoteAsset;
        return this;
    }

    /**
     * Get quoteAsset
     *
     * @return quoteAsset
     */
    @jakarta.annotation.Nullable
    @Valid
    public QueryIsolatedMarginAccountInfoResponseAssetsInnerQuoteAsset getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(
            @jakarta.annotation.Nullable
                    QueryIsolatedMarginAccountInfoResponseAssetsInnerQuoteAsset quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner symbol(
            @jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nullable
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(@jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner isolatedCreated(
            @jakarta.annotation.Nullable Boolean isolatedCreated) {
        this.isolatedCreated = isolatedCreated;
        return this;
    }

    /**
     * Get isolatedCreated
     *
     * @return isolatedCreated
     */
    @jakarta.annotation.Nullable
    public Boolean getIsolatedCreated() {
        return isolatedCreated;
    }

    public void setIsolatedCreated(@jakarta.annotation.Nullable Boolean isolatedCreated) {
        this.isolatedCreated = isolatedCreated;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner enabled(
            @jakarta.annotation.Nullable Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(@jakarta.annotation.Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner marginLevel(
            @jakarta.annotation.Nullable String marginLevel) {
        this.marginLevel = marginLevel;
        return this;
    }

    /**
     * Get marginLevel
     *
     * @return marginLevel
     */
    @jakarta.annotation.Nullable
    public String getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(@jakarta.annotation.Nullable String marginLevel) {
        this.marginLevel = marginLevel;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner marginLevelStatus(
            @jakarta.annotation.Nullable String marginLevelStatus) {
        this.marginLevelStatus = marginLevelStatus;
        return this;
    }

    /**
     * Get marginLevelStatus
     *
     * @return marginLevelStatus
     */
    @jakarta.annotation.Nullable
    public String getMarginLevelStatus() {
        return marginLevelStatus;
    }

    public void setMarginLevelStatus(@jakarta.annotation.Nullable String marginLevelStatus) {
        this.marginLevelStatus = marginLevelStatus;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner marginRatio(
            @jakarta.annotation.Nullable String marginRatio) {
        this.marginRatio = marginRatio;
        return this;
    }

    /**
     * Get marginRatio
     *
     * @return marginRatio
     */
    @jakarta.annotation.Nullable
    public String getMarginRatio() {
        return marginRatio;
    }

    public void setMarginRatio(@jakarta.annotation.Nullable String marginRatio) {
        this.marginRatio = marginRatio;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner indexPrice(
            @jakarta.annotation.Nullable String indexPrice) {
        this.indexPrice = indexPrice;
        return this;
    }

    /**
     * Get indexPrice
     *
     * @return indexPrice
     */
    @jakarta.annotation.Nullable
    public String getIndexPrice() {
        return indexPrice;
    }

    public void setIndexPrice(@jakarta.annotation.Nullable String indexPrice) {
        this.indexPrice = indexPrice;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner liquidatePrice(
            @jakarta.annotation.Nullable String liquidatePrice) {
        this.liquidatePrice = liquidatePrice;
        return this;
    }

    /**
     * Get liquidatePrice
     *
     * @return liquidatePrice
     */
    @jakarta.annotation.Nullable
    public String getLiquidatePrice() {
        return liquidatePrice;
    }

    public void setLiquidatePrice(@jakarta.annotation.Nullable String liquidatePrice) {
        this.liquidatePrice = liquidatePrice;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner liquidateRate(
            @jakarta.annotation.Nullable String liquidateRate) {
        this.liquidateRate = liquidateRate;
        return this;
    }

    /**
     * Get liquidateRate
     *
     * @return liquidateRate
     */
    @jakarta.annotation.Nullable
    public String getLiquidateRate() {
        return liquidateRate;
    }

    public void setLiquidateRate(@jakarta.annotation.Nullable String liquidateRate) {
        this.liquidateRate = liquidateRate;
    }

    public QueryIsolatedMarginAccountInfoResponseAssetsInner tradeEnabled(
            @jakarta.annotation.Nullable Boolean tradeEnabled) {
        this.tradeEnabled = tradeEnabled;
        return this;
    }

    /**
     * Get tradeEnabled
     *
     * @return tradeEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getTradeEnabled() {
        return tradeEnabled;
    }

    public void setTradeEnabled(@jakarta.annotation.Nullable Boolean tradeEnabled) {
        this.tradeEnabled = tradeEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryIsolatedMarginAccountInfoResponseAssetsInner
                queryIsolatedMarginAccountInfoResponseAssetsInner =
                        (QueryIsolatedMarginAccountInfoResponseAssetsInner) o;
        return Objects.equals(
                        this.baseAsset, queryIsolatedMarginAccountInfoResponseAssetsInner.baseAsset)
                && Objects.equals(
                        this.quoteAsset,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.quoteAsset)
                && Objects.equals(
                        this.symbol, queryIsolatedMarginAccountInfoResponseAssetsInner.symbol)
                && Objects.equals(
                        this.isolatedCreated,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.isolatedCreated)
                && Objects.equals(
                        this.enabled, queryIsolatedMarginAccountInfoResponseAssetsInner.enabled)
                && Objects.equals(
                        this.marginLevel,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.marginLevel)
                && Objects.equals(
                        this.marginLevelStatus,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.marginLevelStatus)
                && Objects.equals(
                        this.marginRatio,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.marginRatio)
                && Objects.equals(
                        this.indexPrice,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.indexPrice)
                && Objects.equals(
                        this.liquidatePrice,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.liquidatePrice)
                && Objects.equals(
                        this.liquidateRate,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.liquidateRate)
                && Objects.equals(
                        this.tradeEnabled,
                        queryIsolatedMarginAccountInfoResponseAssetsInner.tradeEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                baseAsset,
                quoteAsset,
                symbol,
                isolatedCreated,
                enabled,
                marginLevel,
                marginLevelStatus,
                marginRatio,
                indexPrice,
                liquidatePrice,
                liquidateRate,
                tradeEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryIsolatedMarginAccountInfoResponseAssetsInner {\n");
        sb.append("		baseAsset: ").append(toIndentedString(baseAsset)).append("\n");
        sb.append("		quoteAsset: ").append(toIndentedString(quoteAsset)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		isolatedCreated: ").append(toIndentedString(isolatedCreated)).append("\n");
        sb.append("		enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("		marginLevel: ").append(toIndentedString(marginLevel)).append("\n");
        sb.append("		marginLevelStatus: ").append(toIndentedString(marginLevelStatus)).append("\n");
        sb.append("		marginRatio: ").append(toIndentedString(marginRatio)).append("\n");
        sb.append("		indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
        sb.append("		liquidatePrice: ").append(toIndentedString(liquidatePrice)).append("\n");
        sb.append("		liquidateRate: ").append(toIndentedString(liquidateRate)).append("\n");
        sb.append("		tradeEnabled: ").append(toIndentedString(tradeEnabled)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object baseAssetValue = getBaseAsset();
        String baseAssetValueAsString = "";
        baseAssetValueAsString = baseAssetValue.toString();
        sb.append("baseAsset=").append(urlEncode(baseAssetValueAsString)).append("");
        Object quoteAssetValue = getQuoteAsset();
        String quoteAssetValueAsString = "";
        quoteAssetValueAsString = quoteAssetValue.toString();
        sb.append("quoteAsset=").append(urlEncode(quoteAssetValueAsString)).append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object isolatedCreatedValue = getIsolatedCreated();
        String isolatedCreatedValueAsString = "";
        isolatedCreatedValueAsString = isolatedCreatedValue.toString();
        sb.append("isolatedCreated=").append(urlEncode(isolatedCreatedValueAsString)).append("");
        Object enabledValue = getEnabled();
        String enabledValueAsString = "";
        enabledValueAsString = enabledValue.toString();
        sb.append("enabled=").append(urlEncode(enabledValueAsString)).append("");
        Object marginLevelValue = getMarginLevel();
        String marginLevelValueAsString = "";
        marginLevelValueAsString = marginLevelValue.toString();
        sb.append("marginLevel=").append(urlEncode(marginLevelValueAsString)).append("");
        Object marginLevelStatusValue = getMarginLevelStatus();
        String marginLevelStatusValueAsString = "";
        marginLevelStatusValueAsString = marginLevelStatusValue.toString();
        sb.append("marginLevelStatus=")
                .append(urlEncode(marginLevelStatusValueAsString))
                .append("");
        Object marginRatioValue = getMarginRatio();
        String marginRatioValueAsString = "";
        marginRatioValueAsString = marginRatioValue.toString();
        sb.append("marginRatio=").append(urlEncode(marginRatioValueAsString)).append("");
        Object indexPriceValue = getIndexPrice();
        String indexPriceValueAsString = "";
        indexPriceValueAsString = indexPriceValue.toString();
        sb.append("indexPrice=").append(urlEncode(indexPriceValueAsString)).append("");
        Object liquidatePriceValue = getLiquidatePrice();
        String liquidatePriceValueAsString = "";
        liquidatePriceValueAsString = liquidatePriceValue.toString();
        sb.append("liquidatePrice=").append(urlEncode(liquidatePriceValueAsString)).append("");
        Object liquidateRateValue = getLiquidateRate();
        String liquidateRateValueAsString = "";
        liquidateRateValueAsString = liquidateRateValue.toString();
        sb.append("liquidateRate=").append(urlEncode(liquidateRateValueAsString)).append("");
        Object tradeEnabledValue = getTradeEnabled();
        String tradeEnabledValueAsString = "";
        tradeEnabledValueAsString = tradeEnabledValue.toString();
        sb.append("tradeEnabled=").append(urlEncode(tradeEnabledValueAsString)).append("");
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
        openapiFields.add("baseAsset");
        openapiFields.add("quoteAsset");
        openapiFields.add("symbol");
        openapiFields.add("isolatedCreated");
        openapiFields.add("enabled");
        openapiFields.add("marginLevel");
        openapiFields.add("marginLevelStatus");
        openapiFields.add("marginRatio");
        openapiFields.add("indexPrice");
        openapiFields.add("liquidatePrice");
        openapiFields.add("liquidateRate");
        openapiFields.add("tradeEnabled");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryIsolatedMarginAccountInfoResponseAssetsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryIsolatedMarginAccountInfoResponseAssetsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " QueryIsolatedMarginAccountInfoResponseAssetsInner is not"
                                    + " found in the empty JSON string",
                                QueryIsolatedMarginAccountInfoResponseAssetsInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `baseAsset`
        if (jsonObj.get("baseAsset") != null && !jsonObj.get("baseAsset").isJsonNull()) {
            QueryIsolatedMarginAccountInfoResponseAssetsInnerBaseAsset.validateJsonElement(
                    jsonObj.get("baseAsset"));
        }
        // validate the optional field `quoteAsset`
        if (jsonObj.get("quoteAsset") != null && !jsonObj.get("quoteAsset").isJsonNull()) {
            QueryIsolatedMarginAccountInfoResponseAssetsInnerQuoteAsset.validateJsonElement(
                    jsonObj.get("quoteAsset"));
        }
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        if ((jsonObj.get("marginLevel") != null && !jsonObj.get("marginLevel").isJsonNull())
                && !jsonObj.get("marginLevel").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `marginLevel` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("marginLevel").toString()));
        }
        if ((jsonObj.get("marginLevelStatus") != null
                        && !jsonObj.get("marginLevelStatus").isJsonNull())
                && !jsonObj.get("marginLevelStatus").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `marginLevelStatus` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("marginLevelStatus").toString()));
        }
        if ((jsonObj.get("marginRatio") != null && !jsonObj.get("marginRatio").isJsonNull())
                && !jsonObj.get("marginRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `marginRatio` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("marginRatio").toString()));
        }
        if ((jsonObj.get("indexPrice") != null && !jsonObj.get("indexPrice").isJsonNull())
                && !jsonObj.get("indexPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `indexPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("indexPrice").toString()));
        }
        if ((jsonObj.get("liquidatePrice") != null && !jsonObj.get("liquidatePrice").isJsonNull())
                && !jsonObj.get("liquidatePrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liquidatePrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("liquidatePrice").toString()));
        }
        if ((jsonObj.get("liquidateRate") != null && !jsonObj.get("liquidateRate").isJsonNull())
                && !jsonObj.get("liquidateRate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liquidateRate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("liquidateRate").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryIsolatedMarginAccountInfoResponseAssetsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'QueryIsolatedMarginAccountInfoResponseAssetsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryIsolatedMarginAccountInfoResponseAssetsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(QueryIsolatedMarginAccountInfoResponseAssetsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryIsolatedMarginAccountInfoResponseAssetsInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                QueryIsolatedMarginAccountInfoResponseAssetsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryIsolatedMarginAccountInfoResponseAssetsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryIsolatedMarginAccountInfoResponseAssetsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryIsolatedMarginAccountInfoResponseAssetsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryIsolatedMarginAccountInfoResponseAssetsInner
     */
    public static QueryIsolatedMarginAccountInfoResponseAssetsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, QueryIsolatedMarginAccountInfoResponseAssetsInner.class);
    }

    /**
     * Convert an instance of QueryIsolatedMarginAccountInfoResponseAssetsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
