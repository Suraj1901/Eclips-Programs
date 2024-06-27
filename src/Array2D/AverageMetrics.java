package Array2D;

public class AverageMetrics {
	public static void average(int[][]arr) {
		int sum = 0;
		int totalelements= 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				sum += arr[i][j];
				totalelements++;
			}
		}
		int avg = sum/totalelements;
		System.out.println(sum);
		System.out.println(totalelements);
		System.out.println(avg);
		
	}
	
	
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}	};
		average(arr);
		
		

    }
	
}
