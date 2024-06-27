package JavaTest1;
import java.util.Scanner;
import java.math.*;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		double num = sc.nextInt();
		System.out.println("Enter Base");
		double base = sc.nextInt();
		double result = Math.pow(num, base);
		System.out.println(result);
		
		
		
	}

}
