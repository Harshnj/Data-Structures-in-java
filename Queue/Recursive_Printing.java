import java.util.LinkedList;
import java.util.Queue;

public class Recursive_Print {
    static void recursive(Queue q){
        if(q.size()==0) return;
        System.out.print(q.poll()+" ");
        recursive(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> qe = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        recursive(q);
        System.out.println();
        System.out.println(q.isEmpty());

    }
}
