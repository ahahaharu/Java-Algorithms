package org.example;

import java.util.Scanner;

public class BST<Key extends Comparable<Key>> {
    private Node root;

    private class Node {
        private Key key;
        private Node left, right;
        private int N;
        int x, y;

        public Node(Key key, int N) {
            this.key = key;
            this.N = N;
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
            return x;
        }

        // Рисование дерева
        void draw() {
            drawRec(root, 0, 0);
        }

        void drawRec(Node node, int space, int level) {
            if (node == null)
                return;

            // Увеличение отступа для каждого уровня
            space += 10;

            // Сначала обрабатываем правое поддерево
            drawRec(node.right, space, level + 1);

            // Печатаем текущий узел после отступа
            System.out.print("\n");
            for (int i = 10; i < space; i++)
                System.out.print(" ");
            System.out.print(node.key + "\n");

            // Затем обрабатываем левое поддерево
            drawRec(node.left, space, level + 1);
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
        System.out.println("Введите числа для добавления в BST (нажмите Ctrl+D для завершения):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int key = scanner.nextInt();
                bst.put(key);
            } else {
                System.out.println("Неверный ввод. Пожалуйста, введите число.");
                scanner.next(); // пропустить неверный ввод
            }
        }
        bst.root.draw();

        // если что дерево рисуется слева направо, а не сверху вниз
    }
}
