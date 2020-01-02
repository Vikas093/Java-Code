package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class FileIntroductionTwist {

	public static void main(String[] args) throws IOException {
		
		////--------------------------For creating new Physical file------------------------------------///
//		File f =new File("abc67.txt");
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists());
//		
		////-------------------------For creating new phycicall directory----------------------------------///
		File f =new File("abc69");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());

	}

}
