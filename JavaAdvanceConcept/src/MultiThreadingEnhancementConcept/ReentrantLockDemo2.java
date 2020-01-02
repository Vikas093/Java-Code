package MultiThreadingEnhancementConcept;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 {

	public static void main(String[] args) {
		Display d= new Display();
		MyThread2 t1= new MyThread2("First thread");
		MyThread2 t2= new MyThread2("Second thread");
		t1.start();
		t2.start();
	}

}
