package MultiThreadingEnhancementConcept;

public class ThreadGroupDemoPart2 {

	public static void main(String[] args) {
		///----------------------------Create a thread group with the specfied name-------------------
		ThreadGroup g=new ThreadGroup("First Group");
		
		//----------------------------The parent of this thread group is parent of
		//----------------------------Currently executing thread---------------------
		System.out.println(g.getParent().getName());
		
		//---------------------------Create a thread group with name and its specfied parent----------
		ThreadGroup g1=new ThreadGroup(g,"Second Group");
		System.out.println(g1.getParent().getName());

	}

}
