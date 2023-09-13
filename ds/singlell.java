package ds;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    int size=0;
    Node(){}
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
            size++;
        }
        else{
            newnode.next=head;
            head=newnode;
            size++;
        }
    }
    void addLast(int val){
        if(head==null){
            addFirst(val);
            return;
        }
        Node newnode = new Node(val);
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    void addAtPos(int pos, int val){
        if(head==null){
            addFirst(val);
            return;
        }
        if(pos>size){
            addLast(val);
            return;
        }
        if(pos<0){
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
        else
            head=head.next;
            size--;
    }
    void delLast(){
        Node temp=head;
        if(head==null)
            System.out.println("List is empty");
        else if(size==1)
            head=tail=null;
        else{
            while(temp.next.next!=null)
                temp=temp.next;
            temp.next=null;
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
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
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
        Node prev = null;
        Node curr = head;
        Node nextnode = null;
        while (curr != null) {
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        head = prev;

    }
    void swap(int pos){
        Node temp=null,curr=head,node2=null,prev=null;
        int index=0;
        while(curr!=null){
            if(pos==index+1){
                prev=curr;
                node2=curr.next;
            }
            curr=curr.next;
            index++;
        }
        temp=node2.next;
        node2.next=head.next;
        head.next=temp;
        prev.next=head;
        if(pos==size-1)
            tail=prev.next;//if last pos declare it as tail
        head=node2;

    }
    void swapNode(int pos1,int pos2){
        if(pos1>size-1||pos2>size-1||pos1<0||pos2<0){
            System.out.println("Swap not possible");
            return;
        }
        if(pos1==0){
            swap(pos2);
            return;
        }
        if(pos2==0){
            swap(pos1);
            return;
        }
        Node prev1=null,prev2=null,node1=null,node2=null,curr,temp;
        curr=head;
        int index=0;
        while(curr!=null){
            if(pos1==index+1){
                prev1=curr;
                node1=curr.next;
            }
            if(pos2==index+1){
                prev2=curr;
                node2=curr.next;
            }
            curr=curr.next;
            index++;
        }
        temp=node2.next;
        prev1.next=node2;
        node2.next=node1.next;
        prev2.next=node1;
        node1.next=temp;
        if(pos1==size-1)
            tail=node2;
        if(pos2==size-1)
            tail=node1;

    }
    
}
public class singlell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node n=new Node();
        System.out.println("Enter a choice");
        int choice;
        while(true){
            System.out.println("1.Add First");
            System.out.println("2.Add Last");
            System.out.println("3.Add At particular Position");
            System.out.println("4.Delete First");
            System.out.println("5.Delete Last");
            System.out.println("6.Delete At particular Position");
            System.out.println("7.Search by value");
            System.out.println("8.Reverse the list");
            System.out.println("9.Display list");
            System.out.println("10.Swap nodes");
            System.out.println("11.Exit");         
            int val,pos,pos1;
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
                    System.out.println("Enter indexes of both nodes : ");
                    pos=sc.nextInt();
                    pos1=sc.nextInt();
                    n.swapNode(pos, pos1);
                    break;
                case 11:
                    return;
                default:
                   System.out.println("Invalid choice");
                   break;
            }
        }      
    }
}