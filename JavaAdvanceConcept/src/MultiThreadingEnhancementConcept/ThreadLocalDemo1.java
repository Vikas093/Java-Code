package MultiThreadingEnhancementConcept;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		ThreadLocal l= new  ThreadLocal();
		System.out.println(l.get());
		l.set("vikas");
		System.out.println(l.get());
		l.remove();
		System.out.println(l.get());
	}

}
