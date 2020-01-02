package MultiThreadingEnhancementConcept;

public class ThreadGroupMethodDemo1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg=new ThreadGroup("parent group");
		ThreadGroup cg=new ThreadGroup(pg,"child group");
		ThreadGroupMethodDemo t1= new ThreadGroupMethodDemo(pg, "childthraed1");
		ThreadGroupMethodDemo t2= new ThreadGroupMethodDemo(pg, "childthraed2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();

	}

}
