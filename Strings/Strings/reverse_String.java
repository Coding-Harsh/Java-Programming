package Strings;

public class reverse_String {
    
    public static String reversedString(String str){

        String reversestring = "";

        /*for(int i = str.length()-1; i>=0; i--){
            reversestring+=str.charAt(i);
        }*/

        for(int i = 0; i<str.length(); i++){

            reversestring = str.charAt(i) + reversestring;
        }
        return reversestring;
    }
    public static void main(String[] args) {
        
        String str = "Hello Brother";

      String reversed =  reversedString(str);

      System.out.print(reversed);
    }
}
