package org.example;

import java.util.HashSet;
import java.util.Set;

public class PerfectHashFunction {
    public int[] perfectHashFunction(int[] letterValues) {
        int[] values = new int[2];


        for (int m = letterValues.length; m <= 26; m++) {
            for (int a = 1; a < m; a++) {
                Set<Integer> hashes = new HashSet<>();

                for (int letterValue : letterValues) {
                    int hash = hashCodeFunction(a, letterValue, m);
                    hashes.add(hash);
                }

                if (hashes.size() == 10) { // Если все хеши уникальны
                    values[0] = a;
                    values[1] = m;
                    return values;
                }
            }
        }
        return new int[0]; // Если идеальная хеш-функция не найдена
    }

    private int hashCodeFunction(int a, int k, int m) {
        return (a * k) % m; // вычисление хеша
    }
}
