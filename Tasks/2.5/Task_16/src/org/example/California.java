package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class California {
    public static final Comparator<String> CALIFORNIA_ORDER = new CaliforniaOrder();

    private static class CaliforniaOrder implements Comparator<String> {
        private static String order = "RWQOJMVAHBSGZXNTCIEKUPDYFL";

        public int compare(String a, String b) {
            int n = Math.min(a.length(), b.length());
            for (int i = 0; i < n; i++) {
                int aIndex = order.indexOf(a.charAt(i));
                int bIndex = order.indexOf(b.charAt(i));
                if (aIndex < bIndex) {
                    return -1;
                } else if (aIndex > bIndex) {
                    return 1;
                }
            }
            return a.length() - b.length();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Введите имена кандидатов (ctrl + D, чтобы закончить):");
        while (scanner.hasNextLine()) {
            names.add(scanner.nextLine().toUpperCase());
        }

        names.sort(CALIFORNIA_ORDER);

        System.out.println("Отсортированные имена: ");
        for (String name: names) {
            System.out.println(name);
        }

    }


}
