package day13_08_11_2021;

import java.util.Scanner;

public class C03_Alistirma3 {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("gun giriniz");
		String gun=scan.next().toLowerCase();
		
		if(gun.equals("pazar")||gun.equals("cumartesi") ) {System.out.println("hafta sonudur");
		
	}else System.out.println("hafta icidir");

}
}