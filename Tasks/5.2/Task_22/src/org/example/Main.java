package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p;
        do {
            System.out.println("Введите вероятность добавления буквы (p) в диапазоне от 0 до 1:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Это не число! Пожалуйста, введите число от 0 до 1:");
                scanner.next();
            }
            p = scanner.nextDouble();
        } while (p < 0 || p > 1);

        int numWords;
        do {
            System.out.println("Введите количество слов для генерации:");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не целое число! Пожалуйста, введите целое число больше 0:");
                scanner.next();
            }
            numWords = scanner.nextInt();
        } while (numWords <= 0);

        int maxLength;
        do {
            System.out.println("Введите максимальную длину слова:");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не целое число! Пожалуйста, введите целое число больше 0:");
                scanner.next();
            }
            maxLength = scanner.nextInt();
        } while (maxLength <= 0);

        Map<Integer, Integer> lengthFrequency = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < numWords; i++) {
            String word = MonkeyTyping.generateWord(p, maxLength);
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                lengthFrequency.put(word.length(), lengthFrequency.getOrDefault(word.length(), 0) + 1);
            }
        }

        System.out.println("Распределение частот длин слов:");
        for (Map.Entry<Integer, Integer> entry : lengthFrequency.entrySet()) {
            System.out.println("Длина слова: " + entry.getKey() + ", Частота: " + entry.getValue());
        }
    }
}
