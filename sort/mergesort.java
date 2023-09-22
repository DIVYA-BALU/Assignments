package sort;

import java.util.Scanner;

public class mergesort {
    static void merge(int arr[],int start,int middle,int end){
        if(start==(end-1)){
            if(arr[start]>arr[end]){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            return;
        }
        else{
            int nextStart=middle+1;
            while(start<nextStart && nextStart<=end){
                if(arr[start]>arr[nextStart]){
                    int temp=arr[nextStart];
                    for(int i=nextStart;i>start;i--){
                        arr[i]=arr[i-1];
                    }
                    arr[start]=temp;
                    start++;
                    nextStart++;
                }
                else{
                    start++;
                }
            }
        }
    }
    static void MergeSort(int arr[], int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            MergeSort(arr, low, mid);
            MergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
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
