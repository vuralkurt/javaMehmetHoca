package day15_13_11_2021;

import java.util.Scanner;

public class C07_Alistirma7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {

			if (i % 15 == 0) {
				System.out.println("Java Guzeldir");
			} else if (i % 5 == 0) {
				System.out.print("Guzeldir" + " ");
			} else if (i % 3 == 0) {
				System.out.print("Java" + " ");
			} else {
				System.out.print(i + " ");
			}

		}
	}
}
