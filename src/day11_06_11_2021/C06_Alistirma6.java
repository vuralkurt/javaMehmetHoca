package day11_06_11_2021;

import java.util.Scanner;

public class C06_Alistirma6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir cumle giriniz:");

		String cumle = scan.nextLine();

		System.out.println("Lutfen varligini kontrol icin bir kelime giriniz");

		String kelime = scan.next();

		int index = cumle.indexOf(kelime);

		if (index < 0) {
			System.out.println("Girilen kelime yok");
		} else if (cumle.indexOf(kelime, index + 1) < 0) {
			System.out.println("Girilen kelime bir kez kullanilmis");
		} else {
			System.out.println("Girilen kelime 1'den cok kullanilmis");
		}
	
	
	}

}
