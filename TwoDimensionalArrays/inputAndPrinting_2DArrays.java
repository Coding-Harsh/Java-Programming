package TwoDimensionalArrays;

import java.util.Scanner;

public class inputAndPrinting_2DArrays {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]arr = new int[n][m];

        for(int i = 0 ; i<n ; i++){

            for(int j = 0; j<m ; j++){

                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

         for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int j = 0 ; j<arr[0].length; j++){
            for(int i = 0 ; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
