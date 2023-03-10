import java.util.Scanner;
public class casestudy3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		// int n = input.nextInt();
		int n = 5;
		int arr[][] = new int[n][n];
		for(int i = 0; i<n;i++){
			for(int j = 0;j<i;j++){
				if(i<2){
					arr[i][j] = 1;
				}
				else{
					if(j==0&j==i-1){
						arr[i][j] = 1
					}
					else{
						arr[i][j] = arr[i-1][j]+arr[i][j-1];
					}
				}
			}
		}
		// printing
		for(int i = 0; i<n;i++){
			for(int j = 0;j<i;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
