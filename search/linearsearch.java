package search;

import java.util.Scanner;

public class linearsearch {
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
        boolean f=false;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("The element is found at the index : "+i);
                f=true;
                break;
            }
        }
        if(f==false){
            System.out.println("Element not found");
        }
        sc.close();
}
}
