package day10_03_11_2021_Haluk;

import java.util.Scanner;

public class C05_Alistirma5 {

	public static void main(String[] args) {
	
    	Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen  sayi giriniz : ");
		int sayi=scan.nextInt();
		
		System.out.println("*****  ternary cozum ****");
		
		//String result=(sayi>=0)?((sayi<10)?("rakam"):("Pozitif Sayi")):("Negatif Sayi");
		System.out.println((sayi>=0)?((sayi<10)?("rakam"):("Pozitif Sayi")):("Negatif Sayi"));
		
		System.out.println("*****  if cozum ****");
		if (sayi>=0) {
			if (sayi<10) {
				System.out.println("rakam");
			}else {
				System.out.println("pozitif sayi");
			}
			
		}else {System.out.println("Negatif Sayi");
			
	}
	}
}
