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
        System.out.println();
        for(int row[]:Mat){
            for(int val: row){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    Matrix add(Matrix a){
        for(int i = 0 ;i<a.Mat.length;i++){
            for(int j = 0;j<a.Mat[0].length;j++){
                a.Mat[i][j] += Mat[i][j];
            }
        }
        return a;
    }
    
    Matrix subtract(Matrix a){
        for(int i = 0 ;i<a.Mat.length;i++){
            for(int j = 0;j<a.Mat[0].length;j++){
                a.Mat[i][j] -= Mat[i][j];
            }
        }
        return a;
    }
    
    Matrix s_mul(Matrix a){
        for(int i = 0 ;i<a.Mat.length;i++){
            for(int j = 0;j<a.Mat[0].length;j++){
                a.Mat[i][j] *= Mat[i][j];
            }
        }
        return a;
    }

    void s_mul(int val){
        for(int i = 0 ;i<Mat.length;i++){
            for(int j = 0;j<Mat[0].length;j++){
                Mat[i][j] *= val;
            }
        }
    }

    public static void main(String args[]){
        Matrix m1 = new Matrix(2,2);
        Matrix m2 = new Matrix(2,2);
        m1.Create();
        m1.display();
        m2.Create();
        m2.display();
        Matrix M3 = m1.s_mul(m2);
        m1.s_mul(7);
        M3.display();
        m1.display();
    }
}