package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class ConstructorInFileClass {

	public static void main(String[] args) throws IOException {
	
//		File f=new File("C:\\SeleniumContent","vikas.txt");
//		f.createNewFile();
//		System.out.println(f.exists());
		
		File f= new File("C:\\SeleniumContent","pankaj");
		f.mkdir();
		File f1= new File(f,"katrina.txt");
		f1.createNewFile();

	}

}
