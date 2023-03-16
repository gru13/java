public class Matrix{
    static int Mat[][];
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
    public static void main(String args[]){
        Matrix m = new Matrix(2,2);

        m.display();
    }
}
