package FileIO;
import java.io.*;
import java.util.Arrays;

public class ClosingStream {
    public static void main(String[]agrs) {
        
        try {
            File f  = new File("D:/Programming/Java workplace/Ciro/src/FileIO/lol.txt");
//            f.createNewFile();
            FileInputStream fis = new FileInputStream(f);
            byte[] bb = new byte[(int)f.length()];
            fis.read(bb);
            System.out.println(Arrays.toString(bb));
            fis.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }}
        // the way to close Stream above 7 to 19 shows a bad example to close a stream.
        // if anypart before line 15 throws an exception, then close() will never be executed.
    //second way to close it in finally
    //third way to close it automatically by initializing the Stream in try(Stream)
    }

