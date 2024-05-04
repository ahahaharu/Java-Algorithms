package org.example;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;

public class ListLengthRange {
    private int N;
    private List<Integer>[] table; // Хеш-таблица


    public ListLengthRange(int N) {
        this.N = N;
        this.table = new List[N / 100];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Метод для вставки ключей в хеш-таблицу
    public void insertKeys() {
        SecureRandom rand = new SecureRandom()
        for (int i = 0; i < N; i++) {
            int key = rand.nextInt();
            // Вычисление хеша для ключа
            int hash = (key & 0x7fffffff) % table.length;
            table[hash].add(key);
        }
    }

    public int getShortestListLength() {
        int minLen = Integer.MAX_VALUE;
        for (List<Integer> list : table) {
            minLen = Math.min(minLen, list.size());
        }
        return minLen;
    }

    public int getLongestListLength() {
        int maxLen = Integer.MIN_VALUE;
        for (List<Integer> list : table) {
            maxLen = Math.max(maxLen, list.size());
        }
        return maxLen;
    }
}
