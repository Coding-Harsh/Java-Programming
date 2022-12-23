package Strings;

import java.util.Scanner;

public class Reverse_Word_wise {
    
    public static String ReverseWordWise(String str){

        String reversestring = "";

        for (int i = 0; i < str.length(); i++) {

            reversestring = str.charAt(i) + reversestring;
        }

        String ans = "";

        int i = 0;
        int CurrentwordStart = 0;

        for (; i < reversestring.length(); i++) {

            if (reversestring.charAt(i) == ' ') {

                int CurrentwordEnd = i - 1;
                String reversedWord = "";
                for (int j = CurrentwordStart; j <= CurrentwordEnd; j++) {

                    reversedWord = reversestring.charAt(j) + reversedWord;
                }

                ans += reversedWord + " ";
                CurrentwordStart = i + 1;
            }

        }

        int CurrentwordEnd = i - 1;
        String reversedWord = "";
        for (int j = CurrentwordStart; j <= CurrentwordEnd; j++) {

            reversedWord = reversestring.charAt(j) + reversedWord;
        }

        ans += reversedWord + " ";

        return ans;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String result = ReverseWordWise(str);
        System.out.print(result);
    }
}
