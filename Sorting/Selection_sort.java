package Sorting;

import java.util.Scanner;

public class Selection_sort {

    public static void sort(int[]arr){


        for(int i = 0 ; i<arr.length-1;i++){
            
            // insert element at ith position

            int mini = arr[i];
            int minIndex = i;

            for(int j = i; j<arr.length; j++){

                // Find minimum element amoung all the jth position
                
                if(arr[j]<mini){
                    mini = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        
 
         for(int j = 0; j<arr.length; j++){
             System.out.print(arr[j]+" ");
            
         }
     }
     
    public static int [] take_input(){
 
     Scanner sc = new Scanner(System.in);
 
     int size = sc.nextInt();
     int[] arr = new int[size];
     for(int i = 0 ; i<size ;i++){
         arr[i] = sc.nextInt();
     }
     return arr;
     
    }
     public static void main(String[] args) {
         
         int [] arr = take_input();
 
         sort(arr);
 
     }
 }
        
        
        


        
        


        
