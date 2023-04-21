public class Main {
    public static void main(String[] args) {
        // // stack
        // stack d = new stack();
        // for(int i = 0;i<10;i++){
        //     d.push(i);
        // }
        // // System.out.println(d.pop());
        // d.reverse();
        // d.display();
        // //

        // // queue
        // queue q = new queue();
        // for(int i = 0;i<5;i++){q.enQueue(i);}
        // // q.display();
        // // System.out.println(q.deQueue());
        // q.reverse();
        // q.display();
        // //

        // matrix
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        b.Create();
        a.eye(3);
        // a.display();
        // b.display();
        a = b.copy();
        a.Transpose();
        a.display();
        b.display();
        b.mul(a);
        b.display();
        // b.Transpose();
        // b.display();
        //

        

    }
}
