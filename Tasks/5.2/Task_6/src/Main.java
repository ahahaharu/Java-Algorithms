import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringSET set = new StringSET();
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean exit = false;

        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1 - Добавить строку");
            System.out.println("2 - Удалить строку");
            System.out.println("3 - Проверить наличие строки");
            System.out.println("4 - Проверить пустоту множества");
            System.out.println("5 - Узнать размер множества");
            System.out.println("6 - Вывести множество");
            System.out.println("7 - Выход");
            System.out.print("Выберите опцию: ");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Введите строку для добавления: ");
                    set.add(scanner.nextLine());
                    break;
                case "2":
                    System.out.print("Введите строку для удаления: ");
                    set.delete(scanner.nextLine());
                    break;
                case "3":
                    System.out.print("Введите строку для проверки: ");
                    System.out.println(set.contains(scanner.nextLine()) ? "Строка присутствует в множестве." : "Строки нет в множестве.");
                    break;
                case "4":
                    System.out.println(set.isEmpty() ? "Множество пусто." : "Множество не пусто.");
                    break;
                case "5":
                    System.out.println("Размер множества: " + set.size());
                    break;
                case "6":
                    System.out.println("Множество: " + set);
                    break;
                case "7":
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста, выберите опцию от 1 до 7.");
                    break;
            }
        }
        scanner.close();
    }
}
