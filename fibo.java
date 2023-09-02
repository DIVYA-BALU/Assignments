import java.util.*;
import java.math.*;
class fibo{  
    static BigInteger n1 = BigInteger.valueOf(-1);
    static BigInteger n2 = BigInteger.valueOf(1);
    static BigInteger sum = BigInteger.valueOf(0);    
    static void fibonacci(long count){   
        if(count>=0){    
            sum = n1.add(n2);    
            n1 = n2;    
            n2 = sum;    
            System.out.print(" "+sum);   
            fibonacci(count-1);    
        }    
 }    
 public static void main(String args[]){    
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter no of terms : ");
  long count= sc.nextLong();  
  if(count<0)
    System.out.println("Enter number greater than zero");
  else
    fibonacci(count);   
 }  
}  