package Threading;
import League.*;
public class ThreadingTest {
    public static void main(String[]args) {
        //code from line6 to line19 is single thread demo;
        Hero Leesin = new Hero("leesin", 400,100);
        Hero Garen = new Hero("Garen", 500,50);
        Hero Vayne = new Hero("Vayne", 300,200);
        
//        while(!Leesin.isDead()) {
//            Garen.attack(Leesin);
//        }
//        
//        while(!Garen.isDead()) {
//            Vayne.attack(Garen);
//        }
//        
//        while(!Vayne.isDead()) {
//            Leesin.attack(Vayne);
//        }
        
        Thread t1 = new Thread() {    //hidden class approach
            public void run() {
                while(!Leesin.isDead())
                    Garen.attack(Leesin);
            }
        };
        
        
        Thread t2 = new Thread() {
            public void run() {
                while(!Garen.isDead()) {
                    Vayne.attack(Garen);
                }
            }
        };
        t1.start();
        
        t2.start();
        
        
    }
}
