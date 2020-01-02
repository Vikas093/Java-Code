package FileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClassInJava {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("abc8.txt");
		fw.write(100);
		fw.write("urga\nsoftwaresolutions");
		fw.write("\n");
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		
		

	}

}
