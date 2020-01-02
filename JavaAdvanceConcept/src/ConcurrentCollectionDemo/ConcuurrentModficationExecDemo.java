package ConcurrentCollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcuurrentModficationExecDemo extends Thread {

	static ArrayList l = new ArrayList();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child thread updating the list");
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("C");
		ConcuurrentModficationExecDemo t = new ConcuurrentModficationExecDemo();
		//t.setPriority(10);
		t.start();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println("Main thread iterating the list and current object is : " + s1);
			Thread.sleep(3000);
		}
		System.out.println(l);

	}

}
