package FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("abc09.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch= {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("s/w solutuons");
		bw.flush();
		bw.close();
		

	}

}
