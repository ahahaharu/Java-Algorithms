package org.example;

public class Main {
    public static void main(String[] args) {
        int[] Ns = {1000, 10000, 100000, 1000000};
        for (int N : Ns) {
            ListLengthRange experiment = new ListLengthRange(N);
            experiment.insertKeys();

            int shortest = experiment.getShortestListLength();
            int longest = experiment.getLongestListLength();

            System.out.println("Для N = " + N + ": самый короткий список = " + shortest + ", самый длинный список = " + longest);
        }
    }
}