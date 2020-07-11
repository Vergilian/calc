package ru.mart.calc.number;

public abstract class Num {

    private final int value;
    private final Type type;

    protected Num(int value, Type type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        ARABIC, ROMAN
    }

}
