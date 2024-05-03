package org.example;

import java.util.*;

public class BST {
    Node root;
    Set<Integer> set = new HashSet<>();

    public class Node {
        private int key;
        private Node left;
        private Node right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    boolean hasNoDuplicates(Node node) {
        if (node == null)
            return true;

        if (set.contains(node.key))
            return false;

        set.add(node.key);

        return hasNoDuplicates(node.left) && hasNoDuplicates(node.right);
    }

    Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key <= root.key)
            root.left = insertNode(root.left, key);
        else
            root.right = insertNode(root.right, key);

        return root;
    }

    public static void main(String[] args) {
        BST tree = new BST();

        System.out.println("Введите ключи узлов бинарного дерева (введите ctrl + D, чтобы завершить)");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int key = scanner.nextInt();
            tree.root = tree.insertNode(tree.root, key);
        }

        System.out.println("Проверка на дубликаты ключей: " + (tree.hasNoDuplicates(tree.root) ? "Нет дубликатов" : "Есть дубликаты"));
    }
}
