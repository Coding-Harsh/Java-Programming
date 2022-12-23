package Strings;
public class how_String_are_Stored {
    public static void main(String[] args) {
        
        String str = "abc";
        String str1 = "abc";

        String str2 = new String("abc");
        String str3 = new String("def");

        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str.equals(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str2=str3);
    }
}
