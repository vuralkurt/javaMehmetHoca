package day09_02_11_2021;

public class C10_Alistirma10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru3 : verilen sayiyi inceleyin
        // Girilen sayi
        // 10  ise “Iki basamakli en kucuk sayi                   
        // 100 ise “uc basamakli en kucuk sayi”
        // 1000 ise “dort basamakli en kucuk sayi”
        // diger durumlarda “Girdigin sayiyi degistir” yazdirin
        
        int sayi=100;
        
        switch(sayi) {
        
        case 10 : 
            System.out.println("Iki basamakli en kucuk sayi");
            break;
        case 100 : 
            System.out.println("Uc basamakli en kucuk sayi");
            break;
        case 1000 : 
            System.out.println("Dort basamakli en kucuk sayi");
            break;
        default:
            System.out.println("Sayiyi degistirin");
        
        }

	}

}
