import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);
        hs.add(1);
        hs.add(1);
        hs.remove(2);
        System.out.println(hs);
        System.out.println(hs.contains(2));
        hs.add(48);
        hs.add(155);
        hs.add(122);
        System.out.println(hs);


    }
}
