package sort;

import java.util.Scanner;

public class quicksort {
    public static void QuickSort(int[] arr, int low, int high) {
            int middle = (low + high) / 2;
            int pivot = arr[middle];
            int i = low;
            int j = high;
            
            while (i <= j) {
                while (arr[i] < pivot && i<=j) {
                    i++;
                }
                
                while (arr[j] > pivot && i<=j) {
                    j--;
                }

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j) {
                QuickSort(arr, low, j);
            }
            
            if (high>i) {
                QuickSort(arr, i, high);
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
        QuickSort(arr,0,high);

        System.out.println("\nAfter sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
         sc.close();
    }
   
}
