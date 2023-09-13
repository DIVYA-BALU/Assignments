package ds;
import java.util.Scanner;

class queue{
    int array[];
    int front=-1;
    int rear=-1;
    int len;
    queue(int s){
        array=new int[s];
        len=s;
    }
    boolean isEmpty(){
        if(rear==-1)
            return true;
        return false;
    }
    boolean isFull(){
        if(rear==len-1)
            return true;
        return false;
    }
    void push(int val){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        if(rear==-1 && front==-1){
            front=0;
        }
        array[++rear]=val;

    }
    void pop(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        if(rear==0){
            rear--;
            return;
        }
        for(int i=0;i<rear;i++)
            array[i]=array[i+1];
        rear--;
        
    }
    int size(){
        return rear+1;
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        System.out.println("\nPeek element is : "+array[front]);
    }
    void display(){
        for(int i=0;i<=rear;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

}

public class queueds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of queue");
        int length=sc.nextInt();
        queue q=new queue(length);
        int choice;
        while(true){
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");         
            int val;
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Input element :");
                    val=sc.nextInt();
                    q.push(val);
                    break;
                case 2:
                    q.pop();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    return;                
                default:
                   System.out.println("Invalid choice");
                   break;
            }
        }
    }
}