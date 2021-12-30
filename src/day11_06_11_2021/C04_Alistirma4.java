package day11_06_11_2021;

public class C04_Alistirma4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Neden bu hayat boyle bu";

		System.out.println(str1.indexOf("e"));
		System.out.println(str1.indexOf("o"));
		System.out.println(str1.indexOf("bu"));
		System.out.println(str1.indexOf('g'));
		System.out.println(str1.indexOf('?'));

		int index = str1.indexOf("d");
		System.out.println(index);

		int index2 = str1.indexOf("g");
		System.out.println(index2);

		System.out.println(str1.indexOf('e', 11));
		System.out.println(str1.indexOf("at b"));// Bu ifadenin baslangic indeksini verir

	
	}

}
