package Strings;

public class ReplaceChar {
	public static void main(String[]args) {
		String str = "Javafpoint";
		int index = 4;
		char ch = 'T';
		
		String newstr = str.substring(0,index)+ch+str.substring(index+1);
		System.out.print(newstr);
		
	}

}
