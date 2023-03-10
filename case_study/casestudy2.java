import java.util.Scanner;

public class casestudy2{
	public static void main(String args[]){
		// milk man
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int L5 = num/5;
		System.out.println("5L--"+L5);
		num %= 5;
		int L3 = num/3;
		System.out.println("3L--"+L3);
		num %= 3;
		System.out.println("1L--"+num);
		input.close();
	}
}
