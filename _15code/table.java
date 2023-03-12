import java.util.Scanner; 
public class table{
	// printing multiplication table
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int v = input.nextInt();
		for(int i = 1; i<11;i++){
			System.out.printf("%d x %d = %d\n",i,v,i*v);
		}
	}
}
