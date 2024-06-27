package Strings;

public class Palimdrome {
	public static void main(String[] args) {
		String str = "Papa";
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		if(str.equals(str1.toString())) {
			System.out.println("Palimdrome");
			
		}else {
			System.out.println(" Not Palimdrome");
			
		}
		
	}

}
