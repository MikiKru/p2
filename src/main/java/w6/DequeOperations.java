package w6;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {
    public static void main(String[] args) {
        Deque<String> message = new ArrayDeque<>();
        message.addLast("m1");
        message.addLast("m2");
        message.addLast("m3");
        message.addLast("m4");
//        FIFO
//        System.out.println(message);
//        System.out.println(message.removeFirst());
//        System.out.println(message);
//        System.out.println(message.removeFirst());
//        System.out.println(message);
//        System.out.println(message.removeFirst());
//        System.out.println(message);
//        System.out.println(message.removeFirst());
//        FILO
        System.out.println(message);
        System.out.println(message.removeLast());
        System.out.println(message);
        System.out.println(message.removeLast());
        System.out.println(message);
        System.out.println(message.removeLast());
        System.out.println(message);
        System.out.println(message.removeLast());
        System.out.println(message.size());
    }
}
