package ru.mart.calc.exception;

public final class InvalidInputFormatException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Valid input should match the format 'number operation number'";
    }

}
