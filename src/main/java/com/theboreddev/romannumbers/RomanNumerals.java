package com.theboreddev.romannumbers;

import java.util.NavigableMap;
import java.util.TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class RomanNumerals {

    private static final NavigableMap<Integer, String> ROMAN_NUMERALS = new TreeMap<>() {
        {
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }
    };

    public static String convert(int number) {
        final String result = ROMAN_NUMERALS.get(number);
        return result != null ? result : calculateRomanNumeral(number);
    }

    private static String calculateRomanNumeral(int number) {
        final Integer lowerKey = ROMAN_NUMERALS.lowerKey(number);
        return ROMAN_NUMERALS.get(lowerKey) + convert(number - lowerKey);
    }
}

