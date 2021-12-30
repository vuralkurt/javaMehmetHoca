package day09_02_11_2021;

public class C06_Alistirma6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru2 : verilen karakteri inceleyin,
        // kucuk harf ise consola “Kucuk Harf” , 
        // buyuk harfse consola “Buyuk Harf” 
        // yoksa “girdiginiz karakter harf degil” yazdirin.
        
        char krk='&';
        
         // String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (//sart yanlis ise sonuc);
        String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (
                
                        (krk>='A'&& krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil"
                            
                            );
        
        System.out.println(sonuc);

		
		
	}

}
