import java.util.HashMap;
import java.util.Map;

public class hashhmapp {
    public static void main(String[] args) {
        Map<Integer,String > hm = new HashMap<Integer,String >();
        hm.put(1,"Harsh");
        hm.put(2,"Anup");
        hm.put(3,"blank");
        hm.put(4,"Vaini");
        hm.put(5,"MOMPOP");
        System.out.println(hm);
        hm.put(1,"Atul");//Over-Rides the value at given key or Index
        System.out.println(hm);
        hm.putIfAbsent(1,"Harsh");//If want to prevent Over-riding of value use this
        System.out.println(hm);
        System.out.println(hm.get(1));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println("The Keys : ");
        for(var s : hm.keySet()){
            System.out.println(s); // Prints the key
        }
        System.out.println("The value : ");
        for(var s : hm.values()){
            System.out.println(s); // Prints the values
        }
        System.out.println("The Keys->value : ");
        for(var s : hm.entrySet()){
            System.out.println(s); // Prints the key
        }
        System.out.println("The size of Map is : "+hm.size());
        hm.remove(1);
        System.out.println(hm.entrySet());



     }
}
