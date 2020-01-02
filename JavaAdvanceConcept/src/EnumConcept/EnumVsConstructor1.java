package EnumConcept;

public class EnumVsConstructor1 {

	public static void main(String[] args) {
		//BeerDemo b=BeerDemo.KF;
	BeerDemo[] b=	BeerDemo.values();
	for(BeerDemo b1:b)
	{
		System.out.println(b1);
	}
	System.out.println("Hey constructor if you are cute then i am sexy");

	}

}
