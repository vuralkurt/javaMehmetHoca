package day15_13_11_2021;

import java.util.Scanner;

public class C11_Alistirma11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kucuk=0;
		int buyuk=0;
		
		if(sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
		}else {
			buyuk=sayi2;
			kucuk=sayi1;
		}
		
        int toplam=0;
        
        for(int i = kucuk;i<=buyuk;i++) {
        	toplam+=i;
        	
        }
        System.out.println("toplam:"+toplam);
	}

}
