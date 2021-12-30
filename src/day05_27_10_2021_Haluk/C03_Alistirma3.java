package day05_27_10_2021_Haluk;

import java.util.Scanner;

public class C03_Alistirma3 {
	public static void main(String[] args) {
		
				@SuppressWarnings("resource")
				Scanner scan =new Scanner(System.in);
				
				System.out.print("1. sayiyi giriniz :");//kullaniciya 1. sayi  girmesinin bildirimini yazdýrdýk
				double sayi1=scan.nextInt();
				
		        System.out.print("2. sayiyi giriniz :");//kullaniciya 2. sayi  girmesinin bildirimini yazdýrdýk
				
				double sayi2=scan.nextInt();
				
				System.out.println("girilen sayilarin toplami :"+(sayi1+sayi2));
				System.out.println("girilen sayilarin farki :"+(sayi1-sayi2));
				System.out.println("girilen sayilarin carpimi :"+(sayi1*sayi2));
				System.out.println("girilen sayilarin bolumu :"+(sayi1/sayi2));		
		
		
		
		
	}

}
