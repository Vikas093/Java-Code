package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClassInJava {

	public static void main(String[] args) throws IOException {

		// --------------------To read single character----------------------------
//		FileReader fr = new FileReader("abc8.txt");
//		int i = fr.read();
//		while(i!=-1)
//		{
//			System.out.print((char)i);
//			i=fr.read();
//			
//		}

		// -------------------To raed array of char---------------------------------
		File f = new File("abc8.txt");
		char[] ch= new char[(int) f.length()];
		FileReader fr= new FileReader(f);
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		

	}

}
