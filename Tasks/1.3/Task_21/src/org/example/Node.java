package org.example;

public class Node<S> {
    String value;
    Node<S> next;

    Node(String value) {
        this.value = value;
    }
}
