package day15_13_11_2021;

import java.util.Scanner;

public class C06_Alistirma6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
        int sayi=(int) num;
		if (num<0) {
			System.out.println("Negatif sayi giremezsiniz");
			
		} else if(sayi!=num) {
			System.out.println("Lutfen tam sayi giriniz");
		}
		else if(sayi>100){
			System.out.println("lutfen 100 den kucuk giriniz");
		}

		else {
			for(int i=1;i<=num;i++) {
				if(i%3==0) {
					System.out.print(i+" ");
				}
			}
		}
		
		

		/*
		for (int i = 1; i < num; i++) {
			if (i % 3 == 0) {
				System.out.print(i+"  ");
			}
*/
		}

}
