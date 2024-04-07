package org.example;

public class StackQueue<T> {
    private Node<T> first;
    private Node<T> last;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T item) {
        Node<T> tempLast = last;
        last = new Node<>(item);
        if (isEmpty()) {
            first = last;
        } else {
            tempLast.next = last;
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public void enqueue(T item) {
        push(item);
    }
}
