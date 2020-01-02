package SerializableIntroduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Dog d1 = new Dog();
		//Cat c1 = new Cat();
		Account a1=new Account();
		System.out.println(a1.username+ "-------"  +   a1.pwd  +   "-----" + a1.pin);
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		//oos.writeObject(c1);
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a2=(Account) ois.readObject();
		System.out.println(a2.username+ "-------"  +   a2.pwd   +   "-----" +   a2.pin);
		
		
//		if(o instanceof Dog)
//		{
//			Dog d2=(Dog) o;
//			System.out.println(d2.j);
//			
//		}
//		else if(o instanceof Cat) 
//		{
//			Cat c2=(Cat)o;
//			System.out.println(c2.j);
//		}
//		
		
	}

}
