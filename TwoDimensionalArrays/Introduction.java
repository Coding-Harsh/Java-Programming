package TwoDimensionalArrays;

public class Introduction {
    
    public static void main(String[]args){

          int [][]arr = new int[4][5];

          for(int i = 0 ; i<5; i++){

            /* since no. of rows is 4 the index value will be accepted is 
              0,1,2,3 only   for 4th index it will not run
              */
            arr[i][0] = 2;
          }
          System.out.println(arr[3][0]);
    }
}
