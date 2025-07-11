/*
 * Binance Pay REST API
 * OpenAPI Specification for the Binance Pay REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.pay.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.Pair;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.exception.ConstraintViolationException;
import com.binance.connector.client.pay.rest.model.GetPayTradeHistoryResponse;
import com.google.gson.reflect.TypeToken;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.*;
import jakarta.validation.executable.ExecutableValidator;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

public class PayApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    private static final String USER_AGENT =
            String.format(
                    "binance-pay/2.1.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());
    private static final boolean HAS_TIME_UNIT = false;

    public PayApi(ClientConfiguration clientConfiguration) {
        this(new ApiClient(clientConfiguration));
    }

    public PayApi(ApiClient apiClient) {
        apiClient.setUserAgent(USER_AGENT);
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPayTradeHistory
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit default 100, max 100 (optional)
     * @param recvWindow (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Pay Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/pay/rest-api/Get-Pay-Trade-History">Get Pay
     *     Trade History Documentation</a>
     */
    private okhttp3.Call getPayTradeHistoryCall(
            Long startTime, Long endTime, Long limit, Long recvWindow) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sapi/v1/pay/transactions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startTime", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endTime", endTime));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (recvWindow != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recvWindow", recvWindow));
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/x-www-form-urlencoded"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        List<String> localVarAuthNames = new ArrayList<>();
        localVarAuthNames.addAll(
                Arrays.asList(
                        new String[] {
                            "binanceSignature",
                        }));
        if (HAS_TIME_UNIT) {
            localVarAuthNames.add("timeUnit");
        }
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames.toArray(new String[0]));
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPayTradeHistoryValidateBeforeCall(
            Long startTime, Long endTime, Long limit, Long recvWindow) throws ApiException {
        try {
            Validator validator =
                    Validation.byDefaultProvider()
                            .configure()
                            .messageInterpolator(new ParameterMessageInterpolator())
                            .buildValidatorFactory()
                            .getValidator();
            ExecutableValidator executableValidator = validator.forExecutables();

            Object[] parameterValues = {startTime, endTime, limit, recvWindow};
            Method method =
                    this.getClass()
                            .getMethod(
                                    "getPayTradeHistory",
                                    Long.class,
                                    Long.class,
                                    Long.class,
                                    Long.class);
            Set<ConstraintViolation<PayApi>> violations =
                    executableValidator.validateParameters(this, method, parameterValues);

            if (violations.size() == 0) {
                return getPayTradeHistoryCall(startTime, endTime, limit, recvWindow);
            } else {
                throw new ConstraintViolationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }

    /**
     * Get Pay Trade History Get Pay Trade History * If startTime and endTime are not sent, the
     * recent 90 days&#39; data will be returned. * The max interval between startTime and endTime
     * is 90 days. * Support for querying orders within the last 18 months. * For payerInfo and
     * receiverInfo，there are different return values in different orderTypes. * Sender&#39;s
     * perspective when orderType is C2C * payerInfo : binanceId * receiverInfo : name,
     * binanceId/accountId/email/countryCode/phoneNumber/mobileCode (based on user input) *
     * Receiver&#39;s perspective when orderType is C2C * payerInfo : name, accountId * receiverInfo
     * : binanceId * Sender&#39;s perspective when orderType is CRYPTO_BOX * payerInfo : binanceId *
     * receiverInfo : name(the value is always \&quot;Crypto Box\&quot;) * Receiver&#39;s
     * perspective when orderType is CRYPTO_BOX * payerInfo : name, accountId * receiverInfo :
     * binanceId * Sender&#39;s perspective when orderType is PAY * payerInfo : binanceId *
     * receiverInfo : name * Receiver&#39;s perspective when orderType is PAY * payerInfo : name,
     * accountId * receiverInfo : binanceId, name * Sender&#39;s perspective when orderType is
     * PAY_REFUND * payerInfo : binanceId, name * receiverInfo : name, accountId * Receiver&#39;s
     * perspective when orderType is PAY_REFUND * payerInfo : name * receiverInfo : binanceId *
     * Sender&#39;s perspective when orderType is PAYOUT * payerInfo : binanceId, name *
     * receiverInfo : name, accountId * Receiver&#39;s perspective when orderType is PAYOUT *
     * payerInfo : name * receiverInfo : binanceId * Receiver&#39;s perspective when orderType is
     * CRYPTO_BOX_RF * payerInfo : name(the value is always \&quot;Crypto Box\&quot;) * receiverInfo
     * : binanceId * Sender&#39;s perspective when orderType is REMITTANCE * payerInfo : binanceId *
     * receiverInfo : name, institutionName, cardNumber, digitalWalletId Weight: 3000
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit default 100, max 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetPayTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Pay Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/pay/rest-api/Get-Pay-Trade-History">Get Pay
     *     Trade History Documentation</a>
     */
    public ApiResponse<GetPayTradeHistoryResponse> getPayTradeHistory(
            Long startTime, Long endTime, Long limit, Long recvWindow) throws ApiException {
        okhttp3.Call localVarCall =
                getPayTradeHistoryValidateBeforeCall(startTime, endTime, limit, recvWindow);
        java.lang.reflect.Type localVarReturnType =
                new TypeToken<GetPayTradeHistoryResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }
}
