package ru.mart.calc.operation;

public final class Division extends Operation {

    @Override
    public double apply(int left, int right) {
        return (double) left / right;
    }

}
