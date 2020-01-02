package EnumConcept;

public class EnumFullFledgeCall {

	public static void main(String[] args) {
		BeerDemo1[] b= BeerDemo1.values();
		for(BeerDemo1 b1:b)
		{
			System.out.println(b1 + "------------------" + b1.getPrice());
		}

	}

}
