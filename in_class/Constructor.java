public class Constructor{
    public int x,y,z;
    Constructor(){
        x = 0;
        y = 1;
        z = 2;
    }
    Constructor(int a){
        x = a;
        y = a+1;
        z = a+2;
    }
    Constructor(int a,int b){
        x = a;
        y = b;
        z = a+b;
    }
    Constructor(int a,int b,int c){
        x = a;
        y = b;
        z = c;
    }
    public static void main(String[] args){
        Constructor f = new Constructor(3,1,3);
        System.out.println(f.x+" "+f.y+" "+f.z);
    }
}