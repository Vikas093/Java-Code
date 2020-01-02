package InnerClass;

public class Methodlocalinnerclass {

	int x = 10;
	static int y = 2;

	public static void m1() {
		class inner {
			public void m2() {
				Methodlocalinnerclass m=new Methodlocalinnerclass();
				
				System.out.println(m.x);
				System.out.println(y);
			}
		}
		inner i = new inner();
		i.m2();
	}

	public static void main(String[] args) {
		Methodlocalinnerclass m=new Methodlocalinnerclass();
		m.m1();
		

}
}
