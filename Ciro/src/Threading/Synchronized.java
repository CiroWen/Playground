package Threading;
import League.*;
public class Synchronized {
    public static void main(String[]args) {
        
        Hero Garen = new Hero("garen",500,100);
        Thread t1 = new Thread() {
            int i =0;
            public void run() {
                while(i++<20000) {
                    Garen.hurt();
                    System.out.println(Garen.hp);
                    try {
                        Thread.sleep(1);
                        System.out.println("t1 running");
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
                
            }
            
        };
        Thread t2 = new Thread() {
            int i =0;
            public void run() {
                while(i++<20000) {
                    Garen.recover();
                    System.out.println(Garen.hp);
                    try {Thread.sleep(1);
                        System.out.println("T2 running");
                    }catch(Exception e) {
                        e.printStackTrace();
                    }    
                }
                
            }
        };

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(Garen.hp);
        System.out.println(Garen.hp);
        System.out.println(Garen.hp);
    }
}
