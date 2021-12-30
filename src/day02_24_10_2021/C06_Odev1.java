package day02_24_10_2021;

import java.util.Scanner;

public class C06_Odev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner goko=new Scanner(System.in);
     
     System.out.println("birinci sayiyi giriniz");
     int sayi1=goko.nextInt();
     System.out.println("ikinci sayiyi giriniz");
     int sayi2=goko.nextInt();
     System.out.println(sayi1+sayi2);
     System.out.println(sayi1-sayi2);
     System.out.println(sayi1*sayi2);
     
     Scanner doko=new Scanner(System.in);
     System.out.println("Karenin kenar uzunlugunu giriniz");
     int kareKenar=doko.nextInt();
     
     System.out.println("cevre hesaplama:"+4*kareKenar);
     System.out.println("alan hesaplama:"+ kareKenar*kareKenar);
     
     
     Scanner roko=new Scanner(System.in);
     System.out.println("Uzunluk giriniz");
     int uzunluk=roko.nextInt();
     System.out.println("Yukseklik giriniz");
     int yukseklik=roko.nextInt();
     System.out.println("Derinlik giriniz");
     int derinlik=roko.nextInt();
     System.out.println("Hacim hesapla..:"+(uzunluk*yukseklik*derinlik));
     
     
     
     
        
     
     
     
     
	}

}
