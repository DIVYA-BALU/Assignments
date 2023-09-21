package sort;

import java.util.Scanner;

public class cocktailsort {
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
        boolean swap;
        for(int i=0;i<size-1;i++){
            swap=false;
            int j;
            for(j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }   
             if(swap==false)
                break;

            swap=false;
            for(j=j-2;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                    swap=true;
                    }
            }

        }

        System.out.println("\nAfter sorting");
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
        
        sc.close();
    }
    }

