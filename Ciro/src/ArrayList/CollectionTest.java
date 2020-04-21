package ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class CollectionTest {
    
    public static void main(String[]args) {
        List<Integer> a = new ArrayList<>();
        for(int i =0;i<10;i++) {
            a.add(i);
        }
        int equalCnt=0;
        System.out.println("before reverse");
        System.out.println(a);
        Collections.reverse(a);
        System.out.println("After Collections.reverse()");
        System.out.println(a);
        System.out.println("After Collections.shuffle()");
        Collections.shuffle(a);
        System.out.println(a);
        Collections.rotate(a, 1);
        System.out.println(a);
        for(int i  =0;i<1000000;i++) {
            List<Integer> b = new ArrayList<>();
            b.addAll(a);
            Collections.shuffle(a);
            if(a.equals(b)) {
                equalCnt++;
            }
        }System.out.println(equalCnt);
    }
}
