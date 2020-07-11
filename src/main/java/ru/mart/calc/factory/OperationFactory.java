package ru.mart.calc.factory;

import ru.mart.calc.exception.InvalidOperationFormatException;
import ru.mart.calc.operation.Addition;
import ru.mart.calc.operation.Division;
import ru.mart.calc.operation.Multiplication;
import ru.mart.calc.operation.Operation;
import ru.mart.calc.operation.Subtraction;

public final class OperationFactory implements Factory<Operation> {

    private static final OperationFactory INSTANCE = new OperationFactory();

    private OperationFactory() {

    }

    public static OperationFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public Operation createFromString(String value) {
        if (value.length() != 1) {
            throw new InvalidOperationFormatException();
        }
        switch (value.charAt(0)) {
            case '*':
                return new Multiplication();
            case '/':
                return new Division();
            case '+':
                return new Addition();
            case '-':
                return new Subtraction();
            default:
                throw new InvalidOperationFormatException();
        }
    }

}
