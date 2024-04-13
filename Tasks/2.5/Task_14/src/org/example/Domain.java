package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Domain implements Comparable<Domain> {
    private final String[] fields;
    private final int quantity;

    public Domain(String name) {
        fields = name.split("\\.");

        quantity = fields.length;
    }

    public String toString() {
        if (
                quantity == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder(fields[0]);
        for(int i = 1; i < quantity; i++) {
            result.insert(0, fields[i] + ".");
        }
        return result.toString();
    }

    @Override
    public int compareTo(Domain that) {
        int len = Math.min(this.quantity, that.quantity);
        for (int i = 0; i < len; i++) {
            String fieldThis = this.fields[this.quantity - i - 1];
            String fieldThat = that.fields[that.quantity - i - 1];
            int compare = fieldThis.compareTo(fieldThat);
            if (compare < 0) {
                return -1;
            } else if (compare > 0) {
                return 1;
            }
        }
        return this.quantity - that.quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Domain> domains = new ArrayList<>();

        System.out.println("Введите домены (нажмите ctrl+D, чтобы закончить):");
        while (scanner.hasNextLine()) {
            domains.add(new Domain(scanner.nextLine()));
        }

        Domain[] domainArray = domains.toArray(new Domain[0]);
        Arrays.sort(domainArray);

        for (Domain domain : domainArray) {
            System.out.println(domain);
        }
    }

}
