package MultiThreadingEnhancementConcept;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Display d= new Display();
		MyThread t1= new MyThread(d, "Dhoni");
		MyThread t2= new MyThread(d,"Kholi");
		t1.start();
		t2.start();
	}

}
