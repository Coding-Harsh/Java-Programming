package Strings;

import java.util.Scanner;

public class Palindromic_SubString {
    
    public static boolean ispalindrome(String sub){

        int start = 0;
        int end = sub.length()-1;
        while(start<=end){
          
            if(sub.charAt(start)!=sub.charAt(end)) return false;

            start++;
            end--;

        }
        return true;
    }
    public static void PalindromicString(String str){

        for(int i = 0 ; i<str.length(); i++){
            for(int j = i; j<str.length(); j++){

                String sub = str.substring(i, j+1);
                if(ispalindrome(sub)==true){
                    System.out.println(sub);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String str = sc.nextLine();

        PalindromicString(str);
        
    }
}
