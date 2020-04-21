package FileIO;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class TestStream {
    //the in and out in File"In"put and File"Out"put means in as reading into JVM from disk.
    // out means reading to outside of JVM to disk.
    public static void main(String[]args) {
        File f = new File("C:/lol.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            byte[] ab = new byte[(int)f.length()]; //length matches the size of file.
            fis.read(ab); //convert and store the data to the ab Array from file f.
                          //to do this, FileInputStream is required.
            System.out.println(Arrays.toString(ab));// prints out the ascii code in the file.
            fis.close();
        } catch (Exception e) {                     //A->65 B->66
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        File f2 = new File("C:/lol1.txt"); // if the file doesn't exist, it will be created auto.
        try {                              // if the super dicretory doesn't exist.
                                           // we need if(!file.getParentFile().exists()) mkdirs();
            FileOutputStream fop = new FileOutputStream(f2);
            byte[] ab1 = {65,66};   //have the data in the array in ascii code.
            fop.write(ab1);       // write it into the outputStream.
            byte[] ab2 = new byte[(int)f2.length()];
            FileInputStream fip1 = new FileInputStream(f2);
            fip1.read(ab2);
            System.out.println(Arrays.toString(ab2));
            fop.close();
            fip1.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        //above shows the way to readin 
        File f3 = new File("C:/lolcharread.txt"); //non-case-sensitive
        try (FileReader fr = new FileReader(f3)){
            
            char[] readIn = new char[(int)f3.length()];
            fr.read(readIn);
            System.out.println(readIn);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        File f4 = new File("C:/lolcharwrite.txt");
        
        try(FileWriter fw1 = new FileWriter(f4)){
            String tbWrite = "hello你好";
            fw1.write(tbWrite);
            
            fw1.close();
            FileReader fr1 = new FileReader(f4);
            char[] readIn1 = new char[(int)f4.length()];
            fr1.read(readIn1);
            System.out.println(readIn1);
            fr1.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
