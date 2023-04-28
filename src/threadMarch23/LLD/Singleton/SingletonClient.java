package threadMarch23.LLD.Singleton;

public class SingletonClient implements Runnable {
	
	public static void main(String args[]) {
		
//		StudentDb obj = new StudentDb(); Can't create instance because constructor is private
		
		/* Without Concurrency we will get same value for obj1 and obj2 */
//		StudentDb obj1 = StudentDb.getInstance();
//		StudentDb obj2 = StudentDb.getInstance();
//		System.out.println("obj1:"+obj1);
//		System.out.println("obj2:"+obj2);
		
	    SingletonClient client = new SingletonClient();
	    Thread t1 = new Thread(client);
	    t1.start();
	    Thread t2 = new Thread(client);
	    t2.start(); 	  
	}

	@Override
	public void run() {
		StudentDb obj1 = StudentDb.getInstance4();
		System.out.println("obj1:"+obj1);
		StudentDb obj2 = StudentDb.getInstance4();
		System.out.println("obj2:"+obj2);	
	}
}
