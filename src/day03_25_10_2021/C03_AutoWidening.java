package day03_25_10_2021;

public class C03_AutoWidening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte sayi1=66;
        
        short sayi2= sayi1;
        // esitligin sol tarafi short, sag tarafi byte 
        // iki data turu farkli oldugu halde java itiraz etmiyor
        // cunku atama yapilan variable'in data turu (short) 
        // atanan degerin veri turunden (byte) buyuk oldugundan sorun olusmaz
        
        
        System.out.println("sayi2 : " + sayi2);
        
        
        int sayi3= 555;
        
        double sayi4= sayi3;
        
        System.out.println("sayi4 : " + sayi4);
        
        // atanan degerin data turu, deger atanan variable'in data turunden kucukse
        // Java casting'i otomatuk yapar
        // bu isleme auto widening denir
        // 
	}

}
