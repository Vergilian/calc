package ru.mart.calc.number;

import ru.mart.calc.utils.RomanNumConverter;

public final class RomanNum extends Num {

    public RomanNum(String value) {
        super(RomanNumConverter.romanToInt(value), Type.ROMAN);
    }

}
