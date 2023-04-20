import java.util.Scanner;



public class Matrix{
    
    int Mat[][];
    int row,col;
    Matrix(int row, int col){
        Mat = new int[row][col];
        this.col = col;
        this.row = row;
    }
    Matrix(int index){
        Mat = new int[index][index];
        this.col = index;
        this.row = index;
    }
    
    Matrix(){}

    void Create(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        input.nextLine();
        System.out.print("Enter number of columns: ");
        col = input.nextInt();
        input.nextLine();
        Mat  = new int[row][col];
        for(int i = 0;i<Mat.length;i++){
            for(int j = 0;j<Mat[0].length;j++){
                System.out.print("Enter the value at index "+i+" "+j+" : ");
                Mat[i][j] = input.nextInt();
            }
        }
        input.close();
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
    void eye(int index){
        Mat = new int[index][index];
        row = index;
        col = index;
        for(int i = 0;i<index;i++){
            Mat[i][i] = 1;
        }
    }
    Matrix subtract(Matrix a){
        for(int i = 0 ;i<a.Mat.length;i++){
            for(int j = 0;j<a.Mat[0].length;j++){
                a.Mat[i][j] -= Mat[i][j];
            }
        }
        return a;
    }
    Matrix copy(){
        Matrix Mt = new Matrix(row,col);
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                Mt.Mat[i][j] = Mat[i][j];
            }
        }
        return Mt;
    }
    void mul(Matrix a){
        int[][] Matn = new int[row][col];
       for(int i = 0 ;i<row;i++){
        for(int j = 0;j<a.row;j++){
            Matn[i][j] = 0;
            for(int k =0;k<col;k++){
                Matn[i][j] += Mat[i][k]*a.Mat[k][j];
            }
        }
       }
       Mat = Matn;
    }

    void mul(int val){
        for(int i = 0 ;i<Mat.length;i++){
            for(int j = 0;j<Mat[0].length;j++){
                Mat[i][j] *= val;
            }
        }
    }
    void Transpose(){
        int temp =0;
        for(int i = 0;i<Mat.length;i++){
            for(int j =0;j<Mat[0].length;j++){
                if(i<=j){
                    temp = Mat[j][i];
                    Mat[j][i] = Mat[i][j];
                    Mat[i][j] = temp;
                }
            }
        }
    }
}