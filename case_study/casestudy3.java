import java.util.Scanner;
public class casestudy3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[][] = new int[n][2*n-1];
		for(int i = 0; i<n;i++){
			for(int j =0;j<2*n-1;j++){
				if(i==0){
					arr[i][j]=1;
					continue;
				}
				else if(i==1){
					arr[i][0]=1;
					arr[i][1]=2;
					arr[i][2]=1;
				}
				else{
					
				}
			}
		}

	}
}
