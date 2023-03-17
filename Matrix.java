import java.util.*;

public class Matrix{
public class Matrix{
    public static int Mat[][];
    Matrix(int row, int col){
        Mat = new int[row][col];
    }

    public static void Create(){
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<Mat.length;i++){
            for(int j = 0;j<Mat[0].length;j++){
                System.out.print("Enter the value at index "+i+" "+j+" : ");
                Mat[i][j] = input.nextInt();
            }
        }
    }

    public static void  display(){
        for(int row[]:Mat){
            for(int val: row){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
}