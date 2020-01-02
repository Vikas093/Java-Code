package PrivateMethodInInterface;

public interface Right {
	default void m1() {
		System.out.println("Right interface mi method");
	}

}
