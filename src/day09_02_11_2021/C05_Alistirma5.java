package day09_02_11_2021;

public class C05_Alistirma5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Eðer çalýþan kadýnsa 60 yaþýndan büyük olduðunda emekli olabilir,
        // Çalýþan erkekse 65 yaþýndan büyükse emekli olabilir.
        // her seferinde scanner olusturmak yerine 
        // test datalarimizi variable olarak da olusturabiliriz
        // ve kodn yazimi bittiginde bu test datalarini degistirerek 
        // kodlarimizi test edebiliriz
        
        char cinsiyet ='k';
        int yas=51;
        
        String sonuc = cinsiyet=='K' ?  (yas>=60 ? "Emekli olabilirsin":"Emekli olamazsin") :
                                        (yas>=65 ? "Emekli olabilirsin":"Emekli olamazsin") ;
        
        System.out.println(sonuc);
	}

}
