package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackQueue<String> stackQueue = new StackQueue<>();
        Scanner scanner = new Scanner(System.in);
        int choose;

        while(true) {
            System.out.println("1 - Вывести содержимое стеко-очереди");
            System.out.println("2 - Втолкнуть элемент");
            System.out.println("3 - Вытолкнуть элемент");
            System.out.println("4 - Занести элемент");
            System.out.println("0 - Завершить программу");

            while (true) {
                System.out.print("Введите число для выбора: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Это не число. Пожалуйста, введите число: ");
                    scanner.next();
                }
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose < 0 || choose > 4) {
                    System.out.print("Такого варианта нет в меню, введите верное число: ");
                } else {
                    break;
                }
            }

            if (choose == 0) {
                break;
            } else if (choose == 1) {
                if (stackQueue.isEmpty()) {
                    System.out.println("\nСтеко-очередь пуста\n");
                } else {
                    System.out.println("Содержимое стеко-очереди:");
                    stackQueue.print();
                    System.out.print("\n");
                }
            } else if (choose == 2) {
                String value;

                System.out.print("\nВведите элемент, который нужно втолкнуть: ");
                value = scanner.nextLine();
                stackQueue.push(value);
                System.out.println("Элемент '"+value+"' был втолкнут\n");
            } else if (choose == 3) {
                if (stackQueue.isEmpty()) {
                    System.out.println("Стеко-очередь пуста. Выталкивать нечего\n");
                } else {
                    System.out.println("\nВытолкнутый элемент: " + stackQueue.pop() + "\n");
                }
            } else {
                String value;

                System.out.print("\nВведите элемент, который нужно занести: ");
                value = scanner.nextLine();
                stackQueue.enqueue(value);
                System.out.println("Элемент '"+value+"' был занесён\n");
            }
        }
    }
}