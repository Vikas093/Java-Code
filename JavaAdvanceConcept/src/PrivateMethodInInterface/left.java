package PrivateMethodInInterface;

public interface left {
	
	default void m1() {
		System.out.println("Left interface mi method");
	}

}
