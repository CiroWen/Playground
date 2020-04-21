package Threading;

import League.Hero;

public class ConcurrencySolve {
    public static void main(String[]args) {
        
        Hero Garen = new Hero();
        Garen.name = "Garen";
        Garen.hp = 10000;
        System.out.printf("The initial hp of Garen is %s%n",Garen.hp);
          
  // multiple threads are accessing Garen.hp by Garen.recover() Garen.hurt();
  // the code below shows the concurrency problems.
      int n = 10000;
      
      Thread[] cureTd = new Thread[n];
      Thread[] hurtTd = new Thread[n];
      for(int i = 0;i<n;i++) {
          Thread t = new Thread() {
              public void run() {
                  synchronized(Garen) {
                      Garen.recover();
                      System.out.println("Garen occupied");
                  }
                  try {Thread.sleep(50);
                          System.out.println("finished");
                  }catch(Exception e) {
                      e.printStackTrace();
                  }
              }
          };
          t.start();
          cureTd[i]=t;
      }
      
      for(int i = 0;i<n;i++) {
          Thread t = new Thread() {
              public void run() {
                  synchronized(Garen) {
                      System.out.println("hurt started ");
                      Garen.hurt();
                  }
                  try {
                      
                          System.out.println("hurt occupied");
                  }catch(Exception e) {
                      e.printStackTrace();
                  }
              }
          };
          t.start();
          System.out.println("hhhhhhhhhhhhhhhhhhhhhhh ");
          hurtTd[i]=t;
      }
      
      for(Thread td : cureTd) {
          try {
              td.join();
          }catch(Exception e) {
              e.printStackTrace();
          }
      }
      
      for(Thread td : hurtTd) {
          try {
              td.join();
          }catch(Exception e) {
              e.printStackTrace();
          }
      }
      
      System.out.printf("After %d times hurt Thread and %d times cure Thread, Garen has %d hp remaining",n,n,Garen.hp);
}
}

