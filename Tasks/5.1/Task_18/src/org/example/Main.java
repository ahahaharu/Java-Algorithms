package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк:");
        int numberOfStrings = scanner.nextInt();

        System.out.println("Введите количество цифр:");
        int numberOfDigits = scanner.nextInt();

        String[] randomKeys = RandomDecimalKeys.randomDecimalKeys(numberOfStrings, numberOfDigits);

        System.out.println("Сгенерированные ключи:");
        for (String key : randomKeys) {
            System.out.println(key);
        }
    }
}