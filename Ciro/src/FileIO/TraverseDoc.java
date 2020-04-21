package FileIO;
import java.io.File;
public class TraverseDoc {
    // this program traverse a whole direcotry and find out which file is the biggest and smallest

    public static void main(String[]agrs) {
        long max = 0;
        long min = 10000;
        String minStr = "";
        String maxStr = ""; 
        
        File ff = new File("C:/WINDOWS");
        String [] allDoc = ff.list();
        File[] allDocF = ff.listFiles();
        for(int i = 0; i < allDoc.length; i++) {
            if(allDocF[i].length()== 0)
                continue;
            if(allDocF[i].isDirectory())
                continue;
            if(allDocF[i].length()>max) {
                max = allDocF[i].length();
                maxStr = allDocF[i].getName();
            }else if (allDocF[i].length()<min) {
                min = allDocF[i].length();
                minStr = allDocF[i].getName();
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(maxStr);
        System.out.println(minStr);
    }
}
