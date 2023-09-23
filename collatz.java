
// public class collatz {
//     public static void main(String[] args) {
//         long max_len=0,start_num=0;
//         for(long i=1;i<1000000;i+=2){
//             long num=i;
//             long length=1;
//             while(num!=1){
//                 if(num%2==0){
//                     num=num/2;
//                 }
//                 else{
//                     num=(3*num)+1;
//                 }
//                 length++; 
//             }
//             if(length>max_len){
//                 start_num=i;
//                 max_len=length;
//             }
//         }
//         System.out.println("The longest chain starts with "+start_num+" and the length of chain is "+max_len);
//     }
// }

import java.util.HashMap;

public class collatz {
    public static void main(String[] args) {
        HashMap<Long,Long> map=new HashMap<>();
        long max_len=0,start_num=0;
        for(long i=1;i<1000000;i++){
            long num=i;
            long length=1;
            while(num!=1){
                if(num%2==0){
                    num=num/2;
                }
                else{
                    num=(3*num)+1;
                }
                length++; 
            }
            if(length>max_len){
                start_num=i;
                max_len=length;
            }
        }
        System.out.println("The longest chain starts with "+start_num+" and the length of chain is "+max_len);
    }
}