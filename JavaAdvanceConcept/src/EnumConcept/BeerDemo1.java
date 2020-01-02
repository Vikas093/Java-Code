package EnumConcept;

public enum BeerDemo1 {

	KF(70), KO(80), RC(90), FO;

	int price;

	BeerDemo1(int price) {
		this.price = price;
	}

	BeerDemo1() {
		this.price = 65;

	}
	
	public int getPrice()
	{
		return price;
	}
}
