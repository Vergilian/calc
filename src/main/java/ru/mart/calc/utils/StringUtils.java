package ru.mart.calc.utils;

public final class StringUtils {

    private static final String WHITESPACE_REGEX = "\\s+";

    private StringUtils() {
        throw new RuntimeException();
    }

    public static String[] splitByWhitespace(String string) {
        return string.split(WHITESPACE_REGEX);
    }

}
