    class parent{        
        int a =11;
        int b =88;

        void h(){
            a--;
            b--;
        }
    }
    class child extends parent{
        int c = 87;
        int d = super.a;
        int e = super.b;
        void display(){
            System.out.println(c+" "+super.a+" "+super.b);
        }
    }
// public class inheritance{
// }
public class inheritanceTest{
    public static void main(String[] args){
        child n = new child();
        n.display();
    }
}

