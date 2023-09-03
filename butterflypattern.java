// import java.util.*;
// class butterflypattern{
//     public static void main(String args[]){
//         int n;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size : ");
//         n= sc.nextInt();
//         int space=2*n-2;
//         for(int i=1;i<=n;i++){
//             for(int  j=0;j<i;j++)
//                 System.out.print("*");
//             for(int  k=0;k<space;k++)
//                 System.out.print(" ");
//             for(int  j=0;j<i;j++)
//                 System.out.print("*");
//             space=space-2;
//             System.out.println();
//         }
//         space=0;
//         for(int i=n;i>=1;i--){
//             for(int  j=0;j<i;j++)
//                 System.out.print("-");
//             for(int  k=0;k<space;k++)
//                 System.out.print(" ");
//             for(int  j=0;j<i;j++)
//                 System.out.print("-");
//             space=space+2;
//             System.out.println();
//         }


//     }
// }


// WITH RECURSION
import java.util.*;
class butterflypattern{
    static void p1(int val,int n,int space){
            if(val>n)
                return;
            for(int  j=0;j<val;j++)
                System.out.print("*");
            for(int  k=0;k<space;k++)
                System.out.print(" ");
            for(int  j=0;j<val;j++)
                System.out.print("*");
            System.out.println();
            p1(++val,n,space-2);
    }
    static void p2(int val,int n,int space){
            if(val<=0)
                return;
            for(int  j=0;j<val;j++)
                System.out.print("-");
            for(int  k=0;k<space;k++)
                System.out.print(" ");
            for(int  j=0;j<val;j++)
                System.out.print("-");
            System.out.println();
            p2(--val,n,space+2);
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        n= sc.nextInt();
        int space=2*n-2;
        int val=1;
        p1(val,n,space);
        val=n;
        p2(val,n,0);
    }
}
