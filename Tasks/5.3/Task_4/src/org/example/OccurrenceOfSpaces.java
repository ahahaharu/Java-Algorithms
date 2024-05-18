package org.example;

public class OccurrenceOfSpaces {
    public int findBlankCharacters(String text, int mSpaces) {
        int textLength = text.length();
        int consecutiveBlanks;
        int i;

        for (i = 0, consecutiveBlanks = 0; i < textLength && consecutiveBlanks < mSpaces; i++) {
            if (text.charAt(i) == ' ') {
                consecutiveBlanks++;
            } else {
                consecutiveBlanks = 0;
            }
        }

        if (consecutiveBlanks == mSpaces) {
            return i - mSpaces;
        } else {
            return textLength;
        }
    }
}
