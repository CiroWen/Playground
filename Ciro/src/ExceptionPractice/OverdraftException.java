package ExceptionPractice;

public class OverdraftException extends Exception{
     private double deficit;
     
     OverdraftException(String message, double deficit){
         super(message);
         this.deficit = deficit;
     }
     
     double getDeficit() {
         return this.deficit;
     }
}
