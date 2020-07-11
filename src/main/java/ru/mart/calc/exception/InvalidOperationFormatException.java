package ru.mart.calc.exception;

public final class InvalidOperationFormatException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Invalid operation format, supported operations are '*, /, +, -'";
    }

}
