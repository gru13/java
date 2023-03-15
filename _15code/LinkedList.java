import java.util.Scanner;
public class LinkedList{
    public static Node head = new Node();
    
    static class Node{
        int data;
        Node next;

        Node(){}
        Node(int data){
            this.data = data;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    
    static Node  Create(){
        Node tmp = head;
        
        System.out.print("Enter the length of the LinkedList : ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();  

        for(int i = 0; i<len;i++){
            System.out.print("Enter the value for "+i+" node : ");
            tmp.data = input.nextInt();
            if(i != len-1){
                tmp.next = new Node();
            }
            tmp = tmp.next;
        }
        tmp = null;
        return head;


    }

    static void display(Node head){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.print("null\n");
    }
    static void display(){
        Node tmp = LinkedList.head;
        while(tmp!=null){
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.print("null\n");
    }

    static int length(){
        Node tmp = LinkedList.head;
        int len = 0;
        while(tmp != null){
            len++;
            tmp = tmp.next;
        }
        return len;
    }

    static int length(Node head){
        Node tmp = head;
        int len = 0;
        while(tmp != null){
            len++;
            tmp = tmp.next;
        }
        return len;
    }

    
    static int value(int index){
        Node tmp = LinkedList.head;
        if(index >= length(tmp)){
            return -1;
        }
        for(int i = 0 ;i<index;i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    static int index(int value){
        Node tmp = LinkedList.head;
        int index = 0;
        while(tmp!=null){
            if(tmp.data == value){
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }
     
    static void  insert(int value){
        Node tmp = LinkedList.head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(value,null);
    }

    static void insert(int value, int index){
        Node tmp = head;
        Node newNode = new Node(value);
        for(int i = 0;i<index;i++){
            tmp = tmp.next;
        }
        newNode.next = tmp.next;
        tmp.next = newNode;
    }


    LinkedList(){}
    LinkedList(Node head){
        this.head = head;

    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.Create();
        list.display();
        int l = list.length();
        list.insert(9,2);
        list.display();
    }
}