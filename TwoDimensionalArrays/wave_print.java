package TwoDimensionalArrays;

import java.util.Scanner;

public class wave_print {
    
    public static int[][] take_input(){

        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int cols = scn.nextInt();
        
        int[][]arr = new int[rows][cols];
        
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();

            }
        }
        return arr;
    }

    public static void wavePrint(int[][]arr){

      for(int j = 0; j<arr[0].length; j++){

        if(j%2 == 0){
    
             for(int i = 0 ; i<arr.length; i++){

                System.out.println(arr[i][j]);
             }
        }
        else{

            for (int i = arr.length-1; i>=0; i--) {

                System.out.println(arr[i][j]);
            }
        }
      }

    }
    public static void main(String[] args) {
        
      int[][]arr =take_input();
      
      wavePrint(arr);

    }
}
