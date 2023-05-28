import java.util.Scanner;
public class doubleLinkedList{
    static class Node{
        int data;
        Node prev;
        Node next;

    Node(int data){
        this.data = data;
    }
    Node(){}
    } 

    static Node head = new Node();


    static int length(){
        int len = 0;
        Node tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            len++;
        }
        return len;
    }
    void Create(){
        Node tmp = doubleLinkedList.head;
        tmp.prev = null;
        System.out.print("Enter the length of dLL : ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        for(int i =0 ;i<len;i++){
            System.out.print("Enter the value of index "+i+" dLL : ");
            tmp.data = input.nextInt();
            tmp.next = new Node();
            tmp.next.prev = tmp;
            tmp = tmp.next;
        }
        input.close();
        tmp.prev.next = null; 

    }
    void display(){
        Node tmp = doubleLinkedList.head;
        while(tmp!=null){
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.print("null\n");
    }
    void rev_display(){
        Node tmp = doubleLinkedList.head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        while(tmp!=null){
            System.out.print(tmp.data + " -> ");
            tmp = tmp.prev;
        }
        System.out.print("null\n");
    }
    void insert(int val){
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(val);
        tmp.next.prev = tmp;
        tmp = tmp.next;
        tmp.next = null; 
    }
    void insert(int index,int val){
        if(index == 0){
            Node newNode = new Node(val);
            newNode.prev = null;
            newNode.next = doubleLinkedList.head;
            doubleLinkedList.head.prev = newNode;
            doubleLinkedList.head = doubleLinkedList.head.prev;

        }
        else if(index  == doubleLinkedList.length()-1){
            LinkedList.insert(val);
        }
        else{
            Node tmp = head;
            for(int i = 0;i<index-1;i++){
                tmp = tmp.next;
            }
            Node newNode = new Node(val);
            newNode.next = tmp.next;
            tmp.next.prev = newNode;
            newNode.prev = tmp;
            tmp.next = newNode;
        }
        
    }
    static void remove(){
        Node tmp = head;
        while(tmp.next.next != null){
            tmp = tmp.next;
        }
        tmp.next.prev = null;
        tmp.next = null;
    }
    void remove(int index){
        if(index == 0){
            doubleLinkedList.head = doubleLinkedList.head.next;
            doubleLinkedList.head.prev = null;
        }
        else if(index == doubleLinkedList.length()-1){
            doubleLinkedList.remove();
        }
        else{
            Node tmp = head;
            for(int i = 0;i<index-1;i++){
                tmp = tmp.next;
            }
            tmp.next.next.prev = tmp;
            tmp.next = tmp.next.next;
        }
    }

    doubleLinkedList(){}

    public static void main(String args[]){
        doubleLinkedList list = new doubleLinkedList();
        list.Create();
        list.display();
        list.rev_display();
        list.insert(3);
        list.display();
        list.remove(2);
        list.display();
    }
}