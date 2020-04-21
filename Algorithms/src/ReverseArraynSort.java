import java.util.Arrays;
public class ReverseArraynSort {
    public void reverse() {
        int [] a = {1,2,3,4,5};
        int temp = 0;
        for(int i = 0; i< a.length/2;i++) {
            temp = a[a.length-i-1];
            a[a.length-i-1] = a[i];
            a[i] = temp;
        }
    }
    
    public void selection() {
        int[] a = {5,4,3,2,1};
        int temp = 0;
//        for(int i =1; i<a.length;i++) {   //helps to understand how selection sort work
//            if(a[0] >a[i])            // first loop compares the first digit with all digits in the 
//                temp = a[0];          // and swaps if the first digit if bigger than the compared digits.
//                a[0] = a[i];          // this makes the 5 goes to the end of the array.
//                a[i] = temp;
//        }
//        for(int i = 1; i<a.length;i++) {
//            if(a[1] > a[i])           //same as above. but here compares the second digit in the array.
//                temp = a[1];
//                a[1] = a[i];
//                a[i] = temp;
//        }
        for(int i =1; i<a.length;i++) {
            for(int k = 0; k<a.length;k++) {    // based on what we have above, we can make an nested loop 
                if(a[k] > a[i]) {
                    temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
    public void insert() {
        int [] a = {5,4,3,2,1};
        int temp;
//        for(int i =0;i<a.length-1;i++) { //cuz the i+1 is used, so the upperbound of loop has to be a.length -1 instead of a.length
//            if(a[i] > a[i + 1]) {        //this single for loop here loop through all the digits in Array a then  
//                temp = a[i+1];
//                a[i+1] = a[i];
//                a[i] = temp;
//            }
//        }
//        for(int i =0;i<a.length-2;i++) { // the second loop here pushes the second biggest digit in the Array to the end 
//            if(a[i] > a[i + 1]) {        // though we don't need to recompare the last index. so the upperbound is length-2
//                temp = a[i+1];
//                a[i+1] = a[i];
//                a[i] = temp;
//            }
//        }
        for(int k=0; k<a.length-1;k++) {
            for(int i =0; i< a.length-1;i++) {
                if(a[i] > a[i + 1]) {        // though we don't need to recompare the last index. so the upperbound is length-2
                    temp = a[i + 1];         //based on what we have above, we can also make an nested loop for this Algorithm.
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[]args) {
        System.out.println("111");
        ReverseArraynSort a = new ReverseArraynSort();
        a.selection();
        a.insert();
        
        
    }
}
