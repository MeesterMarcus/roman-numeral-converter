package com.company;

/**
 * Convert roman numerals to numbers.
 * @author Marcus Lorenzana
 */
public class Main {

    public static void main(String[] args) {
        String s = "XCIII";
        RomanNumeralConverter numeralConverter = new RomanNumeralConverter(s);
        System.out.println(s + " -> " + numeralConverter.romanToInt());
    }
}
