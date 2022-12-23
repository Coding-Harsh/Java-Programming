package TwoDimensionalArrays;

import java.util.Scanner;

public class Rotate_2DArrayBy_90 {
    
public static int[][] Take_input(){

    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int arr[][] = new int[rows][cols];

    for(int i = 0 ; i< arr.length; i++){          // arr.length = no.of.rows
        for(int j = 0 ; j<arr[0].length; j++){    // arr[0].length = no.of.colums
            arr[i][j] = sc.nextInt();
        }
    }
    return arr;
    
}

public static void rotate_90_degree(int[][]arr){

    // Taking transpose of the Giving 2D array

    for(int i = 0 ; i<arr.length; i++){

        for(int j = i ; j<arr[0].length; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

   
     // Reversing Columns, Row by row
    
     

     for(int i = 0 ; i<arr.length; i++){

         int li = 0;
         int ri = arr[0].length - 1;

          while(li<=ri){
          
          int temp = arr[i][li];
          arr[i][li] = arr[i][ri];
          arr[i][ri] = temp;
     
          li++;
          ri--;
     
      }
     
     }
    // Printing the Output

    System.out.println();
    System.out.println("The modified Rotated Matix is: ");
    System.out.println();

    for(int i = 0 ; i<arr.length; i++){
        for(int j = 0 ; j<arr[0].length ; j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }

}
    public static void main(String[] args) {
        
        int[][]arr = Take_input();

        rotate_90_degree(arr);
    }
}
