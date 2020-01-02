package EnumConcept;

public class EnumValuesMethod {

	public static void main(String[] args) {
		BeerDemo[] b=BeerDemo.values();
		
		
		for(BeerDemo b1:b)
		{
			System.out.println(b1);
		}

	}

}
