public class inheritance{
    static class parent{        
        int a =11;
        int b =88;

        void h(){
            a--;
            b--;
        }
    }
    static class child extends parent{
        int c =87;
        void display(){
            System.out.println(a+" "+b+" "+c);
        }
    }
    public static void main(String args[]){
        child a = new child();
        a.display();
        a.h();
        a.display();

    }
}