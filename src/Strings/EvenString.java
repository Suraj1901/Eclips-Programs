package Strings;

public class EvenString {
	public static void main(String[] args) {
		String str = "Hello This Side Suraj";
		for(String word : str.split(" ")) {
			if(word.length()%2==0){
				System.out.print(word+" ");
				
			}
		}
	}
}
