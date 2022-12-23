package TwoDimensionalArrays;

import java.util.Scanner;

public class Spiral_print {
    
    public static int[][] take_input(){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        for(int i = 0 ; i< arr.length; i++){
            for(int j = 0 ; j< arr[0].length; j++){

                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
        
    }

    public static void spiralPrint(int[][]arr){

        int minr = 0; 
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;

        int tne = arr.length * arr[0].length; // tne = Total no.of element in the matrix
        int cnt = 0;
        
        while(cnt<tne){

           /*
            * //Left Wall
            * 
            * for(int i = minr , j = minc; i<=maxr && cnt < tne ; i++){
            * System.out.print(arr[i][j]+" ");
            * cnt++;
            * }
            * minc++;
            * 
            * // Bottom wall
            * 
            * for(int i = maxc,j = minc; j<=maxc && cnt < tne ;j++){
            * System.out.print(arr[i][j]+ " ");
            * cnt++;
            * }
            * maxr--;
            * 
            * // Left wall
            * 
            * for(int i = maxr, j = maxc; i>=minr && cnt < tne ;i--){
            * System.out.print(arr[i][j]+" ");
            * cnt++;
            * }
            * maxc--;
            * 
            * // Top wall
            * for(int i = minr, j = maxc; j>=minc && cnt < tne ; j--){
            * 
            * System.out.print(arr[i][j]+" ");
            * cnt++;
            * }
            * minr++;
            * 
            */
            
           // Top Wall

           for (int i = minr, j = minc; j <= maxc && cnt < tne; j++) {
               System.out.print(arr[i][j] + " ");
               cnt++;
           }
           minr++;

           // Right Wall

           for (int i = minr, j = maxc; i <= maxr && cnt < tne; i++) {
               System.out.print(arr[i][j] + " ");
               cnt++;
           }
           maxc--;

           // Bottom wall

           for (int i = maxr, j = maxc; j >= minc && cnt < tne; j--) {
               System.out.print(arr[i][j] + " ");
               cnt++;
           }
           maxr--;

           // Left wall
           for (int i = maxr, j = minc; i >= minr && cnt < tne; i--) {

               System.out.print(arr[i][j] + " ");
               cnt++;
           }
           minc++;

        }
        
    }
    public static void main(String[] args) {
        
        int[][]arr = take_input();

        spiralPrint(arr);
    }
}
