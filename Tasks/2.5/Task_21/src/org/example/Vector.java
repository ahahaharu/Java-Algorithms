package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Vector implements Comparable<Vector> {
    private final int[] components;

    public Vector(int[] components) {
        this.components = components;
    }

    @Override
    public int compareTo(Vector other) {
        int n = Math.min(this.components.length, other.components.length);
        for (int i = 0; i < n; i++) {
            if (this.components[i] < other.components[i]) {
                return -1;
            } else if (this.components[i] > other.components[i]) {
                return 1;
            }
        }
        return Integer.compare(this.components.length, other.components.length);
    }

    public String toString() {
        return Arrays.toString(components);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;

        System.out.println("Введите количество векторов:");
        int n = scanner.nextInt();
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            count = i+1;

            System.out.println("Введите количество компонентов вектора "+count+":");
            int d = scanner.nextInt();
            int[] components = new int[d];
            System.out.println("Введите компоненты вектора "+count+":");
            for (int j = 0; j < d; j++) {
                components[j] = scanner.nextInt();
            }
            vectors[i] = new Vector(components);
        }
        Arrays.sort(vectors);
        System.out.println("Отсортированные векторы:");
        for (Vector vector : vectors) {
            System.out.println(vector);
        }
    }
}
