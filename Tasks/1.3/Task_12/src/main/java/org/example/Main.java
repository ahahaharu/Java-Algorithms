package org.example;

import java.util.LinkedList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите k:");
        int k = scanner.nextInt();

        System.out.println("Введите элементы очереди (ctrl + D, чтобы закончить):");
        while (scanner.hasNextLine()) {
            queue.add(scanner.nextLine());
            if (queue.size() > k) {
                queue.removeFirst();
            }
        }

        if (queue.size() < k) {
            System.out.println("Количество строк меньше, чем k");
        } else {
            System.out.println(queue.peekFirst());
        }
    }
}