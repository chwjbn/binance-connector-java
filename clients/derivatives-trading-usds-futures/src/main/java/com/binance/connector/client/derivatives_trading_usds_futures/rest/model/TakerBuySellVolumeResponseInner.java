/*
 * Binance Derivatives Trading USDS Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading USDS Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.rest.model;

import com.binance.connector.client.derivatives_trading_usds_futures.rest.JSON;
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

/** TakerBuySellVolumeResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class TakerBuySellVolumeResponseInner {
    public static final String SERIALIZED_NAME_BUY_SELL_RATIO = "buySellRatio";

    @SerializedName(SERIALIZED_NAME_BUY_SELL_RATIO)
    @jakarta.annotation.Nullable
    private String buySellRatio;

    public static final String SERIALIZED_NAME_BUY_VOL = "buyVol";

    @SerializedName(SERIALIZED_NAME_BUY_VOL)
    @jakarta.annotation.Nullable
    private String buyVol;

    public static final String SERIALIZED_NAME_SELL_VOL = "sellVol";

    @SerializedName(SERIALIZED_NAME_SELL_VOL)
    @jakarta.annotation.Nullable
    private String sellVol;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    @jakarta.annotation.Nullable
    private String timestamp;

    public TakerBuySellVolumeResponseInner() {}

    public TakerBuySellVolumeResponseInner buySellRatio(
            @jakarta.annotation.Nullable String buySellRatio) {
        this.buySellRatio = buySellRatio;
        return this;
    }

    /**
     * Get buySellRatio
     *
     * @return buySellRatio
     */
    @jakarta.annotation.Nullable
    public String getBuySellRatio() {
        return buySellRatio;
    }

    public void setBuySellRatio(@jakarta.annotation.Nullable String buySellRatio) {
        this.buySellRatio = buySellRatio;
    }

    public TakerBuySellVolumeResponseInner buyVol(@jakarta.annotation.Nullable String buyVol) {
        this.buyVol = buyVol;
        return this;
    }

    /**
     * Get buyVol
     *
     * @return buyVol
     */
    @jakarta.annotation.Nullable
    public String getBuyVol() {
        return buyVol;
    }

    public void setBuyVol(@jakarta.annotation.Nullable String buyVol) {
        this.buyVol = buyVol;
    }

    public TakerBuySellVolumeResponseInner sellVol(@jakarta.annotation.Nullable String sellVol) {
        this.sellVol = sellVol;
        return this;
    }

    /**
     * Get sellVol
     *
     * @return sellVol
     */
    @jakarta.annotation.Nullable
    public String getSellVol() {
        return sellVol;
    }

    public void setSellVol(@jakarta.annotation.Nullable String sellVol) {
        this.sellVol = sellVol;
    }

    public TakerBuySellVolumeResponseInner timestamp(
            @jakarta.annotation.Nullable String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     */
    @jakarta.annotation.Nullable
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(@jakarta.annotation.Nullable String timestamp) {
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
        TakerBuySellVolumeResponseInner takerBuySellVolumeResponseInner =
                (TakerBuySellVolumeResponseInner) o;
        return Objects.equals(this.buySellRatio, takerBuySellVolumeResponseInner.buySellRatio)
                && Objects.equals(this.buyVol, takerBuySellVolumeResponseInner.buyVol)
                && Objects.equals(this.sellVol, takerBuySellVolumeResponseInner.sellVol)
                && Objects.equals(this.timestamp, takerBuySellVolumeResponseInner.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buySellRatio, buyVol, sellVol, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TakerBuySellVolumeResponseInner {\n");
        sb.append("		buySellRatio: ").append(toIndentedString(buySellRatio)).append("\n");
        sb.append("		buyVol: ").append(toIndentedString(buyVol)).append("\n");
        sb.append("		sellVol: ").append(toIndentedString(sellVol)).append("\n");
        sb.append("		timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object buySellRatioValue = getBuySellRatio();
        String buySellRatioValueAsString = "";
        buySellRatioValueAsString = buySellRatioValue.toString();
        sb.append("buySellRatio=").append(urlEncode(buySellRatioValueAsString)).append("");
        Object buyVolValue = getBuyVol();
        String buyVolValueAsString = "";
        buyVolValueAsString = buyVolValue.toString();
        sb.append("buyVol=").append(urlEncode(buyVolValueAsString)).append("");
        Object sellVolValue = getSellVol();
        String sellVolValueAsString = "";
        sellVolValueAsString = sellVolValue.toString();
        sb.append("sellVol=").append(urlEncode(sellVolValueAsString)).append("");
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
        openapiFields.add("buySellRatio");
        openapiFields.add("buyVol");
        openapiFields.add("sellVol");
        openapiFields.add("timestamp");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     TakerBuySellVolumeResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!TakerBuySellVolumeResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in TakerBuySellVolumeResponseInner is not"
                                        + " found in the empty JSON string",
                                TakerBuySellVolumeResponseInner.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("buySellRatio") != null && !jsonObj.get("buySellRatio").isJsonNull())
                && !jsonObj.get("buySellRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `buySellRatio` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("buySellRatio").toString()));
        }
        if ((jsonObj.get("buyVol") != null && !jsonObj.get("buyVol").isJsonNull())
                && !jsonObj.get("buyVol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `buyVol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("buyVol").toString()));
        }
        if ((jsonObj.get("sellVol") != null && !jsonObj.get("sellVol").isJsonNull())
                && !jsonObj.get("sellVol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sellVol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("sellVol").toString()));
        }
        if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull())
                && !jsonObj.get("timestamp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `timestamp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("timestamp").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TakerBuySellVolumeResponseInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TakerBuySellVolumeResponseInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TakerBuySellVolumeResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(TakerBuySellVolumeResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<TakerBuySellVolumeResponseInner>() {
                        @Override
                        public void write(JsonWriter out, TakerBuySellVolumeResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public TakerBuySellVolumeResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of TakerBuySellVolumeResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TakerBuySellVolumeResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     TakerBuySellVolumeResponseInner
     */
    public static TakerBuySellVolumeResponseInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TakerBuySellVolumeResponseInner.class);
    }

    /**
     * Convert an instance of TakerBuySellVolumeResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
