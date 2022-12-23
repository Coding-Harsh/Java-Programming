package Sorting.Assignment;

import java.util.Scanner;

public class rotate_array {
    
    public static int[] take_input(){
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[]arr = new int[size];
        for(int i = 0 ; i<size ; i++){

            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void rotateArray(int[]arr){

       System.out.println("Enter the number for total shift:");
       Scanner s = new Scanner(System.in);

       int d = s.nextInt();

       while(d>0){

        int temp = arr[0];

        for(int i = 0; i<arr.length-1; i++){

            arr[i] = arr[i+1];
        }
        arr[arr.length -1] = temp;
        d--;

       }

    }

    public static void printArray(int[]arr){
        
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int[]arr = take_input();
        rotateArray(arr);
        printArray(arr);
    }
}
