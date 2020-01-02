package SerializableInhertiance;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	
	int j=20;
	
	Dog()
	{
		System.out.println("Dog constutior called");
	}

}
