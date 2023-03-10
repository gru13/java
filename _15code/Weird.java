import java.util.Scanner;
// Task
// Given an integer,N, perform the following conditional actions:

// If  N is odd, print Weird
// If  N is even and in the inclusive range of 2 to 5 , print Not Weird
// If  N is even and in the inclusive range of 6 to 20 , print Weird
// If  N is even and greater than 20, print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird

// https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
public class Weird {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 != 0 ||(20 >= N && N >=6)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
