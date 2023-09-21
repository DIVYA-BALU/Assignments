package sort;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<size-1;i++){
            int min_ind=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[min_ind])
                    min_ind=arr[j];
            }
            if(min_ind!=i){
                int temp=arr[i];
                arr[i]=arr[min_ind];
                arr[min_ind]=temp;
            }
        }
        System.out.println("\nAfter sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
