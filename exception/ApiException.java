package com.example.Clinic.exception;

public class ApiException extends RuntimeException {

    public ApiException(String message) {
        super(message); // Enables ex.getMessage() in handler
    }
}
