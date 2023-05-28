import java.util.Scanner;
public class trace_of_matrix{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of row: ");
		int row = input.nextInt();
		System.out.print("Enter number of column: ");
		int col = input.nextInt();
		//System.out.println(row+"  "+col);	
		int arr[][] = new int[row][col];
		for(int i = 0;i<arr.length;i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.printf("Enter the val of arr[%d][%d] = ",i,j);
				arr[i][j] = input.nextInt();
			}
		}
		for(int i = 0;i<arr.length;i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("trace of matrix : "+trace(arr));
		input.close();
	}

	static int trace(int[][] arr){
		int trace = 0;
		if(arr.length <= arr[0].length){
			for (int i = 0; i < arr.length; i++) {
				trace += arr[i][i];
			}
		}
		else{
			for (int i = 0; i < arr[0].length; i++) {
				trace += arr[i][i];
			}			
		}
		return trace;
	}
}

