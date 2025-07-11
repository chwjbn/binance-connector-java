/*
 * Binance Mining REST API
 * OpenAPI Specification for the Binance Mining REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.mining.rest.model;

import com.binance.connector.client.mining.rest.JSON;
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

/** RequestForDetailMinerListResponseDataInnerHashrateDatasInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RequestForDetailMinerListResponseDataInnerHashrateDatasInner {
    public static final String SERIALIZED_NAME_TIME = "time";

    @SerializedName(SERIALIZED_NAME_TIME)
    @jakarta.annotation.Nullable
    private Long time;

    public static final String SERIALIZED_NAME_HASHRATE = "hashrate";

    @SerializedName(SERIALIZED_NAME_HASHRATE)
    @jakarta.annotation.Nullable
    private String hashrate;

    public static final String SERIALIZED_NAME_REJECT = "reject";

    @SerializedName(SERIALIZED_NAME_REJECT)
    @jakarta.annotation.Nullable
    private Long reject;

    public RequestForDetailMinerListResponseDataInnerHashrateDatasInner() {}

    public RequestForDetailMinerListResponseDataInnerHashrateDatasInner time(
            @jakarta.annotation.Nullable Long time) {
        this.time = time;
        return this;
    }

    /**
     * Get time
     *
     * @return time
     */
    @jakarta.annotation.Nullable
    public Long getTime() {
        return time;
    }

    public void setTime(@jakarta.annotation.Nullable Long time) {
        this.time = time;
    }

    public RequestForDetailMinerListResponseDataInnerHashrateDatasInner hashrate(
            @jakarta.annotation.Nullable String hashrate) {
        this.hashrate = hashrate;
        return this;
    }

    /**
     * Get hashrate
     *
     * @return hashrate
     */
    @jakarta.annotation.Nullable
    public String getHashrate() {
        return hashrate;
    }

    public void setHashrate(@jakarta.annotation.Nullable String hashrate) {
        this.hashrate = hashrate;
    }

    public RequestForDetailMinerListResponseDataInnerHashrateDatasInner reject(
            @jakarta.annotation.Nullable Long reject) {
        this.reject = reject;
        return this;
    }

    /**
     * Get reject
     *
     * @return reject
     */
    @jakarta.annotation.Nullable
    public Long getReject() {
        return reject;
    }

    public void setReject(@jakarta.annotation.Nullable Long reject) {
        this.reject = reject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestForDetailMinerListResponseDataInnerHashrateDatasInner
                requestForDetailMinerListResponseDataInnerHashrateDatasInner =
                        (RequestForDetailMinerListResponseDataInnerHashrateDatasInner) o;
        return Objects.equals(
                        this.time,
                        requestForDetailMinerListResponseDataInnerHashrateDatasInner.time)
                && Objects.equals(
                        this.hashrate,
                        requestForDetailMinerListResponseDataInnerHashrateDatasInner.hashrate)
                && Objects.equals(
                        this.reject,
                        requestForDetailMinerListResponseDataInnerHashrateDatasInner.reject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, hashrate, reject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestForDetailMinerListResponseDataInnerHashrateDatasInner {\n");
        sb.append("		time: ").append(toIndentedString(time)).append("\n");
        sb.append("		hashrate: ").append(toIndentedString(hashrate)).append("\n");
        sb.append("		reject: ").append(toIndentedString(reject)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object timeValue = getTime();
        String timeValueAsString = "";
        timeValueAsString = timeValue.toString();
        sb.append("time=").append(urlEncode(timeValueAsString)).append("");
        Object hashrateValue = getHashrate();
        String hashrateValueAsString = "";
        hashrateValueAsString = hashrateValue.toString();
        sb.append("hashrate=").append(urlEncode(hashrateValueAsString)).append("");
        Object rejectValue = getReject();
        String rejectValueAsString = "";
        rejectValueAsString = rejectValue.toString();
        sb.append("reject=").append(urlEncode(rejectValueAsString)).append("");
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
        openapiFields.add("time");
        openapiFields.add("hashrate");
        openapiFields.add("reject");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     RequestForDetailMinerListResponseDataInnerHashrateDatasInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RequestForDetailMinerListResponseDataInnerHashrateDatasInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " RequestForDetailMinerListResponseDataInnerHashrateDatasInner"
                                    + " is not found in the empty JSON string",
                                RequestForDetailMinerListResponseDataInnerHashrateDatasInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("hashrate") != null && !jsonObj.get("hashrate").isJsonNull())
                && !jsonObj.get("hashrate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `hashrate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("hashrate").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RequestForDetailMinerListResponseDataInnerHashrateDatasInner.class
                    .isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes
                // 'RequestForDetailMinerListResponseDataInnerHashrateDatasInner' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RequestForDetailMinerListResponseDataInnerHashrateDatasInner>
                    thisAdapter =
                            gson.getDelegateAdapter(
                                    this,
                                    TypeToken.get(
                                            RequestForDetailMinerListResponseDataInnerHashrateDatasInner
                                                    .class));

            return (TypeAdapter<T>)
                    new TypeAdapter<
                            RequestForDetailMinerListResponseDataInnerHashrateDatasInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                RequestForDetailMinerListResponseDataInnerHashrateDatasInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RequestForDetailMinerListResponseDataInnerHashrateDatasInner read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RequestForDetailMinerListResponseDataInnerHashrateDatasInner given an
     * JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RequestForDetailMinerListResponseDataInnerHashrateDatasInner
     * @throws IOException if the JSON string is invalid with respect to
     *     RequestForDetailMinerListResponseDataInnerHashrateDatasInner
     */
    public static RequestForDetailMinerListResponseDataInnerHashrateDatasInner fromJson(
            String jsonString) throws IOException {
        return JSON.getGson()
                .fromJson(
                        jsonString,
                        RequestForDetailMinerListResponseDataInnerHashrateDatasInner.class);
    }

    /**
     * Convert an instance of RequestForDetailMinerListResponseDataInnerHashrateDatasInner to an
     * JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
