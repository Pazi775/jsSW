// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

public class ApiAlbumsLimitException extends ApiException {
    public ApiAlbumsLimitException(String message) {
        super(302, "Albums number limit is reached", message);
    }
}