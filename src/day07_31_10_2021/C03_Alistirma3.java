package day07_31_10_2021;

import java.util.Scanner;

public class C03_Alistirma3 {
	public static void main(String[] args) {
		
		
		// Soru 3) Kullaniciya yasini sorun, 
        //          eger yas 65�den kucuk ise �emekli olamazsin, calismalisin�, 
        //          65�e esit veya buyukse �Emekli olabilirsin� yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yas�n�z� g�r�n�z:");
        int yas=scan.nextInt();
        
        
        if (yas<65) {
            System.out.println("emekli olamazsin, calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
        
        scan.close();
		
	}

}
