package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, Integer> bst = new RedBlackBST<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для добавления в дерево (или 'ctrl+D' для выхода):");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            try {
                int key = Integer.parseInt(input);
                bst.put(key, key);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
            }
        }

        System.out.println("Красно-черное дерево:");
        bst.draw();
    }
}