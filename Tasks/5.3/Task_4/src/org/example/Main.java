package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите количество последовательных пробелов:");
        int mSpaces = scanner.nextInt();

        OccurrenceOfSpaces occurrenceOfSpaces = new OccurrenceOfSpaces();
        int position = occurrenceOfSpaces.findBlankCharacters(text, mSpaces);

        if (position == text.length()) {
            System.out.println("В тексте нет " + mSpaces + " последовательных пробелов.");
        } else {
            System.out.println("Позиция первого вхождения " + mSpaces + " последовательных пробелов в тексте: " + position);
        }
    }
}
