package Strings;

public class EqualsAndEqualMark {
    static void swap(String a, String b) {
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String temp = a;
        a = b;
        b = temp;
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
    public static void main(String[]args) {
        String str1 = "The light";
        String str2 = new String(str1);
        String str3 = "The light";
        System.out.println(str2);
        System.out.println(str1.equals(str2)); 
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        
        Integer int1 = 5;
        int int2 = 5;
        Integer int3 = new Integer(int2);
        System.out.println("---------------");
        System.out.println(int1.equals(int2));
        System.out.println(int1 == int2);
        System.out.println(int1 == int3);
        System.out.println(int1.equals(int3));
        System.out.println(""+int1 + int2 +int3);
        System.out.println("---------------");
        swap(str1,str2);
    }
}
