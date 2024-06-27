package Arrays;

public class MaxandFactorial {
	public static void findMax(int arr[],int max) {
		max = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		
	}
	public static void findFactorial(int max) {
		int fact = 1;
		for(int i = 1;i<=max;i++) {
			fact = fact*i;
			
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		int arr1[] = {1,3,5,4,8,2};
		int max = arr1[0];
		findMax(arr1,max);
		findFactorial(max);
		
		
	}

}
