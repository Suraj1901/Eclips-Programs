package Arrays;

public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int sum = 9;
		for(int i = 0;i<arr.length;i++) {
			int currentsum = arr[i];
			if(sum == currentsum) {
				System.out.println("Sum Found at Index " +arr[i]);
				return;
				
			}else {
				for(int j = i+1;j<arr.length;j++) {
					currentsum += arr[j];
					if(currentsum == sum) {
						System.out.println("Sum Found at Index" +i+ "to"+j );
						return;

					}
				}
			}
		}
		System.out.println("No Value");
		
	

}
}
