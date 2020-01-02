package InnerClass;

public class FinalConceptInMethodLocalInnerClass {
	
	public void m1()
	{
		final int x=10;
		class inner
		{
			public void m2() {
				System.out.println(x);
			}
		}
		inner i= new inner();
		i.m2();
		
	}

	public static void main(String[] args) {
		FinalConceptInMethodLocalInnerClass f= new FinalConceptInMethodLocalInnerClass();
		f.m1();
		
	}

}
