import java.util.Scanner;
public class reverse_integer{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int rev = 0;
        
        while(number != 0){
            rev *= 10;
            rev += number % 10;
            number /= 10;
        }
        System.out.println("\n"+rev+"\n");
    }
}