package FileIO;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
public class FileIO {
    public static void main(String[] args) {
        
        File file = new File("C:/java/java1.txt"); // this is an absolute path
        System.out.println("file: "+ file.getAbsolutePath());
        
        File file2 = new File("java.txt"); // this is an relative path that is relative to current class and package.
        System.out.println(file2.getAbsolutePath());
        
        File file3 = new File(file,"java.txt"); //reference path. using first para for sub-directory.
        System.out.println(file3.getAbsolutePath());
        
//        File file4 = new File("D:/Programming/Java workplace/Ciro/src/FileIO/java.txt");
//        System.out.println("canWrite()" + file4.canWrite());
//        System.out.println("exists()" + file4.exists());
//        System.out.println("isFile()" + file4.isFile());
//        System.out.println("isDirectory()" + file4.isDirectory());
//        System.out.println("length()"+file4.length());
//        System.out.println("lastModified()"+file4.lastModified());
//        System.out.println("file4.renameTo(file)"+file4.renameTo(file)); // is not changing the name of file.
//        System.out.println("getName()"+file4.getName());
//        System.out.println(file4.getAbsolutePath());
//        Date d =new Date(file4.lastModified());
//        file4.list();//return every file under the directory. return nothing if the path is not an folder.
//        File file5 = new File("D:/Programming/Java workplace/Ciro/src/FileIO/");
//        File[] fs = file5.listFiles();
//        System.out.println(Arrays.toString(fs));
        
        File ff = new File("D:/Programming/Java workplace/hello");
        String[] str1 = ff.list(); // list() returns all folders under instance's directory
        System.out.println(ff.list());
        System.out.println(Arrays.toString(str1));
        File[] fileArr = ff.listFiles();
        System.out.println(Arrays.toString(fileArr));
        System.out.println(ff.getParent());
        System.out.println(ff.getParentFile());
        System.out.println(ff.delete());// delete the folder.which is hello, then returns true if it's deleted
        System.out.println(ff.listRoots());
        System.out.println(ff.mkdirs());
        ff.deleteOnExit();  // delete the file while 
        
        

    }

}
