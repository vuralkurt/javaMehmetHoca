package day07_31_10_2021;

import java.util.Scanner;

public class C01_AListirma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
        //         ve dikdortgenin kare olup olmadigini yazdirin
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen dikdorgenin bir kenar uzunlugunu girin");
        
        double kenar1=scan.nextDouble();
        
        System.out.println("Lutfen dikdorgenin diger kenar uzunlugunu girin");
        
        double kenar2=scan.nextDouble();
        
        if (kenar1==kenar2) {
            System.out.println("girilen olculer karedir");
        } else {
            System.out.println("girilen olculer kare degildir");
        }
	}

}
