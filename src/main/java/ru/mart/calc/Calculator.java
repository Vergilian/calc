package ru.mart.calc;

import ru.mart.calc.operation.Operation;

public final class Calculator {

    private final static Calculator INSTANCE = new Calculator();

    private Calculator() {

    }

    public static Calculator getInstance() {
        return INSTANCE;
    }

    public double calculate(int left, Operation operation, int right) {
        return operation.apply(left, right);
    }

}
