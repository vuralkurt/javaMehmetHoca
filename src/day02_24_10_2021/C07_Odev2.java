package day02_24_10_2021;

import java.util.Scanner;

public class C07_Odev2 {

	public static void main(String[] args) {
		// Scanner isleminde String icin 2 method vardir
		// scan.next() dedigimizde sadece 1 kelime alir (ilk space'e kadar)
		// eger kullanicidan daha fazla kelime gelme ihtimali varsa
		// scan.nextLine() kullanmaliyiz

		// Kullanicidan isim ve soyismini ayri ayri isteyip
		// girilen ismi asagidaki gibi yazdiriniz

		// girilen isim : Mehmet Bulutluoz

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen isminizi giriniz...");

		String isim = scan.nextLine();

		System.out.println("Lutfen soyisminizi yaziniz...");

		String soyisim = scan.nextLine();

		System.out.println("girilen isim : " + isim + " " + soyisim);

		// kullanicidan deger almak icin 3 adim takip edilir
		// 1.adim Scanner objesi olusturmak

		Scanner scana = new Scanner(System.in);

		// ikinci adim kullaniciya ne istedigimizi soylemek

		System.out.println("lutfen isminizi yaziniz");

		String isimi = scana.next();
		System.out.println("isminiz..:" + isimi);

		// scan bir scanner objesidir
		// isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih
		// ederiz
		// scan bir obje oldugu icin data turu non-primitive'dir
		// primitive data turleri sadece deger icerirken,
		// non-primitive data turleri degerin yaninda method'lar barindirir
		// scan. dedigimizde kullanabilecegimiz bu method'lari gorebiliriz
		
		       
			}
		
	}

   


