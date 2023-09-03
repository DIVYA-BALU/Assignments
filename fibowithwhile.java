import java.util.*;
import java.math.*;
class fibowithwhile{   
    static BigInteger f1 = BigInteger.valueOf(-1);
    static BigInteger f2 = BigInteger.valueOf(1);
    static boolean isInt(String s){
      try
        {
            int num=Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }  
    static void fibonacci(BigInteger n1,BigInteger n2,long count){   
        if(count>0){  
            BigInteger sum = new BigInteger("0");  
            sum = n1.add(n2);    
            n1 = n2;    
            n2 = sum;  
            System.out.print(" "+sum);    
            fibonacci(n1,n2,count-1);
        }
        else{
          f1=n1;
          f2=n2;
        }    
 }    
    public static void main(String args[]){  
      Scanner sc=new Scanner(System.in);
      while(true){
        System.out.print("\nEnter no of terms : ");
        String count= sc.nextLine();  
      if(isInt(count)){
          int num= Integer.parseInt(count);
          fibonacci(f1,f2,num);
      }
      else{
        System.out.println("Exited");
        break;
      }
   
  }
       
 }  
}  