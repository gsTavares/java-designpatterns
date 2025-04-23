package com.example.structural.flyweight.message;

import java.util.HashMap;
import java.util.Map;

// Returns shared flyweight based on key
public class ErrorMessageFactory {

    public enum ErrorType {
        GenericSystemError, PageNotFoundError, ServerError
    };

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GenericSystemError, new SystemErrorMessage(
                "A generic error of type $errorCode occurred. Please refer to:\n", "https://google.com/q="));
        errorMessages.put(ErrorType.PageNotFoundError, new SystemErrorMessage(
                "Page not found. Please refer to:\n", "https://google.com/q="));
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }

}
