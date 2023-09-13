package ds;
import java.util.Scanner;

class stack{
    int array[];
    int top=-1;
    int len;
    stack(int s){
        array=new int[s];
        len=s;
    }
    boolean isFull(){
        return top==len-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    int size(){
        return top+1;
    }
    void push(int e){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        array[++top]=e;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        array[top--]=0;
    }
    void top(){
        if(top==-1)
        {
            System.out.println("empty stack");
            return;
        }
        System.out.println("The top element : "+array[top]);
    }
    void print(){
        for(int i=top;i>=0;i--)
            System.out.print(array[i]+" ");
    }

}

public class stackds {
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int length=sc.nextInt();
        stack s= new stack(length);
        int choice;
        while(true){
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.Top");
            System.out.println("4. Display");
            System.out.println("5. Exit");         
            int val;
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Input element :");
                    val=sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.top();
                    break;
                case 4:
                    s.print();
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
