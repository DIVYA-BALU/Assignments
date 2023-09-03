import java.util.*;
import java.io.*;
import java.math.*;
class fibo{     
    static void fibonacci(long n1,long n2,long count){   
        if(count>=0){  
            long sum = 0;  
            sum = n1.add(n2);    
            n1 = n2;    
            n2 = sum;  
            System.out.print(" "+sum);//to print from begining to end     
            fibonacci(n1,n2,count-1);
            //System.out.print(" "+sum);// to print from end to begining

        }    
 }    
 public static void main(String args[]){   
  Scanner sc=new Scanner(System.in);
  long n1 = -1;
  long n2 = 1; 
  while(true){
  System.out.print("Enter no of terms : ");
  long count= sc.nextLong();  
  if(count<0)
    System.out.println("Enter number greater than zero");
  else if(!Character.isDigit(count))
    break;
  else{
     fibonacci(n1,n2,count); 
  }
  }
       
 }  
}  