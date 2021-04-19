package com.company;

/**
 * Convert roman numerals to numbers.
 * @author Marcus Lorenzana
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Incorrect arguments.");
        } else {
            String romanNumeral = args[0];
            RomanNumeralConverter numeralConverter = new RomanNumeralConverter(romanNumeral);
            System.out.println(romanNumeral + " -> " + numeralConverter.romanToInt());
        }
    }
}
