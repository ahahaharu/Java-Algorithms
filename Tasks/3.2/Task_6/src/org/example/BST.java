package org.example;

import java.util.Scanner;

public class BST<Key extends Comparable<Key>> {
    private Node root;

    private class Node {
        private Key key;
        private Node left, right;
        private int N;
        private int height; // высота узла

        public Node(Key key, int N) {
            this.key = key;
            this.N = N;
            this.height = 1;
        }

        public int size() {
            return size(root);
        }

        private int size(Node x) {
            if (x == null) return 0;
            else return x.N;
        }

        private Node put(Node x, Key key) {
            if (x == null) return new Node(key, 1);
            int cmp = key.compareTo(x.key);
            if (cmp < 0) x.left = put(x.left, key);
            else if (cmp > 0) x.right = put(x.right, key);
            else x.key = key;
            x.N = size(x.left) + size(x.right) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;
            return x;
        }

        // Рекурсивный метод для вычисления высоты дерева
        int height(Node node) {
            if (node == null)
                return 0;
            else
                return Math.max(height(node.left), height(node.right)) + 1;
        }

        // Метод, подобный size(), с использованием дополнительного поля в каждом узле дерева
        int heightFast() {
            return root.height;
        }
    }

    public void put(Key key) {
        if (root == null) {
            root = new Node(key, 1);
        } else {
            root = root.put(root, key);
        }
    }

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целые числа (ctrl + D, чтобы завершить)");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            try {
                int key = Integer.parseInt(input);
                bst.put(key);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите только целые числа.");
            }
        }

        System.out.println("Высота дерева (рекурсивно): " + bst.root.height(bst.root));
        System.out.println("Высота дерева (быстро): " + bst.root.heightFast());
    }
}
