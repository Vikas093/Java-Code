package EnumConcept;

public class EnumVsSwitch {

	public static void main(String[] args) {
		BeerDemo b = BeerDemo.KF;
		switch (b) {
		case KF:
			System.out.println("It is children brand");
			break;

		case KO:
			System.out.println("It is to light brand");
			break;

		case RC:
			System.out.println("It is not that much kick");
			break;
		case FO:
			System.out.println("Buy one get one free");
			break;
		default:
			System.out.println("other brand are not recomended");
		}

	}

}
