package TwoDimensionalArrays;

import java.util.Scanner;

public class row_wiseSum {
    
public static int[][] take_input(){

    Scanner scn = new Scanner(System.in);

    int rows = scn.nextInt();
    int cols = scn.nextInt();

    int[][]arr = new int[rows][cols];

    for(int i = 0 ; i<rows; i++){

        for(int j = 0 ; j<cols; j++){

            arr[i][j] = scn.nextInt();
        }
    }
    return arr;
}

public static void RowWiseSum(int[][]arr){
    

    for(int i = 0 ; i<arr.length; i++){
        int sum = 0;

        for(int j = 0; j<arr[0].length; j++){
            sum+=arr[i][j];
        }
        System.out.print(sum+" ");
    }
}
    public static void main(String[] args) {
        
        int[][]arr = take_input();

        RowWiseSum(arr);
        
    }
    
}
