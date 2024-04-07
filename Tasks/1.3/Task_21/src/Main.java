import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите элементы списка (через пробел):");
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

        System.out.println("Введите key:");
        String key = scanner.nextLine();

        boolean isExist = list.find(key);
        if (isExist) {
            System.out.println("'" + key + "' есть в списке");
        } else {
            System.out.println("'" + key + "' нет в списке");
        }
    }
}