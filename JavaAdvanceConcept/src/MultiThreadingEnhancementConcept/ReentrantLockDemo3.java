package MultiThreadingEnhancementConcept;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo3 {

	public static void main(String[] args) {
		Display d= new Display();
		MyThread1 t1= new MyThread1("First thread");
		MyThread1 t2= new MyThread1("Second thread");
		t1.start();
		t2.start();
	}

}
