package Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
   

   
public class HiddenClassAccess {
    //hidden interface approach to sort out.
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");
        HeroCk checker = new HeroCk() {
            @Override
            public boolean test(Hero h) {
                return (h.hp>100 && h.damage<50);
            }
        };
           
        filter(heros,checker);
    }
   
    private static void filter(List<Hero> heros,HeroCk checker) {
        //throw in the interface refference in order to use the method(line19) inside the interface
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
   
}
