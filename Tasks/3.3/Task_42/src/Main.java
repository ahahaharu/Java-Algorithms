import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, Integer> bst = new RedBlackBST<>();
        Random random = new Random();
        int[] N = {10000, 100000, 1000000};
        double[] percentages = new double[N.length];

        for (int i = 0; i < N.length; i++) {
            System.out.println("Идёт подсчёт для "+N[i]+"...");
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < N[i]; k++) {
                    bst.put(random.nextInt(), random.nextInt());
                }
                percentages[i] += bst.redNodesPercentage();
                bst = new RedBlackBST<>();
            }
            percentages[i] /= 100.0;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N = " + N[i] + ": " + percentages[i] + "% красных узлов");
        }
    }
}

/*
    N = 10000: 25.4347% красных узлов
    N = 100000: 25.396444327326268% красных узлов
    N = 1000000: 25.395441556092724% красных узлов
*/
