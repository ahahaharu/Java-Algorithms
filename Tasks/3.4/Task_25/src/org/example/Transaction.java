package org.example;

import java.util.Date;

public class Transaction {
    private final String who;
    private final Date when;
    private final double amount;
    private int hash;

    Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;

        hash = -1;
    }

    public int hashCode() {
        int hash;

        if (this.hash != -1) {
            hash = this.hash;
            System.out.println("Хеш найден в кэше");
        } else {
            hash = 17;
            hash = 31 * hash + who.hashCode();
            hash = 31 * hash + when.hashCode();
            hash = 31 * hash + ((Double) amount).hashCode();

            System.out.println("Хеш не найден в кэше");

            this.hash = hash;
        }

        return hash;
    }
}
