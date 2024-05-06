package org.example;

public class LSDSortVariableLength {
    public void lsdSort(String[] array) {

        if (array == null || array.length == 0) {
            return;
        }

        int alphabetSize = 256;

        String[] auxArray = new String[array.length];
        int maxStringLength = getMaxStringLength(array);

        for (int digit = maxStringLength - 1; digit >= 0; digit--) {

            int[] count = new int[alphabetSize + 1];
            for (String s : array) {
                int digitIndex = charAt(s, digit);
                count[digitIndex + 1]++;
            }

            for (int r = 0; r < alphabetSize; r++) {
                count[r + 1] += count[r];
            }
            
            for (String s : array) {
                int digitIndex = charAt(s, digit);
                int indexInAuxArray = count[digitIndex]++;
                auxArray[indexInAuxArray] = s;
            }

            System.arraycopy(auxArray, 0, array, 0, array.length);
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

    private int charAt(String string, int digit) {
        if (digit < string.length()) {
            return string.charAt(digit);
        } else {
            return 0;
        }
    }
}
