package TwoDimensionalArrays;

import java.util.Scanner;

public class largest_roworColumnSUM {
    
    public static void SumMax(int[][]arr){

     int maxsumrow = Integer.MIN_VALUE;
     int rowIndex = -1;

     for(int i = 0; i<arr.length; i++){
        int sum = 0;
        for(int j = 0 ; j<arr[0].length; j++){
            
            sum+=arr[i][j];
            
        }
        if(sum>maxsumrow){
            maxsumrow = sum;
            rowIndex = i;
        }
     }
    

     int colIndex = -1;
     int maxsumcol = Integer.MIN_VALUE;
     for (int j = 0; j < arr[0].length; j++) {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {

             sum += arr[i][j];

         }
         if (sum > maxsumcol) {
             maxsumcol = sum;
             colIndex = j;
         }
     }

     if(maxsumrow>maxsumcol){
        System.out.println("row " + rowIndex+ " "+ maxsumrow);
     }
     else{

         System.out.println("column " + colIndex + " " + maxsumcol);
     }
     

    }
public static void main (String[] args){

    Scanner sc = new Scanner(System.in); 

    int rows =  sc.nextInt();
    int cols = sc.nextInt();

    int[][]arr = new int[rows][cols];

    for(int i = 0 ; i<arr.length; i++){
        for(int j = 0; j< arr[0].length; j++){
            arr[i][j] = sc.nextInt();
        }
    }

    SumMax(arr);
    
}

}
