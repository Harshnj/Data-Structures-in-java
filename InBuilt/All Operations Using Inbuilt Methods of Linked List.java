import java.util.LinkedList;
public class inbuilt {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        System.out.println(l1);
        l1.add(1,15);
        System.out.println(l1);
        System.out.println("The Size of Linked List is "+l1.size());
        l1.addFirst(0);//Add element At first index
        l1.addLast(25);//Add element At Last index
        System.out.println(l1);
        System.out.println( l1.contains(25));//Checks weather the List contains that element 
        String str=l1.toString();
        System.out.println(str);
        LinkedList<Integer> l2 = (LinkedList<Integer>) l1.clone();
        System.out.println(l2);
        System.out.println(l1.get(2));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.indexOf(20));
        System.out.println(l1.peekLast());
        System.out.println(l1.peekFirst());
        l1.remove();
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.clear();
        System.out.println(l1);
    }



}
