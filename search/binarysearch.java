package search;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the value to be searched : ");
        int key=sc.nextInt();
        int start=0;
        int end=size-1;
        boolean f=false;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                System.out.println("The element is found at the index : "+mid);
                f=true;
                break;
            }
            else if(arr[mid] < key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(f==false){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
