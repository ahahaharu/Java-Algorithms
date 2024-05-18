package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите подстроку для поиска:");
        String pattern = scanner.nextLine();

        BruteSearch bruteSearch = new BruteSearch(pattern);

        int position = bruteSearch.search(text);

        if (position == text.length()) {
            System.out.println("Подстрока не найдена в тексте.");
        } else {
            System.out.println("Подстрока найдена в тексе на позиции: " + position);
        }
    }
}