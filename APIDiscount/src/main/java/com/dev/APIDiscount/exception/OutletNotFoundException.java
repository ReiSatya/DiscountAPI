package com.dev.APIDiscount.exception;

public class OutletNotFoundException extends RuntimeException {
    public OutletNotFoundException(String message) {
        super(message);
    }
}