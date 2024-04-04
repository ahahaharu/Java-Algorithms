
public class Main {
    public static void main(String[] args) {
        StackQueue<Integer> stackQueue = new StackQueue<>();

        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);

        stackQueue.enqueue(4);

        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
    }
}