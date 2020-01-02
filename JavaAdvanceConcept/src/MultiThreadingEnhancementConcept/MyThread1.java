package MultiThreadingEnhancementConcept;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread1 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	MyThread1(String name) {
	super(name);
	}

	public void run() {
		if (l.tryLock()) {
			l.lock();
			l.lock();
			System.out.println(Thread.currentThread().getName() + "---got lock and performing safe operation");
			System.out.println(l.getHoldCount());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			//l.unlock();
			
		} else {
			System.out.println(Thread.currentThread().getName() + "----unable to get lock and performing alternate operation");

		}
	}
}
