package Thingy;

public class Clock {
    public static void main(String[]agrs) {
        int sec=00;
        int hr = 00;
        int min =00; 
        while(true) {
        try {
            Thread.sleep(1000); // set the time lap. maybe there's a way to calculate the program consuming time then include the 
        } catch (Exception e) { //calculation with it. which is to eliminate the bias.
            e.printStackTrace();
        }
        
        
            if(sec+1==60) {
                min++;
                sec=0;
                if(min+1==60) {
                    hr++;
                    min=0;
                }
            }else sec++;
            System.out.println("you have wasted "+hr+":"+""+min+":"+sec+" in your life");
        }
    }
    
    void setTime(String t) {
        //process the String, maybe convert it into the 1
    }
}
