public class Matrix{
    public static int Mat[][];
    Matrix(int row,int col){
        Mat = new int[row][col];
    }
    static void display(){
        for(int[] mat: Mat){
            for(int val:mat){
                System.out.print(val+"\t");
            }
            System.out.print("\n");
        }
    }
    static int row(){
        return Matrix.Mat.length;
    }
    
    static int col(){
        return Matrix.Mat[0].length;
    }

    static Matrix mul(Matrix m1){
        int r1 = Matrix.row();
        int c1 = Matrix.col();

        int r2 = m1.row();
        int c2 = m1.col();
        System.out.println(c1==r2);

        if(c1 != r2){
            return new Matrix(0,0);
        }

        Matrix res = new Matrix(r1,c2);

        for(int i =0;i<r1;i++){
            for(int j=0;j<c2;j++){
                res.Mat[i][j] = 0;
                for(int k =0 ;k<r2;k++){
                    res.Mat[i][j] = Matrix.Mat[i][k]*m1.Mat[k][j];
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        Matrix m = new Matrix(2,2);
        m.Mat[0][0] = 1;
        m.Mat[0][1] = 2;
        m.Mat[1][0] = 3;
        m.Mat[1][1] = 4;
        Matrix M = new Matrix(2,2);
        M.Mat[0][0] = 1;
        M.Mat[0][1] = 0;
        M.Mat[1][0] = 0;
        M.Mat[1][1] = 1;

        // Matrix p = M.mul(m);
        m.display();
        System.out.println();
        Matrix.display();
        System.out.println();

        M.display();


        
    }

}
