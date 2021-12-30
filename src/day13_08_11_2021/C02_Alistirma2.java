package day13_08_11_2021;

import java.util.Scanner;

public class C02_Alistirma2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1.sayi");
		int sayi1 = scan.nextInt();
		System.out.println("2.sayi");
		int sayi2 = scan.nextInt();
		System.out.println("secim yapiniz");
		int secim = scan.nextInt();

		if (secim == 2) {
			kare(sayi1, sayi2);
			;

		} else if (secim == 3) {
			kup(sayi1, sayi2);

		} else if (secim == 4) {
			dortussu(sayi1, sayi2);

		}

		else {
			System.out.println("degeri dogru giriniz");

		}
	}

	private static void dortussu(int sayi1, int sayi2) {

		System.out.println(Math.pow(sayi1, 4) + Math.pow(sayi2, 4));
	}

	private static void kup(int sayi1, int sayi2) {

		System.out.println(Math.pow(sayi1, 3) + Math.pow(sayi2, 3));
	}

	private static void kare(int sayi1, int sayi2) {

		System.out.println(Math.pow(sayi1, 2) + Math.pow(sayi2, 2));
	}

}
