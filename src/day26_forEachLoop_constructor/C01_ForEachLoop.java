package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C01_ForEachLoop {

	public static void main(String[] args) {
		
		/*
		
		// kullanýcýdan alýnan bir  String'deki herbir  karakterin adedini bir array içinde yazdýran bir java programý yazýn.
        // String  "Javacilar cook afilli" ise cevap þöyle olmalýdýr:
        // { =2, a=4, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
      
        
        String cumle="Javacilar cook afilli";
        
        String alfabe ="";   
        String bos="";
        int sayac =0;
        
        for (char i = 32; i < 126; i++) {
            
            alfabe+=i;  // !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
            
        }
        
        for (int i = 0; i < alfabe.length(); i++) { // !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
        
            for (int j = 0; j < cumle.length(); j++) { // Javacilar cook afilli
                
                if (alfabe.charAt(i)==cumle.charAt(j)) {
                    sayac++;
                }
                
            }
            if (sayac>0 ) {
                bos+=alfabe.charAt(i)+"="+sayac+"~";
                sayac=0;
            }
        }
        
        
        
        String arr1 [] = bos.split("~");
        
        
        System.out.println(Arrays.toString(arr1));
        
        */
		
		// iki String array olusturunuz 
				// ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. 
				// Sonucu ekrana yazdiriniz.
				// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
				
				String arr1[]= {"A","C","B"};
				String arr2[]= {"A","R","O"};
				
				int flag=0;
				
				for (String each1 : arr1) {
					
					for (String each2: arr2) {
						
						if (each1.equals(each2)) {
							System.out.print(each1 + " ");
							flag++;
						}
						
					}
					
					
				}
				
				if (flag == 0) {
					System.out.println("Ortak eleman yok");
				}

		
		

	}

}
