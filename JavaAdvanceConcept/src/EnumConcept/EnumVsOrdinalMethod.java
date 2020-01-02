package EnumConcept;

public class EnumVsOrdinalMethod {

	public static void main(String[] args) {
BeerDemo[] b=BeerDemo.values();
		
		
		for(BeerDemo b1:b)
		{
			System.out.println(b1 + "------------------" +b1.ordinal());
		}

	}

}
