public class BruteSearch {
    private String pattern;
    private int patternLength;

    public BruteSearch(String pattern) {
        this.pattern = pattern;
        patternLength = pattern.length();
    }

    public int search(String text) {
        int textLength = text.length();

        for (int textIndex = 0; textIndex <= textLength - patternLength; textIndex++) {
            int patternIndex;

            for (patternIndex = 0; patternIndex < patternLength; patternIndex++) {
                if (text.charAt(textIndex + patternIndex) != pattern.charAt(patternIndex)) {
                    break;
                }
            }

            if (patternIndex == patternLength) {
                return textIndex;
            }
        }

        return textLength;
    }
}
