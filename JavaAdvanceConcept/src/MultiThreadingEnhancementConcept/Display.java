package MultiThreadingEnhancementConcept;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	ReentrantLock l= new ReentrantLock();
	
	public  void wish(String name) throws InterruptedException
	{
		l.lock();
		for(int i=0;i<10;i++)
		{
			System.out.println("Good Morning");
			Thread.sleep(2000);
			System.out.print(name);
		}
		l.unlock();
		System.out.println(l.getHoldCount());
		
	}

}
