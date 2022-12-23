package Sorting;

import java.util.Scanner;

public class Insertion {
    
    public static int[] take_input(){
                  
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
         return arr;
         
    }

    public static void insertion_sort(int[]arr){
        
        int n = arr.length;
        for(int i = 1; i<n; i++)
        {
            //inserting ith element in the sorted part of the array

            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;

        }


    }
    public static void print_array(int[]arr){
           
        for(int i = 0; i<arr.length ; i++){
            
            System.out.print(arr[i]+ " ");
        }

    }

public static void main(String[] args) {
    
    int[]arr = take_input();
    insertion_sort(arr);
    print_array(arr);
}

}
