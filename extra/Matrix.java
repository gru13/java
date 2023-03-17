import java.util.*;


public class Matrix{
    int Mat[][];

    Matrix(int row, int col){
        Mat = new int[row][col];
    }

    void Create(){
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<Mat.length;i++){
            for(int j = 0;j<Mat[0].length;j++){
                System.out.print("Enter the value at index "+i+" "+j+" : ");
                Mat[i][j] = input.nextInt();
            }
        }
    }

    void display(){
        for(int row[]:Mat){
            for(int val: row){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Matrix m1 = new Matrix(2,2);
        Matrix m2 = new Matrix(2,2);
        m1.Create();
        m1.display();
        m2.Create();
        System.out.println();
        m1.display();
        System.out.println();
        m2.display();
    }
}