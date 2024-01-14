import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> qe = new LinkedList<>();
        qe.add(10);
        qe.addLast(20);
        qe.addLast(30);
        qe.addLast(40);
        qe.addFirst(0);
        System.out.println(qe);
        qe.remove();
        System.out.println(qe);
        qe.removeFirst();
        System.out.println(qe);
        qe.removeLast();
        System.out.println(qe);
        System.out.println(qe.getFirst());
        System.out.println(qe.getLast());
        System.out.println(qe.peek());
        System.out.println("Size of Deque is "+qe.size());


    }
}
