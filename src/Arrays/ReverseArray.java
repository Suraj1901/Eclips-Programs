package Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Original Array");
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse Array");
		for(int j = arr.length -1 ; j >= 0 ; j-- ) {
			System.out.print(arr[j]);
			
		}
		
		}

}
