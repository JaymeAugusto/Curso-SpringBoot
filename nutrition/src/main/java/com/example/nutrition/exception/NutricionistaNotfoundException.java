package com.example.nutrition.exception;

public class NutricionistaNotfoundException extends Exception{

    private static final long serialVersionUID = -750633466311099779L;

    public NutricionistaNotfoundException() {
    }

    public NutricionistaNotfoundException(String message) {
        super(message);
    }

    public NutricionistaNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NutricionistaNotfoundException(Throwable cause) {
        super(cause);
    }

    public NutricionistaNotfoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
