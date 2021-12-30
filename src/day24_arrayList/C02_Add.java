package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List <String> isimler=new ArrayList<>();
		System.out.println("bos liste"+isimler);
		isimler.add("Ali");
		System.out.println("1 eleman"+isimler);
		isimler.add(1, "Ayse");
		System.out.println("2.liste"+isimler);
		isimler.add(0,"Kenan");
		System.out.println(isimler);
		isimler.add(1, "Nedim");
		System.out.println(isimler);
		
		
		List<String> liste2=new ArrayList<>();
		liste2.add("Murat");
		liste2.add("Samet");
		System.out.println(liste2);
		
		isimler.addAll(3, liste2);
		System.out.println(isimler);
		
		isimler.addAll(liste2);
		System.out.println(isimler);
	}

}
