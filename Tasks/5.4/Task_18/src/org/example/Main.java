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
a+
Введите текст:
aaaa
true

Введите шаблон:
a+b*
Введите текст:
aabbb
true

Введите шаблон:
a+b*
Введите текст:
bbba
false
 */