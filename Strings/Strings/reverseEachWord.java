package Strings;

import java.util.Scanner;

public class reverseEachWord {

public static String reverse_each_word(String str){

    String ans = "";

    int i = 0; 
    int CurrentwordStart = 0;

    for(; i<str.length();i++){
         
        if(str.charAt(i) == ' '){
             
          int CurrentwordEnd = i-1;
          String reversedWord = "";
          for(int j = CurrentwordStart; j<=CurrentwordEnd; j++){
              
                reversedWord = str.charAt(j) + reversedWord;
          }

          ans+= reversedWord+" ";
          CurrentwordStart = i+1;
        }
        
    }
    
    int CurrentwordEnd = i - 1;
    String reversedWord = "";
    for (int j = CurrentwordStart; j <= CurrentwordEnd; j++) {

        reversedWord = str.charAt(j) + reversedWord;
    }

    ans += reversedWord + " ";


    return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = reverse_each_word(str);
        System.out.println(result);
    }
}
