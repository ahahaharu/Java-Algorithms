import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите k:");
        int k = scanner.nextInt();

        System.out.println("Введите элементы очереди:");
        while (scanner.hasNextLine()) {
            queue.add(scanner.nextLine());
            if (queue.size() > k) {
                queue.removeFirst();
            }
        }

        if (queue.size() < k) {
            System.out.println("Количество строк меньше, чем k");
        } else {
            System.out.println(queue.peekFirst());
        }
    }
}