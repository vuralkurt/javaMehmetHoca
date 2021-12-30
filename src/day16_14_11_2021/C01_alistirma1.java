package day16_14_11_2021;

import java.util.Scanner;

public class C01_alistirma1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		if (sayi1 > sayi2) {
			for (int i = sayi1; i >= sayi2; i -= 3) {
				System.out.println(i + " ");
			}
		} else if (sayi1 < sayi2) {
			for (int i = sayi1; i <= sayi2; i += 3) {
				System.out.println(i + " ");
			}
		} else
			System.out.println("sayilar esit degil");

		{

		}
	}

	
}
