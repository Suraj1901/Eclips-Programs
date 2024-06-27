package JavaTest1;

public class MergeArray {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};
		int a1 = arr1.length;
		int a2 = arr2.length;
		int a3 = a1+a2+3;
		int arr3[] = new int[a3];
		for(int i = 0;i<a1;i++) {
			arr3[i] = arr1[i];
		}
		for(int i = 0;i<=a2;i++) {
			arr3[a1+i]=arr2[i];
		}
		for(int i = 0;i<=arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		
		

}
}
