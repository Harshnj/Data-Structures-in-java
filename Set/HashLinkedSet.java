import java.util.*;
//Order Of Insertion is Preserved
public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
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
