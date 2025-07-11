/*
 * Binance Derivatives Trading COIN Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading COIN Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.rest.model;

import com.binance.connector.client.derivatives_trading_coin_futures.rest.JSON;
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

/** TopTraderLongShortRatioPositionsResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class TopTraderLongShortRatioPositionsResponseInner {
    public static final String SERIALIZED_NAME_PAIR = "pair";

    @SerializedName(SERIALIZED_NAME_PAIR)
    @jakarta.annotation.Nullable
    private String pair;

    public static final String SERIALIZED_NAME_LONG_SHORT_RATIO = "longShortRatio";

    @SerializedName(SERIALIZED_NAME_LONG_SHORT_RATIO)
    @jakarta.annotation.Nullable
    private String longShortRatio;

    public static final String SERIALIZED_NAME_LONG_POSITION = "longPosition";

    @SerializedName(SERIALIZED_NAME_LONG_POSITION)
    @jakarta.annotation.Nullable
    private String longPosition;

    public static final String SERIALIZED_NAME_SHORT_POSITION = "shortPosition";

    @SerializedName(SERIALIZED_NAME_SHORT_POSITION)
    @jakarta.annotation.Nullable
    private String shortPosition;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    @jakarta.annotation.Nullable
    private Long timestamp;

    public TopTraderLongShortRatioPositionsResponseInner() {}

    public TopTraderLongShortRatioPositionsResponseInner pair(
            @jakarta.annotation.Nullable String pair) {
        this.pair = pair;
        return this;
    }

    /**
     * Get pair
     *
     * @return pair
     */
    @jakarta.annotation.Nullable
    public String getPair() {
        return pair;
    }

    public void setPair(@jakarta.annotation.Nullable String pair) {
        this.pair = pair;
    }

    public TopTraderLongShortRatioPositionsResponseInner longShortRatio(
            @jakarta.annotation.Nullable String longShortRatio) {
        this.longShortRatio = longShortRatio;
        return this;
    }

    /**
     * Get longShortRatio
     *
     * @return longShortRatio
     */
    @jakarta.annotation.Nullable
    public String getLongShortRatio() {
        return longShortRatio;
    }

    public void setLongShortRatio(@jakarta.annotation.Nullable String longShortRatio) {
        this.longShortRatio = longShortRatio;
    }

    public TopTraderLongShortRatioPositionsResponseInner longPosition(
            @jakarta.annotation.Nullable String longPosition) {
        this.longPosition = longPosition;
        return this;
    }

    /**
     * Get longPosition
     *
     * @return longPosition
     */
    @jakarta.annotation.Nullable
    public String getLongPosition() {
        return longPosition;
    }

    public void setLongPosition(@jakarta.annotation.Nullable String longPosition) {
        this.longPosition = longPosition;
    }

    public TopTraderLongShortRatioPositionsResponseInner shortPosition(
            @jakarta.annotation.Nullable String shortPosition) {
        this.shortPosition = shortPosition;
        return this;
    }

    /**
     * Get shortPosition
     *
     * @return shortPosition
     */
    @jakarta.annotation.Nullable
    public String getShortPosition() {
        return shortPosition;
    }

    public void setShortPosition(@jakarta.annotation.Nullable String shortPosition) {
        this.shortPosition = shortPosition;
    }

    public TopTraderLongShortRatioPositionsResponseInner timestamp(
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
        TopTraderLongShortRatioPositionsResponseInner
                topTraderLongShortRatioPositionsResponseInner =
                        (TopTraderLongShortRatioPositionsResponseInner) o;
        return Objects.equals(this.pair, topTraderLongShortRatioPositionsResponseInner.pair)
                && Objects.equals(
                        this.longShortRatio,
                        topTraderLongShortRatioPositionsResponseInner.longShortRatio)
                && Objects.equals(
                        this.longPosition,
                        topTraderLongShortRatioPositionsResponseInner.longPosition)
                && Objects.equals(
                        this.shortPosition,
                        topTraderLongShortRatioPositionsResponseInner.shortPosition)
                && Objects.equals(
                        this.timestamp, topTraderLongShortRatioPositionsResponseInner.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pair, longShortRatio, longPosition, shortPosition, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopTraderLongShortRatioPositionsResponseInner {\n");
        sb.append("		pair: ").append(toIndentedString(pair)).append("\n");
        sb.append("		longShortRatio: ").append(toIndentedString(longShortRatio)).append("\n");
        sb.append("		longPosition: ").append(toIndentedString(longPosition)).append("\n");
        sb.append("		shortPosition: ").append(toIndentedString(shortPosition)).append("\n");
        sb.append("		timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object pairValue = getPair();
        String pairValueAsString = "";
        pairValueAsString = pairValue.toString();
        sb.append("pair=").append(urlEncode(pairValueAsString)).append("");
        Object longShortRatioValue = getLongShortRatio();
        String longShortRatioValueAsString = "";
        longShortRatioValueAsString = longShortRatioValue.toString();
        sb.append("longShortRatio=").append(urlEncode(longShortRatioValueAsString)).append("");
        Object longPositionValue = getLongPosition();
        String longPositionValueAsString = "";
        longPositionValueAsString = longPositionValue.toString();
        sb.append("longPosition=").append(urlEncode(longPositionValueAsString)).append("");
        Object shortPositionValue = getShortPosition();
        String shortPositionValueAsString = "";
        shortPositionValueAsString = shortPositionValue.toString();
        sb.append("shortPosition=").append(urlEncode(shortPositionValueAsString)).append("");
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
        openapiFields.add("pair");
        openapiFields.add("longShortRatio");
        openapiFields.add("longPosition");
        openapiFields.add("shortPosition");
        openapiFields.add("timestamp");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     TopTraderLongShortRatioPositionsResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!TopTraderLongShortRatioPositionsResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " TopTraderLongShortRatioPositionsResponseInner is not found"
                                    + " in the empty JSON string",
                                TopTraderLongShortRatioPositionsResponseInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("pair") != null && !jsonObj.get("pair").isJsonNull())
                && !jsonObj.get("pair").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `pair` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("pair").toString()));
        }
        if ((jsonObj.get("longShortRatio") != null && !jsonObj.get("longShortRatio").isJsonNull())
                && !jsonObj.get("longShortRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `longShortRatio` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("longShortRatio").toString()));
        }
        if ((jsonObj.get("longPosition") != null && !jsonObj.get("longPosition").isJsonNull())
                && !jsonObj.get("longPosition").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `longPosition` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("longPosition").toString()));
        }
        if ((jsonObj.get("shortPosition") != null && !jsonObj.get("shortPosition").isJsonNull())
                && !jsonObj.get("shortPosition").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `shortPosition` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("shortPosition").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TopTraderLongShortRatioPositionsResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'TopTraderLongShortRatioPositionsResponseInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TopTraderLongShortRatioPositionsResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(TopTraderLongShortRatioPositionsResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<TopTraderLongShortRatioPositionsResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, TopTraderLongShortRatioPositionsResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public TopTraderLongShortRatioPositionsResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of TopTraderLongShortRatioPositionsResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TopTraderLongShortRatioPositionsResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     TopTraderLongShortRatioPositionsResponseInner
     */
    public static TopTraderLongShortRatioPositionsResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, TopTraderLongShortRatioPositionsResponseInner.class);
    }

    /**
     * Convert an instance of TopTraderLongShortRatioPositionsResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
