package JavaTest1;
import java.util.Scanner;

public class ReverseElement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int input = sc.nextInt();
		int arr[] = new int[input];
		for(int i = 0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse Array");
		System.out.println();
		for(int j = arr.length-1;j>=0;j--) {
			System.out.print(arr[j]);
			
		}
	}
}
