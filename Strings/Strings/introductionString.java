package Strings;

public class introductionString {
    
    public static void main(String[] args) {
        
        String str = "Harsh";
        String str1 = " Burman";

        System.out.println(str.length());

        System.out.println(str.charAt(2));

        System.out.println(str + str1);
        
        // Another way to concatinate two strings

        str = str.concat(str1);

        System.out.println(str);

        // we can compare two string using equals

        System.out.println(str.equals(str1));

        /* Another way to compare two strings is using [Compare to] :- 
        
        It compares two string lexicographically using Ascii value of the 
        character
        */ 
        
        System.out.println(str.compareTo(str1));

        
                       //  SUBSTRINGS

        String str2 = "Geeks For Geeks";

        System.out.println(str2.substring(str2.length()-1));

        /*Another Way to get Substring is by giving starting and 
         Ending index
         */

         System.out.println(str2.substring(1, 7));

         

    }
}
