package threadMarch23.threadJava;

public class PrintNNumbers {
  
  private static int N = 10;
  private int count = 0;
  public void PrintEvenNumbers() throws InterruptedException {
    synchronized (this) {  
        while(count <= N) {
           if(count % 2 == 0) {
             System.out.println("Print even number:"+count);
             count++;
             notify();
             Thread.sleep(5000);
           }else {
             wait();
           }
        }
    }
    
  }
  
  public void PrintOddNumbers() throws InterruptedException {
    synchronized (this) {
        while(count <= N) {  
           if(count % 2 != 0) {
             System.out.println("Print odd number:"+count);
             count++;
             notify();
             Thread.sleep(5000);
           }else {
             wait();
           }
        }
    }
    
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    PrintNNumbers nNumbers = new PrintNNumbers();
    Thread t1 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        
        try {
          nNumbers.PrintEvenNumbers();
        }
        catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    });
    
    Thread t2 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        try {
          nNumbers.PrintOddNumbers();
        }
        catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }        
      }
    });
    
    t1.start();
    t2.start();
  }
}
