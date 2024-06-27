package Strings;

public interface AddStringIntoAnotherString {
	public static void main(String[] args) {
		String oldstring = "Hello How are you";
		int index = 5;
		StringBuffer sbf = new StringBuffer(oldstring);
		sbf.insert(index+1,"Suraj ");
		System.out.print(sbf);
	}

}
