package org.example;

public class LSDSortVariableLength {
    public void lsdSort(String[] array) {

        if (array == null || array.length == 0) {
            return;
        }

        int alphabetSize = 256; // Extended ASCII characters

        String[] auxArray = new String[array.length];
        int maxStringLength = getMaxStringLength(array);

        for (int digit = maxStringLength - 1; digit >= 0; digit--) {
            // Sort by key-indexed counting on digitTh char

            // Compute frequency counts
            int count[] = new int[alphabetSize + 1];
            for (int i = 0; i < array.length; i++) {
                int digitIndex = charAt(array[i], digit);
                count[digitIndex + 1]++;
            }

            // Transform counts to indices
            for (int r = 0; r < alphabetSize; r++) {
                count[r + 1] += count[r];
            }

            // Distribute
            for (int i = 0; i < array.length; i++) {
                int digitIndex = charAt(array[i], digit);
                int indexInAuxArray = count[digitIndex]++;
                auxArray[indexInAuxArray] = array[i];
            }

            // Copy back
            for (int i = 0; i < array.length; i++) {
                array[i] = auxArray[i];
            }
        }
    }

    private int getMaxStringLength(String[] strings) {
        int maxLength = -1;

        for (String string : strings) {
            if (string.length() > maxLength) {
                maxLength = string.length();
            }
        }
        return maxLength;
    }

    // If digit is non-existent, return 0, which is the smallest value possible
    private int charAt(String string, int digit) {
        if (digit < string.length()) {
            return string.charAt(digit);
        } else {
            return 0;
        }
    }
}
