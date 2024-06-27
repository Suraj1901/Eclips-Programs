package JavaTest1;
import java.util.Scanner;


public class FindElement {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int result = 0;
		for(int i = 0;i<arr.length;i++) {
			if(inp ==  arr[i]) {
				result = i;
			}
		}
		
		System.out.println(result);
		

}
}
