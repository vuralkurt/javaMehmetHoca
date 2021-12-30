package day12_07_11_2021;

public class C05_Alistirma5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 String cumle= "Java    cok         zevkli";
	        
	        cumle=cumle.replaceAll("\\s+", " ");
	        
	        System.out.println(cumle); //Java cok zevkli
	        
	        
	        
	        System.out.println(cumle.replaceAll("[a-z]", "")); //J
	        
	        System.out.println(cumle.replaceAll("\\S", "*")); // **** *** ******
	        System.out.println(cumle.replaceAll("\\s", "*")); //Java*cok*zevkli

		
	}

}
