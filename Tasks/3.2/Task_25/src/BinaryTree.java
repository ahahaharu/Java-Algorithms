import java.util.*;

public class BalancedBinaryTree {
    static Node root;

    public class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    String preOrder(Node node) {
        if (node == null) {
            return "";
        }
        return node.key + " " + preOrder(node.left) + preOrder(node.right);
    }

    public static void main(String[] args) {
        BalancedBinaryTree tree = new BalancedBinaryTree();
        Scanner scanner = new Scanner(System.in);

        List<Integer> keys = new ArrayList<>();
        System.out.println("Введите ключи (нажмите Ctrl+D, чтобы закончить):");
        while (scanner.hasNextInt()) {
            keys.add(scanner.nextInt());
        }

        int[] arr = keys.stream().mapToInt(i -> i).toArray(); // преобразование List в int[]

        Arrays.sort(arr);
        root = tree.sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.println(tree.preOrder(root));
    }
}
