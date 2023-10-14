package org.example;

public class InvalidIndexEception extends RuntimeException {
    public InvalidIndexEception() {
    }

    public InvalidIndexEception(String message) {
        super(message);
    }

    public InvalidIndexEception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIndexEception(Throwable cause) {
        super(cause);
    }

    public InvalidIndexEception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
