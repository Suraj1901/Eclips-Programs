package Arrays;

public class MaxNum {
	public static void main(String[] args) {
		int arr[] = {12,34,22,11,45};
		int max = arr[0];//34
		
		for(int i = 1;i<arr.length;i++) 
		{//    34  <  45
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		
	
}
}	
