package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шаблон для поиска:");
        String pat = scanner.nextLine();

        RabinKarp rk = new RabinKarp(pat);
        long prime = rk.longRandomPrime();

        System.out.println("Случайное простое число: " + prime);
    }
}