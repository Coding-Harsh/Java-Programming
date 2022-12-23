package TwoDimensionalArrays;

import java.util.Scanner;

public class functions_2DArrays {
    
    public static int[][] takeInput(){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void print_array(int[][]arr){

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][]arr = takeInput();
        print_array(arr);
        
    }
}
