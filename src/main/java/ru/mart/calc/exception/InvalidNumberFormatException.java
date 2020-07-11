package ru.mart.calc.exception;

public final class InvalidNumberFormatException extends RuntimeException {

    private final String value;

    public InvalidNumberFormatException(String value) {
        this.value = value;
    }

    @Override
    public String getMessage() {
        return String.format(
                "Provided value '%s' doesn't match the required pattern (should be roman or natural arabic)",
                value
        );
    }

}
