import java.util.Scanner;
public class ReverseInputInt {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int result = 0;// result to store the reversed digits.
    while(input!=0) {
            int n = input%10; //stores the least significant bits.
            result = result*10+n;   //pushes the last stored least significant bit one bit forward then add the next least significant
            input = input/10; //remove the least significant bit since it's stored.
            
    }
    System.out.println(result);
    sc.close();
    
//    //Scanner sc = new Scanner(System.in);
//    int input = sc.nextInt();
//    char[] list = String.valueOf(input).toCharArray();
//    String result ="";
//    for(int i =list.length-1; i>=0;i--) {
//        result+=list[i];
//    }
//    return Integer.parseInt(result);
//    }
    
    }
}
