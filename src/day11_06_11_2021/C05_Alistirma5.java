package day11_06_11_2021;

import java.util.Scanner;

public class C05_Alistirma5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bir cumle giriniz:");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen varligini kontrol icin bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk);
		
		if(index<0) 
		{System.out.println("yok");} 
		else
		{System.out.println("var");}
		
			
		
	}

}
