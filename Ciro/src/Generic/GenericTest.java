package Generic;
import League.*;

public class GenericTest<T> {
    
    public T write(T i) {
//        T k = i;
        System.out.println("2");
        return i;
    }
    public static void main(String[]args) {
//        System.out.println(write(5));
//        System.out.println(write("123"));
        Hero hh = new Hero();
//        System.out.println(write(hh));
        GenericTest<String> aa= new GenericTest<String>();
        
        
//        System.out.println(aa.write(12));   // if making the Write method generic, both line 19 and 20 will be executed.
        System.out.println(aa.write("12"));
        
    }
}
