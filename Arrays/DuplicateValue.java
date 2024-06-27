package Arrays;

public class DuplicateValue {
	public static void main(String[]args) {
		int arr[] = {12,1,3,4,5,5,9,8};
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Value");
					break;
				}
				else {
					System.out.println("No Duplicate Value");
					break;
				}
				}
			}
		}
	}

