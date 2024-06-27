package JavaTest1;
import java.util.Scanner;

public class AddNewValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		
		int input = sc.nextInt();
		int arr[] = new int[input];
		int newarr[] = new int[input+1];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter position To add element");
		int pos = sc.nextInt();
		System.out.println("Enter Value");
		int value = sc.nextInt();
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==pos) {
				newarr[i]=value;
			}
			else {
				newarr[i]=arr[i];
			}
		}
		for(int i = 0;i<=newarr.length-1;i++) {
			System.out.print(newarr[i]+ ",");
		}
		
		
		
		
		
		
	}

}
