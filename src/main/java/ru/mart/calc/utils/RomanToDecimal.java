package ru.mart.calc.utils;

import ru.mart.calc.exception.InvalidRomanNumberException;

public final class RomanToDecimal {

    private RomanToDecimal() {
        throw new RuntimeException();
    }

    public static int romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);
            switch (convertToDecimal) {
                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;
                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;
                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
                default:
                    throw new InvalidRomanNumberException();
            }
        }
        return decimal;
    }

    private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        return lastNumber > decimal ? lastDecimal - decimal : lastDecimal + decimal;
    }

}