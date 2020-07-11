package ru.mart.calc.operation;

public final class Addition extends Operation {

    @Override
    public double apply(int left, int right) {
        return left + right;
    }

}
