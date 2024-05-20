package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шаблон:");
        String regexpr = scanner.nextLine();
        System.out.println("Введите текст:");
        String txt = scanner.nextLine();

        NFA nfa = new NFA(regexpr);

        System.out.println(nfa.recognizes(txt));


    }
}

/*
Введите шаблон:
R.N.1.3
Введите текст:
RENE123
true
 */