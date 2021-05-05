package com.example.nutrition.exception;

public class NutricionistaResourceException extends Exception{

    private static final long serialVersionUID = -4835662237185758152L;

    public NutricionistaResourceException() {
    }

    public NutricionistaResourceException(String message) {
        super(message);
    }

    public NutricionistaResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NutricionistaResourceException(Throwable cause) {
        super(cause);
    }

    public NutricionistaResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
