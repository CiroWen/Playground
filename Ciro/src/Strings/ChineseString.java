package Strings;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ChineseString {
    public static void main(String[]args) {
        try {
            byte[] i ="成".getBytes("UTF-8");
            //String.getBytes returns the corresponding unicode in UTF-8 form as an Array. 
            System.out.println(Arrays.toString(i));
            System.out.println(Integer.toHexString(i[0])); //shows in Hexadecimal.
            int k = i[0]&0x000000ff;  // removing all the ffffff(meaningless bits)
            System.out.println(Integer.toHexString(k));
            System.out.println(k);
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
        System.out.println("成".getBytes("UTF-8"));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

