package Sorting;

import java.util.Scanner;

public class reverse_Array {

    public static int[] take_input(){

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr = new int [size];

        for(int i = 0 ; i<size ; i++){

            arr[i] = sc.nextInt();
        }

        return arr;

        
    }

    public static void reverse(int[]arr){

        int size = arr.length;
        int ith = 0;
        int jth = size-1;

        while(ith<jth){

        int temp = arr[ith];
        arr[ith] = arr[jth];
        arr[jth] = temp;
        ith++;
        jth--;

        }
    }

    public static void printArray(int[]arr){

        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
public static void main(String[] args) {
    
    int[]arr = take_input();

    reverse(arr);
    printArray(arr);
    
}

}
