package org.example;

import java.util.HashSet;

public class StringSET {
    private HashSet<String> set;

    public StringSET() {
        set = new HashSet<>();
    }

    public void add(String key) {
        set.add(key);
    }

    public void delete(String key) {
        set.remove(key);
    }

    public boolean contains(String key) {
        return set.contains(key);
    }

    public boolean containsPrefix(String prefix) {
        for (String s : set) {
            if (s.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public int size() {
        return set.size();
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
