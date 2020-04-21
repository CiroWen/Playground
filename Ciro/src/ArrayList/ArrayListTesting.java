package ArrayList;
import java.util.ArrayList;
import League.*;
public class ArrayListTesting {
    public static void main(String[]args) {
        ArrayList aa = new ArrayList();
        aa.add(11);
        aa.add("123");
        aa.add("asdasd");
        int[] Ai = {1,2,3,4,5};
        aa.toArray();
//        aa.remove(11); // the parameter 11 means the index of aa List.it will ofb here
        System.out.println(aa);
        System.out.println(aa.contains("123"));
        ArrayList heroList = new ArrayList();
        heroList.add(new Hero());
        System.out.println(heroList.get(0));
        
        Hero[] heroListA = (Hero[])heroList.toArray(new Hero[] {});
        System.out.println(heroListA[0]);
        
        aa.addAll(heroList);
        System.out.println(aa);
        
    }
    
}
