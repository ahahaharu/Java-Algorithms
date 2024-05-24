package org.example;

public class BoyerMoore {
    private int[] right;
    private String pat;

    BoyerMoore (String pat) {
        this.pat = pat;
        int M = pat.length();
        int R = 256;
        right = new int[R];
        for (int c = 0; c < R; c++) {
            right[c] = -1;
        }
        for (int j = 0; j < M; j++) {
            right[pat.charAt(j)] = j;
        }
    }

    public int search(String txt) {
        int N = txt.length();
        int M = pat.length();
        int skip;
        for (int i = 0; i <= N-M; i+= skip)
        {
            skip = 0;

            for (int j = M-1; j >= 0; j--)
                if (pat.charAt(j) != txt.charAt(i+j)) {
                    skip = j - right[txt.charAt(i+j)];
                    if (skip < 1) skip = 1;
                    break;
                }

            if (skip == 0) return i;
        }
        return N;
    }

    public int count(String text) {
        int count = 0;

        int occurrenceIndex = searchFromIndex(text, 0);

        while (occurrenceIndex != text.length()) {
            count++;
            occurrenceIndex = searchFromIndex(text, occurrenceIndex + 1);
        }

        return count;
    }

    public void searchAll(String text) {
        int occurrenceIndex = searchFromIndex(text, 0);

        if (occurrenceIndex == text.length()) {
            System.out.println("Нет совпадений");
            return;
        }

        while (occurrenceIndex != text.length()) {
            System.out.println("Шаблон найден по индексу " + occurrenceIndex);
            occurrenceIndex = searchFromIndex(text, occurrenceIndex + 1);
        }
    }

    protected int searchFromIndex(String text, int textStartIndex) {
        int textLength = text.length();
        int patternLength = pat.length();

        int skip;

        for (int textIndex = textStartIndex; textIndex <= textLength - patternLength; textIndex += skip) {
            skip = 0;

            for (int patternIndex = patternLength - 1; patternIndex >= 0; patternIndex--) {
                if (pat.charAt(patternIndex) != text.charAt(textIndex + patternIndex)) {
                    skip = Math.max(1, patternIndex - right[text.charAt(textIndex + patternIndex)]);
                    break;
                }
            }
            if (skip == 0) {
                return textIndex;
            }
        }

        return textLength;
    }
}
