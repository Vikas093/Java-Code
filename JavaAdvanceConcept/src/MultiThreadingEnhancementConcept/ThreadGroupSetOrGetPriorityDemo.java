package MultiThreadingEnhancementConcept;

public class ThreadGroupSetOrGetPriorityDemo {

	public static void main(String[] args) {
		
		//---------------------- Thread group priority set as 3 will not effect
		//----------------------- the previous priority of thread----------------------
		//Thread.currentThread().setPriority(7);
		ThreadGroup g=new ThreadGroup("First Group");
		System.out.println(g.getMaxPriority());
		Thread t1= new Thread(g, "First Thread");
		Thread t2= new Thread(g, "Second Thread");
		g.setMaxPriority(3);
		Thread t3= new Thread(g, "Third Thread");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());		
		System.out.println(t3.getPriority());
		
		

	}

}
