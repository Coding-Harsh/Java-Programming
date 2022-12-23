package Strings;

import java.util.Scanner;

public class printAllChar {

    public static void print_all_char(String str){

        for(int i = 0 ; i< str.length(); i++){

            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        print_all_char(str);
    }
}
