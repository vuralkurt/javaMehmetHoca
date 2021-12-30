package day10_03_11_2021_Haluk;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
		String jobTitle=input.next();

		String qa="Qualty Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";

		if(jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz: " + qa);

		}else if (jobTitle.toLowerCase().equals("dev")) {
			System.out.println("Mesleginiz: " + dev);
		}else if (jobTitle.toLowerCase().equals("ba")) {
			System.out.println("Mesleginiz: " + ba);
		}else if (jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("Mesleginiz: " + pm);
		}else {
			System.out.println("Hatali secim yaptiniz");
		}

		input.close();

	}

}
