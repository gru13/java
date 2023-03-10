import java.util.Scanner;
public class casestudy1{
    public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    String str = input.next();
	    int room = input.nextInt();
	    String spl = input.next();
	    String passwd = str.substring(0,2)+room+spl;
	    System.out.println(passwd); 
		input.close();
    }
}
