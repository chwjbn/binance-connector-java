/*
 * Binance Sub Account REST API
 * OpenAPI Specification for the Binance Sub Account REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.sub_account.rest.model;

import com.binance.connector.client.sub_account.rest.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** QueryManagedSubAccountFuturesAssetDetailsResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryManagedSubAccountFuturesAssetDetailsResponse {
    public static final String SERIALIZED_NAME_CODE = "code";

    @SerializedName(SERIALIZED_NAME_CODE)
    @jakarta.annotation.Nullable
    private String code;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    @jakarta.annotation.Nullable
    private String message;

    public static final String SERIALIZED_NAME_SNAPSHOT_VOS = "snapshotVos";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_VOS)
    @jakarta.annotation.Nullable
    private List<@Valid QueryManagedSubAccountFuturesAssetDetailsResponseSnapshotVosInner>
            snapshotVos;

    public QueryManagedSubAccountFuturesAssetDetailsResponse() {}

    public QueryManagedSubAccountFuturesAssetDetailsResponse code(
            @jakarta.annotation.Nullable String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return code;
    }

    public void setCode(@jakarta.annotation.Nullable String code) {
        this.code = code;
    }

    public QueryManagedSubAccountFuturesAssetDetailsResponse message(
            @jakarta.annotation.Nullable String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return message;
    }

    public void setMessage(@jakarta.annotation.Nullable String message) {
        this.message = message;
    }

    public QueryManagedSubAccountFuturesAssetDetailsResponse snapshotVos(
            @jakarta.annotation.Nullable
                    List<@Valid QueryManagedSubAccountFuturesAssetDetailsResponseSnapshotVosInner>
                            snapshotVos) {
        this.snapshotVos = snapshotVos;
        return this;
    }

    public QueryManagedSubAccountFuturesAssetDetailsResponse addSnapshotVosItem(
            QueryManagedSubAccountFuturesAssetDetailsResponseSnapshotVosInner snapshotVosItem) {
        if (this.snapshotVos == null) {
            this.snapshotVos = new ArrayList<>();
        }
        this.snapshotVos.add(snapshotVosItem);
        return this;
    }

    /**
     * Get snapshotVos
     *
     * @return snapshotVos
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid QueryManagedSubAccountFuturesAssetDetailsResponseSnapshotVosInner>
            getSnapshotVos() {
        return snapshotVos;
    }

    public void setSnapshotVos(
            @jakarta.annotation.Nullable
                    List<@Valid QueryManagedSubAccountFuturesAssetDetailsResponseSnapshotVosInner>
                            snapshotVos) {
        this.snapshotVos = snapshotVos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryManagedSubAccountFuturesAssetDetailsResponse
                queryManagedSubAccountFuturesAssetDetailsResponse =
                        (QueryManagedSubAccountFuturesAssetDetailsResponse) o;
        return Objects.equals(this.code, queryManagedSubAccountFuturesAssetDetailsResponse.code)
                && Objects.equals(
                        this.message, queryManagedSubAccountFuturesAssetDetailsResponse.message)
                && Objects.equals(
                        this.snapshotVos,
                        queryManagedSubAccountFuturesAssetDetailsResponse.snapshotVos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, snapshotVos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryManagedSubAccountFuturesAssetDetailsResponse {\n");
        sb.append("		code: ").append(toIndentedString(code)).append("\n");
        sb.append("		message: ").append(toIndentedString(message)).append("\n");
        sb.append("		snapshotVos: ").append(toIndentedString(snapshotVos)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object codeValue = getCode();
        String codeValueAsString = "";
        codeValueAsString = codeValue.toString();
        sb.append("code=").append(urlEncode(codeValueAsString)).append("");
        Object messageValue = getMessage();
        String messageValueAsString = "";
        messageValueAsString = messageValue.toString();
        sb.append("message=").append(urlEncode(messageValueAsString)).append("");
        Object snapshotVosValue = getSnapshotVos();
        String snapshotVosValueAsString = "";
        snapshotVosValueAsString =
                (String)
                        ((Collection) snapshotVosValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("snapshotVos=").append(urlEncode(snapshotVosValueAsString)).append("");
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
        openapiFields.add("code");
        openapiFields.add("message");
        openapiFields.add("snapshotVos");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryManagedSubAccountFuturesAssetDetailsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryManagedSubAccountFuturesAssetDetailsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " QueryManagedSubAccountFuturesAssetDetailsResponse is not"
                                    + " found in the empty JSON string",
                                QueryManagedSubAccountFuturesAssetDetailsResponse
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull())
                && !jsonObj.get("code").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `code` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("code").toString()));
        }
        if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
                && !jsonObj.get("message").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `message` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("message").toString()));
        }
        if (jsonObj.get("snapshotVos") != null && !jsonObj.get("snapshotVos").isJsonNull()) {
            JsonArray jsonArraysnapshotVos = jsonObj.getAsJsonArray("snapshotVos");
            if (jsonArraysnapshotVos != null) {
                // ensure the json data is an array
                if (!jsonObj.get("snapshotVos").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `snapshotVos` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("snapshotVos").toString()));
                }

                // validate the optional field `snapshotVos` (array)
                for (int i = 0; i < jsonArraysnapshotVos.size(); i++) {
                    QueryManagedSubAccountFuturesAssetDetailsResponseSnapshotVosInner
                            .validateJsonElement(jsonArraysnapshotVos.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryManagedSubAccountFuturesAssetDetailsResponse.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'QueryManagedSubAccountFuturesAssetDetailsResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryManagedSubAccountFuturesAssetDetailsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(QueryManagedSubAccountFuturesAssetDetailsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryManagedSubAccountFuturesAssetDetailsResponse>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                QueryManagedSubAccountFuturesAssetDetailsResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryManagedSubAccountFuturesAssetDetailsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryManagedSubAccountFuturesAssetDetailsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryManagedSubAccountFuturesAssetDetailsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryManagedSubAccountFuturesAssetDetailsResponse
     */
    public static QueryManagedSubAccountFuturesAssetDetailsResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, QueryManagedSubAccountFuturesAssetDetailsResponse.class);
    }

    /**
     * Convert an instance of QueryManagedSubAccountFuturesAssetDetailsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
