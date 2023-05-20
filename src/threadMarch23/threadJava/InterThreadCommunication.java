package threadMarch23.threadJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Producer extends Thread{
	List<Integer> list;
	public Producer(List<Integer> list) {
		this.list = list;
	}	
	private void produce(List<Integer> list) throws InterruptedException {
		while (true) {
			synchronized (list) {
				if (list.size() < 5) {
					Random random = new Random();
					int value = random.nextInt();
					list.add(value);
					System.out.println("Producer produced :: " + value);
					list.notify();
					Thread.sleep(1000);
				} else {
					list.wait();
				}
			}
		}
	}

	@Override
	public void run() {
		try {
		   produce(list);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	 }	 
}


class Consumer extends Thread{
	List<Integer> list;
	public Consumer(List<Integer> list) {
		this.list = list;
	}
	
	private void consume(List<Integer> list2) throws InterruptedException{ 
		while(true) {
			synchronized (list2) {
				if(list2.size() == 5) {
					 int value = list2.remove(0); 
					 System.out.println("Consumer consume :: "+value);
					 list2.notify();
				     Thread.sleep(1000);
				 }else {
				     list2.wait();
				 }
			}
		}
	}
	
	@Override
	public void run() {
		try {
			consume(list);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}


public class InterThreadCommunication {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Producer producer = new Producer(list);
		Consumer consumer = new Consumer(list);
		producer.start();
		consumer.start();
	}
}
