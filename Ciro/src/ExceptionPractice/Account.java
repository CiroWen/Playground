package ExceptionPractice;

public class Account {
    private double balance;
    
    Account(double balance){
        this.balance = balance;
    }
    double getBalance() {
        return this.balance;
    }
    
    void deposit(double amt) {
        this.balance += amt;
    }
    
    void withdraw (double amt) throws OverdraftException{
        if(this.balance < amt)
            throw new OverdraftException("not enough balance", amt - this.balance);
        this.balance -=amt;
    }
    
    public static void main(String[]args) {
        Account acc = new Account(5000);
//        acc.withdraw(5001);// since the method may throws an exception, so JVM indicates the programmer to handle the exception
        try {
            acc.withdraw(5001);
        }
        catch(OverdraftException e){
            System.out.println("you can't withdraw more than the balance");
            e.printStackTrace();
        }
    }
}
