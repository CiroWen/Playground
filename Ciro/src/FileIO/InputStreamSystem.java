package FileIO;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamSystem {
    public static void main(String[]args) {
        try(InputStream stream = System.in){
            while(true) {   // while while condition exists, line 10 will print out the 
                            //ascii of linebreak and enter
            int i =stream.read();
            System.out.println(i);
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
