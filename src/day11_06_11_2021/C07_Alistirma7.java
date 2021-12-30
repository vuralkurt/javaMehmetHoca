package day11_06_11_2021;

import java.util.Scanner;

public class C07_Alistirma7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir cumle giriniz");

		String cumle = scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");

		String kelime = scan.next();

		int ilkIndex = cumle.indexOf(kelime);
		int sonIndex = cumle.lastIndexOf(kelime);

		if (ilkIndex == (-1)) {
			System.out.println("Girilen kelime cumlede kullanilmamis.");
		} else if (ilkIndex == sonIndex) {
			System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
		} else {
			System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
		}
		scan.close();

	}
}