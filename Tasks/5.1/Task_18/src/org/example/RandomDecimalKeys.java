package org.example;

import java.security.SecureRandom;

public class RandomDecimalKeys {
    public static String[] randomDecimalKeys(int numberOfStrings, int numberOfDigits) {
        String[] strings = new String[numberOfStrings];
        SecureRandom random = new SecureRandom();

        for (int string = 0; string < numberOfStrings; string++) {
            StringBuilder currentString = new StringBuilder();

            for (int digit = 0; digit < numberOfDigits; digit++) {
                int digitValue = random.nextInt(10);
                currentString.append(digitValue);
            }

            strings[string] = currentString.toString();
        }
        return strings;
    }
}
