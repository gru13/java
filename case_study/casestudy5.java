import java.util.Scanner;
import java.util.Arrays;
public class casestudy5{
    public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    int len = input.nextInt();
		input.nextLine();
		String arr[] = new String[len];
		for(int i = 0; i<len;i++){
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		for(int i = 0; i<len;i++){
			System.out.print(arr[i]+"\t");
		}

		
    }
}
