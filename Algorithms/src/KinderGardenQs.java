
public class KinderGardenQs {
    public static void main(String[]args) {
        int a;
        int b;
        int c;
        int d;
        for(a = 0; a<100;a++) {
            for(b=0;b<100;b++) {
                for(c=0;c<100;c++) {
                    for(d=0;d<100;d++) {
                        if (a + b==8 && a+c ==14 && b +d ==10 && c -d == 6)
                            System.out.println(""+ a + "\n"+ b +"\n"+ c +"\n"+ d);
                    }
                }
            }
        }
    }
}
