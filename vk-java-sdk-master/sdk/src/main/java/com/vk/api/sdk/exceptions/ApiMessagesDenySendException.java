// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

public class ApiMessagesDenySendException extends ApiException {
    public ApiMessagesDenySendException(String message) {
        super(901, "Can't send messages for users without permission", message);
    }
}
