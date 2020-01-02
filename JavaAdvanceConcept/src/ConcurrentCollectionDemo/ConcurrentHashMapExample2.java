package ConcurrentCollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample2 extends Thread{
	
	static ConcurrentHashMap m=new ConcurrentHashMap();
	//static HashMap m=new HashMap();
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Child thread updating thread");
		m.put(103, "C");
	}

	public static void main(String[] args) throws InterruptedException {
		
		m.put(101, "A");
		m.put(102, "B");
		ConcurrentHashMapExample2 t=new ConcurrentHashMapExample2();
		t.start();
		Set s=m.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Integer i1=(Integer) itr.next();
			System.out.println("Main thread iterating and current entry is :  " +i1  +   "-----------------"  + m.get(i1));
			Thread.sleep(3000);
		}
		System.out.println(m);
		
		
		
	
		

	}

}
