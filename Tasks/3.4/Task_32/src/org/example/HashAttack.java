package org.example;

import java.util.ArrayList;
import java.util.List;

public class HashAttack {
    public int hashCode(String string) {
        int hash = 0;

        for (int i = 0; i < string.length(); i++) {
            hash = (hash * 31) + string.charAt(i);
        }

        return hash;
    }

    List<String> generateStringsInput(int n) {
        String[] values = {"Aa", "BB"};

        List<String> strings = new ArrayList<>();
        generateStrings(n, 0, strings, "", values);

        return strings;
    }

    // Рекурсивная функция для генерации всех возможных строк
    private void generateStrings(int n, int currentIndex, List<String> strings, String currentString, String[] values) {
        if (currentIndex == n) {
            strings.add(currentString);
            return;
        }

        for (String value : values) {
            String newValue = currentString + value;
            int newIndex = currentIndex + 1;

            generateStrings(n, newIndex, strings, newValue, values);
        }
    }
}
