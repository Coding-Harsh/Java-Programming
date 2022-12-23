package Strings;

import java.util.Scanner;

public class takingStringInput {
    
    public static void main(String[] args) {
        
      Scanner s = new Scanner(System.in);

      String str;
      
      str = s.next();
      System.out.println(str + " " + str.length());
      
      String str2 = s.next();  
      
      /*  s.next() deals with the token
      and encounter string till it reach delimeter */

      // Basic 3 delimeter are { " " , '\t' , '\n' }

      System.out.println(str2 + " " + str2.length());

      String str3 = s.nextLine();   // it will include the entire string including space

      System.out.println(str3);
      

        
    }
}
