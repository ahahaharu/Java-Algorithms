package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        MoveToFront mtf = new MoveToFront();
        Scanner scanner = new Scanner(System.in);

        logger.info("Введите символы для списка (ctrl + D, чтобы закончить):");
        while (scanner.hasNext()) {
            char ch = scanner.next().charAt(0);
            mtf.processCharacter(ch);
        }
        logger.info("Список:");
        mtf.printList();
    }
}