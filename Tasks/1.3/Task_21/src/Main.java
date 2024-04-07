import java.util.Scanner;

public class Main {
    public static void main() {
        Logger logger = Logger.getLogger(Main.class.getName());

        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        logger.info("Введите элементы списка (через пробел):");
        String[] strings = scanner.nextLine().split(" ");

        for (String string : strings) {
            Node node = new Node(string);
            if (list.head == null) {
                list.head = node;
            } else {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = node;
            }
        }

        logger.info("Введите key:");
        String key = scanner.nextLine();

        boolean isExist = list.find(key);
        if (isExist) {
            logger.info("'" + key + "' есть в списке");
        } else {
            logger.info("'" + key + "' нет в списке");
        }
    }
}