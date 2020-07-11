package ru.mart.calc.number;

import ru.mart.calc.utils.RomanToDecimal;

public final class RomanNum extends Num {

    public RomanNum(String value) {
        super(RomanToDecimal.romanToDecimal(value));
    }

}
