package day15_13_11_2021;

import java.util.Scanner;

public class C10_Palindrome {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
	        String kelime = scan.nextLine();
	        
	        
	        
	       if(kelime.equals(tersineCevir(kelime))) {
	    	   System.out.println("Girdiginiz String palindrome");
	       }else System.out.println("degildir");
	        scan.close();
	    }
	
	
	
	
	    public static String tersineCevir(String kelime) {
	        String tersStr="";
	        
	        for (int i = kelime.length()-1; i >=0; i--) {
	            
	            
	            tersStr+=kelime.substring(i, i+1);
	            
	        }
	        
	        
	        return tersStr;

	}

}
