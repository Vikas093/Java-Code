package MultiThreadingEnhancementConcept;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterDemo {

	public static void main(String[] args) {
//		PrintJob[] jobs= {new PrintJob("Durga"),new PrintJob("Ravi"),
//				new PrintJob("Shiva"),
//				new PrintJob("Pavan"),
//				new PrintJob("Suresh"),
//				new PrintJob("Anil")};
//		
//		ExecutorService service=Executors.newFixedThreadPool(3);
//		for(PrintJob job:jobs)
//		{
//			service.submit(job);
//			
//		}
//		service.shutdown();
		PrintJob p1= new PrintJob("Durga");
		Thread t1= new Thread(p1);
		t1.start();
		PrintJob p2= new PrintJob("Ravi");
		Thread t2= new Thread(p2);
		t2.start();
		PrintJob p3= new PrintJob("Siva");
		Thread t3= new Thread(p3);
		t3.start();
		PrintJob p4= new PrintJob("Pavan");
		Thread t4= new Thread(p4);
		t4.start();
		PrintJob p5= new PrintJob("Suresh");
		Thread t5= new Thread(p5);
		t5.start();
		PrintJob p6= new PrintJob("Anil");
		Thread t6= new Thread(p6);
		t6.start();

	}

}
