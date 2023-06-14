package threadMarch23.threadJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumer {
  List<Integer> list = new ArrayList<>();
  public static int limit = 5;
  
  public void producer() throws InterruptedException {
    while(true) {
      synchronized (list) {
          if(list.size() == limit) {
             list.wait();
          }else {
            int x = new Random().nextInt();
            System.out.println("Producer produced:"+x);
            list.add(x);
            list.notify();
            Thread.sleep(1000);
          }
      }
    }
  }
  
  public void consumer() throws InterruptedException {
    while(true) {
      synchronized (list) {
          if(list.isEmpty()) {
             list.wait();
          }else {
            System.out.println("consumer consume:"+list.get(0));
            list.remove(0);
            list.notify();
            Thread.sleep(1000);
          }
      }
    }
  }
 
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ProducerConsumer obj = new ProducerConsumer();
    Thread t1 = new Thread(() -> {
       try {
        obj.producer();
      }
      catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });
     
    Thread t2 = new Thread(() -> {
      try {
        obj.consumer();
      }
      catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });
    
    t1.start();
    t2.start();
  }
}
