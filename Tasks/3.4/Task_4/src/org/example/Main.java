package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку букв капсом:");
        String input = scanner.nextLine();

        int[] letterValues = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            letterValues[i] = input.charAt(i) - 'A' + 1;
        }

        PerfectHashFunction perfectHash = new PerfectHashFunction();
        int[] values = perfectHash.perfectHashFunction(letterValues);

        if (values != null) {
            System.out.println("a = " + values[0]);
            System.out.println("m = " + values[1]);
        } else {
            System.out.println("Идеальная хеш-функция не найдена.");
        }
    }
}