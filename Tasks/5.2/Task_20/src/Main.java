import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringSET set = new StringSET();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Введите строки для добавления в множество. Введите 'exit' для перехода к проверке префиксов.");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            set.add(input);
        }

        System.out.println("Введите префиксы для проверки. Введите 'exit' для выхода.");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(set.containsPrefix(input) ? "Префикс присутствует в множестве." : "Префикса нет в множестве.");
        }
        scanner.close();
    }
}
