package ru.mart.calc.factory;

public interface Factory<T> {

    T createFromString(String value);

}
