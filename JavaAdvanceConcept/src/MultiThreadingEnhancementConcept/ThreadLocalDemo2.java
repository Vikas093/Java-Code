package MultiThreadingEnhancementConcept;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		
		// -------------To overdiide intial value method in thread local class by anoymous inner class---------------
		ThreadLocal l= new  ThreadLocal() {
			
			public Object initialValue()
			{
				return "abc";
			}
			
		};
		System.out.println(l.get());
		l.set("vikas");
		System.out.println(l.get());
		l.remove();
		System.out.println(l.get());
	}

}
