package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Шаблон (.*AB((C|D|E)F)*G)");
        NFA nfa = new NFA("(.*AB((C|D|E)F)*G)*");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки для проверки. Для завершения введите ctrl+D.");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(nfa.recognizes(input));
        }
    }
}