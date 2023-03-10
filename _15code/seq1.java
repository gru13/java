import java.util.Scanner;
// We use the integers , , and  to create the following series:

// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class seq1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int i = 0;i<n;i++){
            sum += Math.pow(2,i)*b;
            System.out.print(sum+"\t");
            }
        }
        in.close();
    }
}
