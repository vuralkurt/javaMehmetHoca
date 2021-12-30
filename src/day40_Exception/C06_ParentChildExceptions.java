package day40_Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class C06_ParentChildExceptions {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("src\\day40\\yazi.txt");
			 int k=0;
			 while((k=fis.read())!=-1) {
			        System.out.print((char)k);
			 }
		} catch (IOException e) { // FileNotFoundException
			
			e.printStackTrace();
		} 

		System.out.println("");
		System.out.println("Gorev tamamlandi");
		
		
	}

}
