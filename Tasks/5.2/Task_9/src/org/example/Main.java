package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExtendedOperationsForTST<Integer> tst = new ExtendedOperationsForTST<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество пар ключ-значение: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите пары ключ-значение.\n");
        for (int i = 1; i <= n; i++) {
            System.out.println("#"+i);
            System.out.println("Введите ключ:");
            String key = scanner.nextLine();
            System.out.println("Введите значение:");
            int value = scanner.nextInt();
            scanner.nextLine();
            tst.put(key, value);
        }

        System.out.println("Введите строку для поиска самого длинного префикса:");
        String query = scanner.nextLine();
        System.out.println("Самый длинный префикс '" + query + "': " + tst.longestPrefixOf(query));

        System.out.println("Введите префикс для поиска ключей:");
        String prefix = scanner.nextLine();
        System.out.println("Ключи с префиксом '" + prefix + "': " + tst.keysWithPrefix(prefix));

        System.out.println("Введите шаблон для поиска ключей:");
        String pattern = scanner.nextLine();
        System.out.println("Ключи, которые соответствуют шаблону '" + pattern + "': " + tst.keysThatMatch(pattern));

        scanner.close();
    }
}

/*
значения для теста
3

apple 1
banana 2
cherry 3

bananas -> banan
a -> apple
b.n.n. -> banana
 */