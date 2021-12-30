package day16_14_11_2021;

import java.util.Scanner;

public class C05_Alistirma5 {
	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        
        int sayi =0;
        int toplam=0;
        int sayac=0;
        
        while (sayac<10 && toplam<500) {
            
            System.out.println("Toplanacak sayilari giriniz:");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        
            
        }
        System.out.println("sayilarin toplami: "+ toplam);
        
	
	}
}
