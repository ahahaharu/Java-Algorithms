import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, Integer> bst = new RedBlackBST<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для добавления в дерево (или 'ctrl+D' для выхода):");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            try {
                int key = Integer.parseInt(input);
                bst.put(key, key);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                continue;
            }

        }

        System.out.println("is23: " + bst.is23());
        System.out.println("isBalanced: " + bst.isBalanced());
        System.out.println("isRedBlackBST: " + bst.isRedBlackBST());
    }
}
