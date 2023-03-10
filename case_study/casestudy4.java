import java.util.Scanner;
public class casestudy4{
    public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    String str1 = input.nextLine();
	    String str2 = input.nextLine();
	    String passwd = str1.substring(0,str1.indexOf(" "))+str2+str1.substring(str1.indexOf(" ")+1,str1.length());
	    System.out.println(passwd); 
		input.close();
    }
}
