package day15_13_11_2021;

import java.util.Scanner;

public class C08_Alistirma8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		String isim=scan.next();
		
		for(int i = isim.length()-1;i>=0;i--) {
			
			System.out.print(isim.charAt(i));
			
		}
		
		
		

	}

}
