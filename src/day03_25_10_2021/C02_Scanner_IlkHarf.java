package day03_25_10_2021;

import java.util.Scanner;

public class C02_Scanner_IlkHarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      
      System.out.println("Lutfen isminizi yaziniz");
      
      char ilkHarf=scan.nextLine().charAt(6);
      
      // isminizin ilk harfi : M
      System.out.println("isminizin ilk harfi :" + ilkHarf); 
	}

}
