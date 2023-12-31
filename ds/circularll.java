package ds;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    int size=0;
    Node(){

    }
    Node(int val){
        data=val;
        next=null;
    }
    Node head=null;
    Node tail= null;
    void addFirst(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=head;
            size++;
        }
        else{
        tail.next=newnode;
        newnode.next=head;
        head=newnode;
        size++;
        }
    }
    void addLast(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=head;
            size++;
        }
        else{
        tail.next=newnode;
        tail=newnode;
        tail.next=head;
        size++;
        }
    }
    void addAtPos(int pos, int val){
        if(head==null){
            addFirst(val);
            return;
        }
        if(pos>size || pos<=0){
            addFirst(val);
            return;
        }
        Node newnode=new Node(val);
        Node curr=head;
        for(int i=0;i<pos-1;i++)
            curr=curr.next;
        newnode.next=curr.next;
        curr.next=newnode;
        size++;
    }
    void delFirst(){
        if(head==null)
            System.out.println("List is empty");
        else if(size==1)
            head=tail=null;
        else {    
            if(head != tail ) {  
                head = head.next;  
                tail.next = head;  
                size--;
            }   
            else {  
                head = tail = null; 
                size--; 
            }  
        }  
    }
    void delLast(){
        Node temp=head;
        if(head==null)
            System.out.println("List is empty");
        else if(size==1)
            head=tail=null;
        else{
            while(temp.next.next!=head)
                temp=temp.next;
            temp.next=head;
            tail=temp;
            size--;
        }

    }
    void delAtPos(int pos){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty"); 
            return;
        }
        if(pos<0||pos>=size){
            System.out.println("Invalid position");
            return;
        }
        if(pos==0){
            delFirst();
            return;
        }
        if(pos==size-1){
            delLast();
            return;
        }
        for(int i=0;i<pos-1;i++)
            temp=temp.next;
        temp.next=temp.next.next;
        size--; 
    }
    void display(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node curr=head;
        System.out.println();
        while(curr.next!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(curr.data);
        System.out.println();
    }
    void search(int val){
        if(head==null)
        {
            System.out.println("\nList empty");
            return;
        }
        Node curr=head;
        int index=0;
        while(curr!=null){
            if(curr.data==val){
                System.out.println("\nThe element is found at index "+index);
                return;
            }
            curr=curr.next;
            index++;
        }
        System.out.println("\nThe element could not be found");
    }
    void reverse(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node prev = tail;
        Node curr = head;
        Node temp=head;
        Node nextnode = null;
        while (curr != tail) {
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        nextnode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextnode;
        head=prev;
        tail=temp;


    }
    
}
public class circularll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node n=new Node();
        int choice;
        while(true){
            System.out.println("1.Add First");
            System.out.println("2.Add Last");
            System.out.println("3.Add At particular Position");
            System.out.println("4.Delete First");
            System.out.println("5.Delete Last");
            System.out.println("6.Delete At particular Position");
            System.out.println("7.Search by value");
            System.out.println("8.Reve rse the list");
            System.out.println("9.Display list");
            System.out.println("10.Exit");         
            int val,pos;
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Input element :");
                    val=sc.nextInt();
                    n.addFirst(val);
                    break;
                case 2:
                    System.out.println("Input element :");
                    val=sc.nextInt();
                    n.addLast(val);
                    break;
                case 3:
                    System.out.println("Input element :");
                    val=sc.nextInt();
                    System.out.println("Input position :");
                    pos=sc.nextInt();
                    n.addAtPos(pos, val);
                    break;
                case 4:
                    n.delFirst();
                    break;
                case 5:
                    n.delLast();
                    break;
                case 6:
                    System.out.println("Input position :");
                    pos=sc.nextInt();
                    n.delAtPos(pos);
                    break;
                case 7:
                    System.out.println("Input value to be searched :");
                    val=sc.nextInt();
                    n.search(val);
                    break;
                case 8:
                    n.reverse();
                    break;
                case 9:
                    n.display();
                    break;
                case 10:
                    return;
                default:
                   System.out.println("Invalid choice");
                   break;
            }
        }      
    }
}
