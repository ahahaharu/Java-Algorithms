import java.util.LinkedList;

public class MoveToFront {
    private final LinkedList<Character> list;

    public MoveToFront() {
        list = new LinkedList<>();
    }

    public void processCharacter(char ch) {
        list.removeFirstOccurrence(ch);
        list.addFirst(ch);
    }

    public void printList() {
        for (char ch : list) {
            System.out.print(ch + " ");
        }
    }
}
