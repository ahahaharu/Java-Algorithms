package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LSDSortVariableLength sorter = new LSDSortVariableLength();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки (Ctrl+D для окончания ввода):");

        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        String[] array = list.toArray(new String[0]);
        sorter.lsdSort(array);

        System.out.println("Отсортированный массив:");
        for (String string : array) {
            System.out.println(string);
        }
    }
}