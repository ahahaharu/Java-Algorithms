
import java.util.LinkedList;
import java.util.Queue;

public class DistributiveCounting {
    public void keyIndexedCountWithQueue(String[] array, int stringsLength) {
        int alphabetSize = 256; // размер алфавита для таблицы ascii

        Queue<String> count[] = new LinkedList[alphabetSize + 1];

        for (int r = 0; r < count.length; r++) {
            count[r] = new LinkedList<>();
        }

        for (int digit = stringsLength - 1; digit >= 0; digit--) {
            // вычисление частоты символов
            for (int i = 0; i < array.length; i++) {
                int digitIndex = array[i].charAt(digit);
                count[digitIndex].add(array[i]);
            }

            int indexArray = 0;
            for (int r = 0; r < count.length; r++) {
                while (!count[r].isEmpty()) {
                    String string = count[r].poll();
                    array[indexArray++] = string;
                }
            }
        }
    }
}
