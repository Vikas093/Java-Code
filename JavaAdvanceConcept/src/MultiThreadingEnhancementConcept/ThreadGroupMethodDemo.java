package MultiThreadingEnhancementConcept;

public class ThreadGroupMethodDemo extends Thread {
	
	public ThreadGroupMethodDemo(ThreadGroup g,String name) {
		super(g,name);
		
	}
	
	public void run()
	{
		System.out.println("Child thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	

}
