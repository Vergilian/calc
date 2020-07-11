package ru.mart.calc.exception;

public final class NumberRangeExceededException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Number range should be in range 1..10";
    }

}
