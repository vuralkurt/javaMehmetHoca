package day09_02_11_2021;

import java.util.Scanner;

public class C02_Alistirma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin     
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayi=scan.nextInt();
        
        System.out.println((sayi%2==0) ? "cift sayi" : "tek sayi");
        scan.close();
		
		
		
		
		
		
	}

}
