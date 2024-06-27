package Strings;

import java.util.*;


public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "Hello Suraj Hello";
		
		char[] ch = new char [str.length()+1];
		int index = 0;
		for(int i = 0; i <= ch.length-1; i++) {
			for(int j = 0; j <= i; j++) {
				if(ch[i] == ch[j]) {
					break;
				}
				if(j==i) {
					ch[index++]= ch[i];
				}
			}
			
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch,index)));
		
	}

}
