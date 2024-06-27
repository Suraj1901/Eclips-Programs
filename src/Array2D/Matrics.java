package Array2D;

public class Matrics {
	public void sumofArray(int arr[][]) {
		int sum = 0;
        for(int i = 0;i<arr.length;i++) {
			
			for(int j = 0;j<arr[i].length;j++) {
				sum = sum+arr[i][j];
				
			}
		}
        System.out.println(sum);
	}
	public void maxArray(int arr[][]) {
        int max = arr[0][0];	
        for(int i = 0;i<arr.length;i++) {
			
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j] < max) {
					max = arr[i][j];
				}
				
			}
		}
        System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		Matrics m = new Matrics();
		
		m.sumofArray(arr);
		m.maxArray(arr);
		
	
	}
}
