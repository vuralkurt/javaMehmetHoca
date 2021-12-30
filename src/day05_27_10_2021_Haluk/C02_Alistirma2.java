package day05_27_10_2021_Haluk;

import java.util.Scanner;

public class C02_Alistirma2 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("adinizi giriniz");
		String name=scan.nextLine();
		System.out.println("soyadinizi giriniz");
		String surname=scan.nextLine();
		System.out.println("yasinizi giriniz");
		int age= scan.nextInt();
		System.out.println("boyunuzu giriniz");
		int tall=scan.nextInt();
		System.out.println("kilonuzu giriniz");
		int poid=scan.nextInt();
		
		System.out.println("BENIM ADIM :" +name+"\n"+"SOYADIM :"+surname+"\n"+"yasim:"+age+"\n"+"boyum:"+tall+"cm"+"\n"+"kilom:"+poid+"kg");
	}
}