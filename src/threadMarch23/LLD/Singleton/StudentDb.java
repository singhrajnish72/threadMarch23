package threadMarch23.LLD.Singleton;

public class StudentDb {
	
	private static StudentDb instance = null;
	private String url;
	private String username;
	private String password;
	
	private StudentDb() {
	       this.url = "mysql.db.driver.com";
	       this.username = "rajnish";
	       this.password = "1234";
	}
	
	/*
	 * Single design pattern - In multithreaded env below design pattern will break. Because there
	 * is a high chance that two threads can enter getInstance method concurrently
	 * and for them instance will be null. so they enter the if block same time and
	 * creates two objects
	 */
	public static StudentDb getInstance() {
		System.out.println("Inside get instance");
		if(instance == null) {
			instance = new StudentDb();
		}
		return instance;
	}
	
	/*
	 * Single design pattern - The prblm with this design is that in multithreaded env, each thread has to wait
	 * for lock. Once they get lock then only they can enter inside getInstance(). This will impact the performance.
	 * 
	 * This concurrency prblm arises only during initial phase when no object get created for StudentDb. Once the 
	 * object get created though there are multiple thread they won't go inside if block to create new instance. 
	 * 
	 * So for every thread using synchronized method is not correct. We have to use synchronized block only where crtical section exist.
	 * 
	 */
	public static synchronized StudentDb getInstance2() {
		System.out.println("Inside get instance2");
		if(instance == null) {
			instance = new StudentDb();
		}
		return instance;
	}
	
	/*
	 * Single design pattern - The prblm with this design is that in multithreaded env, if there are two or more thread 
	 * they can go inside the if block intially as instance will be null. No we have used synchronized block so
	 * only one thread will go inside the block but the problem is suppose first thread went inside the block
	 * and create. By the time first thread return the instance after coming out from block there might be chance 
	 * that second thread enters inside the synch block because for second thread instance value will still be null.
	 * thus in that case multiple object get created. That breaks the singleton principle.
	 * 
	 */
	public static StudentDb getInstance3() {
		System.out.println("Inside get instance3");
		
		if(instance == null) {
			synchronized (StudentDb.class) {
				instance = new StudentDb();
			}
		}
		return instance;
	}
	
	/*
	 * Double locking Singleton Design pattern - The above problem will get resolved because we have added 
	 * double checking. So suppose two threads enters if statement at same time. Then only one thread will get
	 * chance to enter the synch block. Now first creates the object and came out of the synch block. so when
	 * the second thread enter the block it will encounter the second check where instance != null as first thread
	 * was already created the object. Hence this is the one of best way to create singleton class.
	 */
	public static StudentDb getInstance4() {
		System.out.println("Inside get instance4");
		if(instance == null) {
			synchronized (StudentDb.class) {
				if(instance == null) {
					instance = new StudentDb();
				}	
			}
		}
		return instance;
	}
	
	
	/*
	 *There are still other ways through which we can break the singleton design pattern we have written above.
	 * 1. Serialization / Deserialisation 
	 * 2. Reflection Utils
	 * 
	 * Best way to achive singleton is throug enums.
	 */
}
