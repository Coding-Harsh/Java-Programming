package TwoDimensionalArrays;

import java.util.Scanner;

public class Matix_multiplication {
    
    public static int[][] take_input(){

         Scanner sc = new Scanner(System.in);

         int rows = sc.nextInt();
         int cols = sc.nextInt();

         int [][]arr = new int[rows][cols];

         for(int i = 0 ; i<rows; i++){
            for(int j = 0 ; j<cols; j++){
 
              arr[i][j] = sc.nextInt();
            }

        }
        return arr;
         
    }
    public static void matrix_multiplication(int[][]one , int[][]two){

        int r1 = one.length;
        int c1 = one[0].length;
        int r2 = two.length;
        int c2 = two[0].length;

        if(c1!=r2) {
      System.out.println("cols of first matrix and rows of second matrix are not same");
      return;

        }

        int [][]three = new int[r1][c2];

        for(int i = 0 ; i<three.length; i++){

            for(int j = 0 ; j<three[0].length; j++){
               
                for(int k = 0; k<c1 ; k++){

                three[i][j] += one[i][k] *two[k][j];

                }
            }
        }

        for(int i = 0 ; i<three.length; i++){
            for(int j = 0 ; j<three[0].length; j++){

                System.out.print(three[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int[][]one = take_input();
        int[][] two = take_input();

        matrix_multiplication(one,two);

    }
}
