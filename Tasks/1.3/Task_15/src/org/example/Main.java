package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int k;

        while (true) {
            System.out.println("Введите число k:");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число. Пожалуйста, введите число:");
                scanner.next();
            }
            k = scanner.nextInt();
            if (k < 0) {
                System.out.println("Число не может быть меньше 0. Пожалуйста, введите число больше или равно 0:");
            } else {
                break;
            }
        }

        System.out.println("Введите элементы очереди (ctrl + D, чтобы закончить):");
        while (scanner.hasNextLine()) {
            queue.add(scanner.nextLine());
            if (queue.size() > k) {
                queue.remove();
            }
        }

        if (queue.size() < k) {
            System.out.println("Количество строк меньше, чем k");
        } else {
            System.out.println(queue.peek());
        }
    }
}