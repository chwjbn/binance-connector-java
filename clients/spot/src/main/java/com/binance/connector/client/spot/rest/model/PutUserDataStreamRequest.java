/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.rest.model;

import com.binance.connector.client.spot.rest.JSON;
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

/** PutUserDataStreamRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PutUserDataStreamRequest {
    public static final String SERIALIZED_NAME_LISTEN_KEY = "listenKey";

    @SerializedName(SERIALIZED_NAME_LISTEN_KEY)
    @jakarta.annotation.Nonnull
    private String listenKey;

    public PutUserDataStreamRequest() {}

    public PutUserDataStreamRequest listenKey(@jakarta.annotation.Nonnull String listenKey) {
        this.listenKey = listenKey;
        return this;
    }

    /**
     * Get listenKey
     *
     * @return listenKey
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getListenKey() {
        return listenKey;
    }

    public void setListenKey(@jakarta.annotation.Nonnull String listenKey) {
        this.listenKey = listenKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutUserDataStreamRequest putUserDataStreamRequest = (PutUserDataStreamRequest) o;
        return Objects.equals(this.listenKey, putUserDataStreamRequest.listenKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutUserDataStreamRequest {\n");
        sb.append("		listenKey: ").append(toIndentedString(listenKey)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object listenKeyValue = getListenKey();
        String listenKeyValueAsString = "";
        listenKeyValueAsString = listenKeyValue.toString();
        sb.append("listenKey=").append(urlEncode(listenKeyValueAsString)).append("");
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
        openapiFields.add("listenKey");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("listenKey");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PutUserDataStreamRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PutUserDataStreamRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PutUserDataStreamRequest is not found"
                                        + " in the empty JSON string",
                                PutUserDataStreamRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PutUserDataStreamRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("listenKey").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `listenKey` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("listenKey").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PutUserDataStreamRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PutUserDataStreamRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PutUserDataStreamRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PutUserDataStreamRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PutUserDataStreamRequest>() {
                        @Override
                        public void write(JsonWriter out, PutUserDataStreamRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PutUserDataStreamRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PutUserDataStreamRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PutUserDataStreamRequest
     * @throws IOException if the JSON string is invalid with respect to PutUserDataStreamRequest
     */
    public static PutUserDataStreamRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PutUserDataStreamRequest.class);
    }

    /**
     * Convert an instance of PutUserDataStreamRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
