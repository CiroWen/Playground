package FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class ObjectStream {
    public static void main(String[]agrs) {
        Hero[] hero = new Hero[10];
        for(int i = 0; i<hero.length;i++) {
            hero[i] = new Hero("hero"+i);
        }
        File f = new File("C:/Users/cero9/Desktop/lol.wgc");
        
        try(FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            f.createNewFile();
            oos.writeObject(hero);
            System.out.println("all object in Hero Array");
            String b = "b";
            for(Hero h :hero) {
                System.out.println(h.name);
               
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
