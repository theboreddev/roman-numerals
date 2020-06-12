package com.theboreddev.romannumbers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    @Test
    public void convert_shouldReturnI() {

        final String romanNumeral = RomanNumerals.convert(1);

        assertThat(romanNumeral, is("I"));
    }

    @Test
    public void convert_shouldReturnII() {

        final String romanNumeral = RomanNumerals.convert(2);

        assertThat(romanNumeral, is("II"));
    }

    @Test
    public void convert_shouldReturnIII() {

        final String romanNumeral = RomanNumerals.convert(3);

        assertThat(romanNumeral, is("III"));
    }

    @Test
    public void convert_shouldReturnIV() {

        final String romanNumeral = RomanNumerals.convert(4);

        assertThat(romanNumeral, is("IV"));
    }

    @Test
    public void convert_shouldReturnV() {

        final String romanNumeral = RomanNumerals.convert(5);

        assertThat(romanNumeral, is("V"));
    }

    @Test
    public void convert_shouldReturnVI() {

        final String romanNumeral = RomanNumerals.convert(6);

        assertThat(romanNumeral, is("VI"));
    }

    @Test
    public void convert_shouldReturnCMXCIX() {

        final String romanNumeral = RomanNumerals.convert(999);

        assertThat(romanNumeral, is("CMXCIX"));
    }

    @Test
    public void convert_shouldReturnIX() {

        final String romanNumeral = RomanNumerals.convert(9);

        assertThat(romanNumeral, is("IX"));
    }

    @Test
    public void convert_shouldReturnX() {

        final String romanNumeral = RomanNumerals.convert(10);

        assertThat(romanNumeral, is("X"));
    }

    @Test
    public void convert_shouldReturnL() {

        final String romanNumeral = RomanNumerals.convert(50);

        assertThat(romanNumeral, is("L"));
    }

    @Test
    public void convert_shouldReturnC() {

        final String romanNumeral = RomanNumerals.convert(100);

        assertThat(romanNumeral, is("C"));
    }

    @Test
    public void convert_shouldReturnD() {

        final String romanNumeral = RomanNumerals.convert(500);

        assertThat(romanNumeral, is("D"));
    }

    @Test
    public void convert_shouldReturnM() {

        final String romanNumeral = RomanNumerals.convert(1000);

        assertThat(romanNumeral, is("M"));
    }
}
