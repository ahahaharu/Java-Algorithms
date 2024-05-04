package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashAttack hashAttack = new HashAttack();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение N для строк:");
        int n = scanner.nextInt();

        List<String> hashAttackInput = hashAttack.generateStringsInput(n);

        System.out.println("Сгенерированные строки:");
        for (String string : hashAttackInput) {
            System.out.println(string);
        }
    }
}