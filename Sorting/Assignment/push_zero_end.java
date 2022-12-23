package Sorting.Assignment;

import java.util.Scanner;

public class push_zero_end {
    
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int[] arr = new int[size];
  
    int j = 0;
    for (int i = 0; i < size; i++) {

      arr[j] = sc.nextInt();

      if (arr[j] != 0) {
        j++;
      }
    }

    for(int i = 0 ; i<size; i++){
      System.out.print(arr[i] + " ");
    }
    
  }
   
}


