package day03_25_10_2021;

import java.util.Scanner;

public class C01_Scanner_Ornek {
	
	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("birseyler girin");
		
		double yaricap=scan.nextDouble();
		double cevre=2*3.14*yaricap;
		double alan=3.14*yaricap*yaricap;
		
		System.out.println("cevre="+cevre);
		System.out.println("alan="+alan);
	}

}
