package SerializableInhertiance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import SerializableIntroduction.Account;

public class SeiriazableDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

	
		Dog d1=new Dog();
		d1.i=999;
		d1.j=888;
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("deseriaziation started");
		//oos.writeObject(c1);
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println(d2.i  +   "------" +   d2.j);
	}
}
		
		
		
		
