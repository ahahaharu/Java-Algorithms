package org.example;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        LinkedList<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        logger.info("Введите k:");
        int k = scanner.nextInt();

        logger.info("Введите элементы очереди (ctrl + D, чтобы закончить):");
        while (scanner.hasNextLine()) {
            queue.add(scanner.nextLine());
            if (queue.size() > k) {
                queue.removeFirst();
            }
        }

        if (queue.size() < k) {
            logger.info("Количество строк меньше, чем k");
        } else {
            logger.info("Элемент с порядковым номером " + k + " в списке с конца: " + queue.peekFirst());
        }
    }
}