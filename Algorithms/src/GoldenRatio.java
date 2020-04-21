
public class GoldenRatio {
    // find the goldenRatio 0.618 between two numbers
    public static void main(String[] args) {
        double range = 20; // the range for two numbers
        double denorminator = 0;
        double numerator = 0;
        double minDiff = 20;
        double diff;
        for(double i = 1; i<=range; i++) {
            for(double k = 1; k<=range; k++) {
                if (i%2==0 && k%2==0)
                    continue;
                diff = i/k - 0.618;
                diff = diff<0? 0-diff  : diff;
               if (diff < minDiff) {
                   minDiff = diff;
                   denorminator = (int)i;
                   numerator = (int)k;
               }
            }
        }
        System.out.println(denorminator);
        System.out.println(numerator);
        System.out.println(denorminator / numerator);
        System.out.println(minDiff);
    }
}
