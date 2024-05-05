package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество массивов:");
        int n = scanner.nextInt();

        int[][] arrays = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите количество элементов в массиве " + (i + 1) + ":");
            int m = scanner.nextInt();

            arrays[i] = new int[m];

            System.out.println("Введите элементы массива " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }

        arraySort.threeWayStringQuickSortArrays(arrays);

        System.out.println("Отсортированные массивы:");
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}