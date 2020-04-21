
public class NarcissisticNum {
    public static void main(String[] args) {
        int i =123;
        int op;//least significant position
        int tp;//ten position
        int hp;//hundred posisiton
//        for( i =100; i<=999; i++) {
//            op = i%10;
//            tp = i%100/10;
//            hp = i/100;
//            if(Math.pow(op,3)+Math.pow(tp, 3)+Math.pow(hp, 3) == i)
//                System.out.println(i);
//        }
        for( i =100; i<=999; i++) {
            op = i/100;
            tp = i/10%10;
            hp = i%100%10;
            if(Math.pow(op,3)+Math.pow(tp, 3)+Math.pow(hp, 3) == i)
                System.out.println(i);
        }
        System.out.println(i%10);
        System.out.println(i%100/10);
        System.out.println(i/100);
    }
}
