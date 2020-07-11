package ru.mart.calc;

import ru.mart.calc.operation.Operation;

public final class Calculator {

    public double calculate(int left, Operation operation, int right) {
        return operation.apply(left, right);
    }

}
