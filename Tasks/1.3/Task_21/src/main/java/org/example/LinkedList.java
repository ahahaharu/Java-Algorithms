package org.example;

public class LinkedList {
    Node head;

    public boolean find(String key) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
