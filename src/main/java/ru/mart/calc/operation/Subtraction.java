package ru.mart.calc.operation;

public final class Subtraction extends Operation {

    @Override
    public double apply(int left, int right) {
        return left - right;
    }

}
