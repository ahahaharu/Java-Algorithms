package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MoveToFront mtf = new MoveToFront();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите символы для списка (ctrl + D, чтобы закончить):");
        while (scanner.hasNext()) {
            char symbol = scanner.next().charAt(0);
            mtf.processCharacter(symbol);
        }
        System.out.println("Список:");
        mtf.printList();
    }
}