import java.util.LinkedList;
import java.util.Queue;

public class inbuilt {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> qe = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.contains(2));
        System.out.println(q.equals(qe));
        int[] arr =new int[10];
        System.out.println();

    }

}
