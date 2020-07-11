package ru.mart.calc.factory;

import ru.mart.calc.exception.InvalidNumberFormatException;
import ru.mart.calc.number.ArabicNum;
import ru.mart.calc.number.Num;
import ru.mart.calc.number.RomanNum;

public final class NumFactory implements Factory<Num> {

    private static final String ARABIC_REGEX = "^[0-9]+$";
    private static final String ROMAN_REGEX = "^[XVI]+$";

    private static final NumFactory INSTANCE = new NumFactory();

    private NumFactory() {

    }

    public static NumFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public Num createFromString(String value) {
        if (value.matches(ARABIC_REGEX)) {
            return new ArabicNum(value);
        } else if (value.matches(ROMAN_REGEX)) {
            return new RomanNum(value);
        } else {
            throw new InvalidNumberFormatException(value);
        }
    }

}
