package org.example;

import java.util.LinkedList;
import java.util.logging.Logger;

public class MoveToFront {
    private final LinkedList<Character> list;
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public MoveToFront() {
        list = new LinkedList<>();
    }

    public void processCharacter(char ch) {
        list.removeFirstOccurrence(ch);
        list.addFirst(ch);
    }

    public void printList() {
        for (char ch : list) {
            logger.info(ch + " ");
        }
    }
}
