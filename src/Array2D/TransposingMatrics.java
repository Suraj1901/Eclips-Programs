package Array2D;

public class TransposingMatrics {
	
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		int [][] trans = new int[col][row];
		for(int i = 0;i<row;i++) {
		
			for(int j = 0;j<col;j++) {
				trans[j][i] = arr[i][j];
				
			}
		}
		//for(int i = 0;i<arr.length;i++) {
		//	for(int j = 0;j<arr[i].length;j++) {
			//	System.out.println(arr[i][j]);
		//	}
		//}
		for(int i = 0;i<col;i++) {
			for(int j = 0;j<row;j++) {
				System.out.print(trans[i][j]);
			}
			System.out.println();
		}
	}

}
