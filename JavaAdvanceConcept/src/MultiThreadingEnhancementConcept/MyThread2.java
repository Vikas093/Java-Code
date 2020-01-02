package MultiThreadingEnhancementConcept;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	MyThread2(String name) {
		super(name);
	}

	public void run() {
		do
			{
			try
			{
			if (l.tryLock(5000,TimeUnit.MILLISECONDS)) {
			System.out.println(Thread.currentThread().getName() + "---got lock ");
			
			
				Thread.sleep(30000);
				l.unlock();
			System.out.println(Thread.currentThread().getName() + "----release lock");
			break;
			}
			else
			{
				System.out.println(Thread.currentThread().getName() + "----unable to get lock and will try again");
				
			}
			}
		catch(Exception e)
		{
			

		}
	}while(true);
}}
