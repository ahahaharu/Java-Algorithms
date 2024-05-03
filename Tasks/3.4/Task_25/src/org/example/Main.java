package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String who = scanner.nextLine();

        Date when = new Date(1, 1, 1); // рандомная дата

        System.out.println("Введите сумму:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Это не число. Пожалуйста, введите число:");
            scanner.next();
        }
        double amount = scanner.nextDouble();
        while (amount < 0) {
            System.out.println("Сумма не может быть меньше нуля. Пожалуйста, введите положительное число:");
            amount = scanner.nextDouble();
        }

        Transaction transaction = new Transaction(who, when, amount);
        System.out.println(transaction.hashCode() + " Ожидается: Хеш не найден в кэше");
        System.out.println(transaction.hashCode() + " Ожидается: Хеш найден в кэше");
        System.out.println(transaction.hashCode() + " Ожидается: Хеш найден в кэше");
    }
}