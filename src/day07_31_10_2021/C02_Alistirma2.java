package day07_31_10_2021;

import java.util.Scanner;

public class C02_Alistirma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru 2) Kullanicidan bir karakter girmesini isteyin ve 
        //         girilen karakterin harf olup olmadigini yazdirin
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz");
        
        char karakter=scan.next().charAt(0);
        
        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
            
            System.out.println("girdiginiz :" + karakter + " bir harftir");
        } else {
            System.out.println("girdiginiz :" + karakter + " bir harf degildir");
        }

		
	}

}