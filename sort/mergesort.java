package sort;

import java.util.Scanner;

public class mergesort {
    static void MergeSort(int arr[], int low,int high){
        
    }
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
        int high=size-1;
        MergeSort(arr,0,high);

        System.out.println("\nAfter sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
         sc.close();
    }
}
