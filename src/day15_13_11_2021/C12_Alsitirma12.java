package day15_13_11_2021;

import java.util.Scanner;

public class C12_Alsitirma12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sayi1=scan.nextInt();
		
		int faktoriyel=1;
		for (int i = 1; i <=sayi1; i++) {
			faktoriyel*=i;
		}
		System.out.println("sonuc:"+faktoriyel);
			
			
		
		
		
	}

}
