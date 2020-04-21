package Lambda;
  
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
  

// normal access to sort out the hero with filter();  
public class NormalAccess {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heroList = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heroList.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heroList);
        System.out.println("筛选出 hp>100 && damange<50的英雄");
        filter(heroList);
    }
  
    private static void filter(List<Hero> heros) {
        for (Hero a : heros) {
            if(a.hp>100 && a.damage<50)
                System.out.print(a);
        }
    }
  
}