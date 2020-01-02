package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class MethodsInFileClass {
	static int count=0;

	public static void main(String[] args) throws IOException {
//		File f= new File("C:\\SeleniumContent");
//		String[] str=f.list();
//		for(String str1:str)
//		{
//			File f1=new File(f,str1);
//			if(f1.isDirectory())
//			{		
//			
//			count++;
//			System.out.println(str1);
//		}
//		}
//		System.out.println(count);
		
		File f= new File("vikas.txt");
		System.out.println(f.createNewFile());
		System.out.println(f.length());

	

	}
}
