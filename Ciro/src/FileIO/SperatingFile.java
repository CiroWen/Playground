package FileIO;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SperatingFile {
    public static void main(String[]args) {
        int sliceSize = 1;  // the size that the user wants to split into.
        File srcFile = new File("C:/lol.txt"); //srcFile to be splited.
        try {
            splitFile(srcFile,sliceSize);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void splitFile(File srcF, int size) throws Exception {
        if(srcF.length()==0) {
            throw new Exception("source file can't be empty");
        }
        byte[] readInFile = new byte[(int)srcF.length()];
        // byte Array to read in the file from disk to JVM(Memory).
        FileInputStream fis = new FileInputStream(srcF);
        //use FileInputStream to connect with the File.
        fis.read(readInFile);
        //read in the file to the Array.
        fis.close();
        //closing the Stream after use.
        
        int fileNum;
        // to store how many file will be generailzed based on the read-in Array size.
        if(readInFile.length%size ==0) {
            //if the document size exactly devisible
            fileNum = (int) (readInFile.length/size);
            //the fileNum will be just the outcome of the devision.
        }else
            fileNum = (int) (readInFile.length/size) +1;
        // otherwise, there must will be another file to stroe the extra part.
        // thus, +1
        for(int i =0; i<fileNum; i++) {
            //loop through to generize the spliited files.
            String splitName = srcF.getName()+"Ver"+i+".txt";
            //making the name of the Splitedfiles            
            File splitFile = new File(srcF.getParent(), splitName);
            byte[] splitted ;
            if(i != fileNum -1) {
                splitted = Arrays.copyOfRange(readInFile, size*i, size*(i+1));
            }
            else {
                splitted = Arrays.copyOfRange(readInFile, size*i, readInFile.length);
            }
            try {
                FileOutputStream fos = new FileOutputStream(splitFile);
                fos.write(splitted);
                fos.close();
            }
            catch(Exception e) {
                System.out.println("gg");
            }
            
        }
    }
}
