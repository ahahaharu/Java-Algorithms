import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        DistributiveCounting distCounting = new DistributiveCounting();
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки (Ctrl+D для окончания ввода):");

        while (scanner.hasNext()) {
            list.add(scanner.next());
        }

        String[] array = list.toArray(new String[0]);

        distCounting.keyIndexedCountWithQueue(array, 7);

        StringJoiner sortedArray = new StringJoiner(" ");
        for (String string : array) {
            sortedArray.add(string);
        }
        System.out.println("Отсортированный массив:");
        System.out.println(sortedArray);
    }
}

/*
Cтроки для теста:
4PGC938
2IYE230
3CIO720
1ICK750
1OHV845
4JZY524
1ICK750
3CIO720
1OHV845
2RLA629
2RLA629
3ATW723
 */