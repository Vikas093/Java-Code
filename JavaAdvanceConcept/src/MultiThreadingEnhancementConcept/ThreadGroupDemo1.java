package MultiThreadingEnhancementConcept;

public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		
		///------------Every thread in java belong to some group
		///------------main thread belong to main group so output is main--------------
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		///------------Every thread group in java is child of system
		///-------------group whether directly or in directly---------------------------
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

	}

}
