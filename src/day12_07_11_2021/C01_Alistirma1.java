package day12_07_11_2021;

import java.util.Scanner;

public class C01_Alistirma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanicidan bir cumle ve bir kelime alin
        // verilen cumlenin verilen kelime(char squence) ile baslayip, baslamadigini
        // ve bitip bitmedigini yazdirin
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen Kelime giriniz");
        String kelime=scan.next();
        
        if (cumle.startsWith(kelime)) {
            System.out.println("girilen cumle " + kelime + " ile basliyor");
        } else {
            System.out.println("girilen cumle " + kelime + " ile baslamiyor");
        }
        
        
        if (cumle.endsWith(kelime)) {
            System.out.println("girilen cumle " + kelime + " ile bitiyor");
        } else {
            System.out.println("girilen cumle " + kelime + " ile bitmiyor");
        }
        scan.close();
	}

}
