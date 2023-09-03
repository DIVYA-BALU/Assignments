import java.util.*;
class butterflypattern{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        n= sc.nextInt();
        int space=2*n-2;
        for(int i=1;i<=n;i++){
            for(int  j=0;j<i;j++)
                System.out.print("*");
            for(int  k=0;k<space;k++)
                System.out.print(" ");
            for(int  j=0;j<i;j++)
                System.out.print("*");
            space=space-2;
            System.out.println();
        }
        space=0;
        for(int i=n;i>=1;i--){
            for(int  j=0;j<i;j++)
                System.out.print("-");
            for(int  k=0;k<space;k++)
                System.out.print(" ");
            for(int  j=0;j<i;j++)
                System.out.print("-");
            space=space+2;
            System.out.println();
        }


    }
}