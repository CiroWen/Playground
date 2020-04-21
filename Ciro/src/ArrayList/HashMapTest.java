package ArrayList;
import java.util.HashMap;
public class HashMapTest {
    
    public static void main(String[]args) {
        HashMap<Integer,String> a = new HashMap<>();
        // the same as  HashMap<Integer,String> a = new HashMap<>();
        a.put(99, "1");
        a.put(1,"2");
        System.out.println(a.get(1));
        
    }
}
