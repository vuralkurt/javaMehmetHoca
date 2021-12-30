package day03_25_10_2021;

public class C07_PreDecrementPostDecrement {
	public static void main(String[] args) {

		int sayi = 10;

		sayi--;

		System.out.println(sayi); // 9

		int a = sayi--;

		System.out.println(a); // 9
		System.out.println(sayi);// 8

		System.out.println(--a); //

	}
}