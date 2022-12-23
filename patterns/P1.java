package patterns;
import java.util.Scanner;

/*

 *
 *^*
 *^^*
 *^^^*
 *^^^^*
 *******

 */

public class P1 {

    public static void pattern(int n){

        if(n<1) return;
        startline();

        for (int i = 1; i < n-1 ; i++) {
        String middle_value = "";

            for (int j = 0; j < i; j++) {
                middle_value += "^";
            }
            String s = "*" + middle_value + "*";
            helper(s);
        }

        
            endline(n);
        
    }
    public static void startline(){
        System.out.println("*");
    }

    public static void endline(int n){
        n = n+1;
          while(n>0){
            System.out.print("*");
            n--;
        }
    }

   
    public static void helper(String s){
        System.out.println(s);
    }

   public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
      int n = sc.nextInt();
      pattern(n);
      
      
      
   } 
}
