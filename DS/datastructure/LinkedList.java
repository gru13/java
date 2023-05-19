/**
 * LinkedList
 */
import java.util.Scanner;

public class LinkedList implements dataStructure{
    private int len;
    private Node head;
    private Node last;

    LinkedList(){
        len = 0;
        head = null;
        last = head;
    }
    LinkedList(int len){
        this.len = len;
        head = new  Node(0);
        last = head;
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<len;i++){
            System.out.print("Enter the value for index "+i+" : ");
            last.data = input.nextInt();
            input.nextLine();
            if(i != len-1){
                last.next = new Node(0);
                last = last.next;
            }
        }
        input.close();
    }
    public void display() {
        if(len == 0){
            System.out.println("--NULL--");
            return;
        }
        Node tmp = head;
        System.out.println();
        while(tmp != null){
            System.out.print(tmp.data+" -> ");
            tmp = tmp.next;
        }
        System.out.println("NULL");
        return;
    }
    public void insert(int index, int val) {
        if(index < 0){
            index += len; 
        }
        if(index<0 || index>len){
            return;
        }
        // index == 0
        Node nw = new Node(val);
        Node tmp = head;
        if(index == 0){
            nw.next = this.head;
            this.head = nw;
        } else {
            for(int i=0;i<index-1;i++){tmp = tmp.next;}
                nw.next=tmp.next;
                tmp.next = nw;
        }
        len++;
        return;
         
    }

    public void remove(int index) {
        if(len == 0){
            return;
        }
        if(index<0){
            index += len;
        }
        if(index < 0 || index < len){
            return;
        }

        if(index  == 0){
            head = head.next;
        }
        Node tmp = head;
        for(int i = 0;i<index-1;i++){
            tmp = tmp.next;
            
        }
        len--;
        return;
    }
}