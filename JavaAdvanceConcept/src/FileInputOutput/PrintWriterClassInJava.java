package FileInputOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClassInJava {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out=new PrintWriter("abc0987.txt");
		out.write(100);
		out.println(100);
		out.println(true);
		out.println("durga");
		out.flush();
		out.close();
		

	}

}
