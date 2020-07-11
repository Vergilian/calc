package ru.mart.calc.exception;

public final class NumTypeMismatchException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Both numbers should be have the same type (arabic or roman)";
    }

}
