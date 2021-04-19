package com.company;

public class RomanNumeralConverter {

    String romanNumeral;

    public RomanNumeralConverter(String s) {
        this.romanNumeral = s;
    }

    public int romanToInt() {
        String[] specialRoman = new String[]{"IV", "IX", "XL", "XC", "CD", "CM"};
        int finalNum = 0;
        for (String r : specialRoman) {
            if (romanNumeral.contains(r)) {
                finalNum += getNumberByLetter(r);
                romanNumeral = romanNumeral.replace(r, "");
            }
        }
        char[] array = romanNumeral.toCharArray();
        for (Character c : array) {
            finalNum += getNumberByLetter(c.toString());
        }
        return finalNum;
    }

    private int getNumberByLetter(String s) {
        switch (s) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
        }
        return 0;
    }

}
