package FileIO;
import java.io.*;
public class DataStream {
    public static void main(String[]args) {
        write();
        read();
    }
    
    public static void read() {
        File f = new File("C:/Users/cero9/Desktop/lol.txt");
        try(FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis)){
            
            boolean b = dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();
            System.out.println(b);
            System.out.println(i);
            System.out.println(str);
            
        }catch(Exception e) {
        }
    }
    
    public static void write() {
        File f = new File("C:/Users/cero9/Desktop/lol.txt");
        try(FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);)
        {   dos.writeBoolean(true);
            dos.writeInt(222);
            dos.writeUTF("你好");
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
