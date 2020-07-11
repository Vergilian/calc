package ru.mart.calc;

import ru.mart.calc.exception.NumTypeMismatchException;
import ru.mart.calc.exception.NumberRangeExceededException;
import ru.mart.calc.number.Num;
import ru.mart.calc.number.Num.Type;
import ru.mart.calc.operation.Operation;
import ru.mart.calc.utils.RomanNumConverter;

public final class Calculator {

    private final static Calculator INSTANCE = new Calculator();

    private Calculator() {

    }

    public static Calculator getInstance() {
        return INSTANCE;
    }

    public String calculate(Num left, Operation operation, Num right) {
        if (!left.getType().equals(right.getType())) {
            throw new NumTypeMismatchException();
        }
        if (left.getValue() > 10 || right.getValue() > 10 || left.getValue() < 1 || right.getValue() < 1) {
            throw new NumberRangeExceededException();
        }
        double result = operation.apply(left.getValue(), right.getValue());
        return left.getType().equals(Type.ROMAN) ? RomanNumConverter.doubleToRoman(result) : String.valueOf(result);
    }

}
