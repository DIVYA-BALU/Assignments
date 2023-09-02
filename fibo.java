// import java.util.Scanner;
// Class fibo{
//     static void fibonacci(int n){
//         int n1,n2,sum;
//         n1=0,n2=1;
//         sum=0;
//         while(n){
//             sum+=n1+n2;
//             n1=n2;
//             n2=sum;
//             System.out.println(sum);
//         }
        
//     }
//     public static void  main(String args[]){        
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the range : ");
//         int num=sc.nextInt();
//         fibonacci(num);
        

//     }
// }

class fibo{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
  int count=10;    
  System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}  