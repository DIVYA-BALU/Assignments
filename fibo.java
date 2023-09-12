import java.util.*;
import java.math.*;
class fibo{     
    static void fibonacci(BigInteger n1,BigInteger n2,long count){   
        if(count>=0){  
            BigInteger sum = new BigInteger("0");  
            sum = n1.add(n2);    
            n1 = n2;    
            n2 = sum;  
            //System.out.print(" "+sum);//to print from begining to end     
            fibonacci(n1,n2,count-1);
            System.out.print(" "+sum);// to print from end to begining

        }    
 }    
 public static void main(String args[]){    
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter no of terms : ");
  long count= sc.nextLong();  
  if(count<0)
    System.out.println("Enter number greater than zero");
  else{
     BigInteger n1 = BigInteger.valueOf(-1);
     BigInteger n2 = BigInteger.valueOf(1);
    fibonacci(n1,n2,count); 
  }
   sc.close();    
 }  
}  