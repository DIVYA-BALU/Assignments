package ds;

public class collatz {
    static int[] collatz(int value){
        int num=value;
        int size=1;
        int arr[]=new int[2];
        while(num!=1){
            if(num%2==0){
                num=num/2;
                size++;
            }
            else{
                 num=(3*num)+1;
                 size++;
            }
               
        }
        arr[0]=value;
        arr[1]=size;
        return arr;
    }
    public static void main(String[] args) {
        int max_len=0,start_num=0;
        for(int i=500001;i<1000000;i+=2){
            int result[]=collatz(i);
            if(result[1]>max_len)
                start_num=i;
                max_len=result[1];
        }
        System.out.println("The longest chain starts with "+start_num+"and the length of chain is "+max_len);
    }
}
