package Sorting;

import java.util.Scanner;

public class bubbleSort {
    
public static int[] take_input(){

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int[]arr = new int[size];

    for(int i = 0 ; i<size ; i++){
        arr[i] = sc.nextInt();
    }
     return arr;
}

public static void bubble_sort(int arr[]){

    int n = arr.length;
    for(int i = 0 ; i<n-1;i++){
        // n-1 iteration 

        for(int j = 0 ; j<n-1-i; j++){

            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

public static void print_array(int[]arr){

    for(int i = 0 ; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
    
        int[]arr = take_input();
        bubble_sort(arr);
        print_array(arr);
    }
}
