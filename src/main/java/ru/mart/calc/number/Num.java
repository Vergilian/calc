package ru.mart.calc.number;

public abstract class Num {

    private final int value;

    protected Num(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
