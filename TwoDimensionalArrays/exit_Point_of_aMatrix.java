package TwoDimensionalArrays;

import java.util.Scanner;

public class exit_Point_of_aMatrix {
    
    public static int[][] take_input(){

       Scanner scn = new Scanner(System.in);
    
       int n = scn.nextInt();
       int m = scn.nextInt();

       int arr[][] = new int[n][m];

       for(int i = 0 ; i<arr.length; i++){
        for(int j = 0 ; j<arr[0].length; j++){

            arr[i][j] = scn.nextInt();
        }
       }
       return arr;  
    }

    public static void ExitPoint(int arr [][]){

        int i = 0; 
        int j = 0;
        int dir = 0;

        while(true){
        
            dir = (dir+arr[i][j])%4;

            if(dir==0) j++;   // east
            else if(dir==1) i++; // south 
            else if(dir==2) j--; // west
            else if(dir == 3) i--; // north
            
            if(i<0) {
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i>=arr.length){
                i--;
                break;
            }
             else if(j>=arr[0].length){
                j--;
                break;
             }

        }
        System.out.println("The Exit point of the matrix is: ");
        System.out.println(i+" "+j);
    }
  public static void main(String[] args) {
    
    int[][]arr = take_input();
    ExitPoint(arr);
  }

}
