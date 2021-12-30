package day12_07_11_2021;

public class C02_Alistirma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String olarak verilen 10.000 sayisinin
        // binden buyuk olup olmadigini yazdirin
        
        String sonuc="10.000";
        
        sonuc=sonuc.replace(".", "");   // 10000 'e cevirip sonuc'a assign ettik
                                        // = oldugu icin sonuc kalici olarak degisti
        
        
        
        if (Integer.valueOf(sonuc)>1000) {
            System.out.println("bulunan sonuc sayisi 1000'den cok");
        } else {
            System.out.println("bulunan sonuc sayisi 1000'den az");
        }

	}

}
