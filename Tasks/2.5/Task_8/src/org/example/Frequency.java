package org.example;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        System.out.println("Введдите строки (ctrl + D, чтобы закончить):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            frequencyMap.put(line, frequencyMap.getOrDefault(line, 0) + 1);
        }

        ArrayList<HashMap.Entry<String, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        list.sort(HashMap.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Строка: " + entry.getKey() + ", Частота: " + entry.getValue());
        }
    }
}