package MultiThreadingEnhancementConcept;

public class MyThread extends Thread {
	
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
