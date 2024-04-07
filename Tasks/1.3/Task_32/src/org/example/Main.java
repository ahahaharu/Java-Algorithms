package org.example;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        StackQueue<Integer> stackQueue = new StackQueue<>();

        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);

        stackQueue.enqueue(4);

        logger.info(stackQueue.pop().toString());
        logger.info(stackQueue.pop().toString());
        logger.info(stackQueue.pop().toString());
        logger.info(stackQueue.pop().toString());
    }
}