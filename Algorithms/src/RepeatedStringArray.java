import java.util.Arrays;

public class RepeatedStringArray {
    static String[] foundArray = new String[100]; //an Array to store the duplicates
    static int pos;
    static int repeat;
    
    public static void main(String[]args) {
        String[] strArr = new String[100];
//        System.out.println(Math.randomString());
        
        //initializing the array filled with randomString
        for(int i =0; i<strArr.length;i++) {
            strArr[i] = randomString(2);
            
        }
        //print out the initialized array.
        for(int i = 0; i<strArr.length;i++) {
            System.out.print(strArr[i]+" ");
            if(i%10 ==9) //?
                System.out.println();
        }
        for(String s1 : strArr) {
            repeat =0;
            for(String s2 : strArr) {
                if(s1.equalsIgnoreCase(s2)) {
                    repeat++;
                    if(repeat==2) {// means there are duplicate in the strArr
                        addToTempArray(s1);
                    break;// we are not counting the duplicate data, so breaks here.
                    }
                }
            }
        }
        

            if(pos!=0) {
                System.out.println("The duplicate in randomString are: ");
                for(int i =0;i<pos;i++) {
                    System.out.print(foundArray[i]+" ");
                    
                }
        }
    }
    
    
    
    static void addToTempArray(String s) {
        for(int i =0; i < pos; i++) { // loop through the FoundArray to avoid duplicates.
            if(foundArray[i].equals(s))
                return;
        }
        foundArray[pos++] = s;
    }
    // generating random String.
    static String randomString(int leng) {
        String pool = "";
        int ranIndex = 0;
        String result = "";
        for(int i = '0'; i<='9'; i++) {
            pool+= (char)i;
        }
        for(int i = 'a'; i<='z'; i++) {
            pool+= (char)i;
        }
        for(int i = 'A'; i<='Z'; i++) {
            pool+= (char)i;
        }
        
        char[] pool2 = new char[leng];
        for(int i =0; i<leng;i++) {
            ranIndex = (int)(Math.random()*pool.length()); //math randon generizes from 0.000001~0.9999;
            pool2[i] = pool.charAt(ranIndex);//picking the generated index.
        }
        result = new String(pool2);
        return result;
    }
}
