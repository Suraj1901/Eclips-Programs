package Arrays;

public class ArrayContainValue {
	public static void main(String[] args) {
		int arr[] = {12,23,34,45,56};
		int input = 45;
		for(int i = 0;i< arr.length;i++) {
			if(input == arr[i]) {
				System.out.println("Contain");
				break;
			}else {
				System.out.println("Not Contain");
			}
		}
		
	}
}
		