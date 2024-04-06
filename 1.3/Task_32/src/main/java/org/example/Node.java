package org.example;

public class Node<T> {
    T item;
    Node<T> next;

    Node(T item) {
        this.item = item;
    }
}
