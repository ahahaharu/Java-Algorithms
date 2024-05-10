import java.security.SecureRandom;

public class MonkeyTyping {
    private static final int ALPHABET_SIZE = 26;
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generateWord(double p, int maxLength) {
        StringBuilder word = new StringBuilder();
        while (RANDOM.nextDouble() < p * ALPHABET_SIZE && word.length() < maxLength) {
            char letter = (char) ('a' + RANDOM.nextInt(ALPHABET_SIZE));
            word.append(letter);
        }
        return word.toString();
    }
}
