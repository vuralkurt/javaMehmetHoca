package day12_07_11_2021;

public class C04_Alistirma4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str= "*Java 98ogrenmek c..ok k876olay";
	        
	        // replaceAll methodlari kullanarak Java ogrenmek cok kolay
	        
	        str=str.replaceAll("\\d", "");// *Java ogrenmek c..ok kolay
	                    
	        str=str.replaceAll("\\s", "x"); // *Javaxogrenmekxc..okxkolay
	        
	        str=str.replaceAll("\\W", ""); // Javaxogrenmekxcokxkolay
	                
	        str=str.replace("x", " ");
	        System.out.println(str); //Java ogrenmek cok kolay
	        
	}

}
