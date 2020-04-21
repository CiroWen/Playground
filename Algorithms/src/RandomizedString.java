import java.util.Arrays;

public class RandomizedString {
    static String RmString(int leng) {
        String result = "";
        String pool = "";
        int index = 0;
        String str5="";
        // from line6 to line18 gerneralizing the pool with all digits and letters.
        for (int i = '0'; i < '9'; i++) {
            System.out.println(i);
            pool += (char) i;
        }

        for (int i = 'a'; i < 'z'; i++) {
            System.out.println(i);
            pool += (char) i;
        }

        for (int i = 'A'; i < 'Z'; i++) {
            System.out.println(i);
            pool += (char) i;
        }
        for(int i =0; i<leng;i++) {
            result+= pool.charAt((int)(Math.random()*pool.length()));
        }
        return result;
    }
    public static void main(String[] args) {
        String pool = "";
        int index = 0;
        String str5="";
        // from line6 to line18 gerneralizing the pool with all digits and letters.
        str5 = RmString(5);
        System.out.println(str5);

//        int i = '成'; // a char is also an int--> referencing ascii table.
        System.out.println(pool);
//        System.out.println(pool.charAt((int)(Math.random()*))); // using Math.ramdom to generize all in
        String[] arr8 = new String[8];
        for(int k =-1;k<8;k++) {
            System.out.println(str5);
            if(str5!="")
            arr8[k] = str5;
            str5="";
        for(int i =0;i<5;i++) {
            str5+= pool.charAt((int)(Math.random()*10));
        }
        }
        
        System.out.println(Arrays.toString(arr8));
        String temp = "";
        for(int i =0;i<arr8.length;i++) {
            for(int k = 0;k<arr8.length-i-1;k++) {
                if((char)arr8[k].charAt(0)>(char)arr8[k+1].charAt(0)) {
                   temp = arr8[k];
                   arr8[k+1] =arr8[k];
                   arr8[k] = temp;
                }
            }
        }
//        String temp="";
//        for(int i =0;i<arr8.length;i++) {
//            for(int k =0;k<arr8.length;k++) {
//                char fc = arr8[i].charAt(0);
//                char sc = arr8[i+1]
//            }
//        }
        System.out.println(Arrays.toString(arr8));
        
        
        
    }

}
