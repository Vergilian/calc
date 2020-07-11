package ru.mart.calc.exception;

public final class InvalidRomanNumberException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Invalid roman number format. Supported symbols are 'X, V, I'";
    }

}
