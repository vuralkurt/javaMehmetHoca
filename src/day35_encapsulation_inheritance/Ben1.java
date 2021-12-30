package day35_encapsulation_inheritance;

public class Ben1 {
	private static String tcNo="123123123";

	public static void main(String[] args) {
		
	System.out.println(tcNo);	

	}

	public static String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

}
