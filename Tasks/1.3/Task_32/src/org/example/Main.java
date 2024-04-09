package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StackQueue<String> stackQueue = new StackQueue<>();

    public static void main(String[] args) {
        while(true) {
            printMenu();
            int choice = getUserChoice();
            executeChoice(choice);
        }
    }

    private static void printMenu() {
        System.out.println("1 - Вывести содержимое стеко-очереди");
        System.out.println("2 - Втолкнуть элемент");
        System.out.println("3 - Вытолкнуть элемент");
        System.out.println("4 - Занести элемент");
        System.out.println("0 - Завершить программу");
    }

    private static int getUserChoice() {
        int choice;
        while (true) {
            System.out.print("Введите число для выбора: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Это не число. Пожалуйста, введите число: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice < 0 || choice > 4) {
                System.out.print("Такого варианта нет в меню, введите верное число: ");
            } else {
                break;
            }
        }
        return choice;
    }

    private static void executeChoice(int choice) {
        if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            printStackQueue();
        } else if (choice == 2) {
            pushElement();
        } else if (choice == 3) {
            popElement();
        } else {
            enqueueElement();
        }
    }

    private static void printStackQueue() {
        if (stackQueue.isEmpty()) {
            System.out.println("\nСтеко-очередь пуста\n");
        } else {
            System.out.println("Содержимое стеко-очереди:");
            stackQueue.print();
            System.out.print("\n");
        }
    }

    private static void pushElement() {
        System.out.print("\nВведите элемент, который нужно втолкнуть: ");
        String value = scanner.nextLine();
        stackQueue.push(value);
        System.out.println("Элемент '"+value+"' был втолкнут\n");
    }

    private static void popElement() {
        if (stackQueue.isEmpty()) {
            System.out.println("Стеко-очередь пуста. Выталкивать нечего\n");
        } else {
            System.out.println("\nВытолкнутый элемент: " + stackQueue.pop() + "\n");
        }
    }

    private static void enqueueElement() {
        System.out.print("\nВведите элемент, который нужно занести: ");
        String value = scanner.nextLine();
        stackQueue.enqueue(value);
        System.out.println("Элемент '"+value+"' был занесён\n");
    }
}
