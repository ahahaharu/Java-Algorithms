package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите шаблон для поиска:");
        String pattern = scanner.nextLine();

        BoyerMoore boyerMoore = new BoyerMoore(pattern);

        int count = boyerMoore.count(text);
        System.out.println("Количество вхождений шаблона: " + count);

        System.out.println("Все вхождения шаблона:");
        boyerMoore.searchAll(text);
    }
}