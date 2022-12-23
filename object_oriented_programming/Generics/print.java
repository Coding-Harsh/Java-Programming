package object_oriented_programming.Generics;

public class print {
    
    public static <T> void printArr(T []a){

        for(int i = 0 ; i < a.length; i++){

            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[]a = new Integer[10];

        for(int i = 0 ; i<10; i++){
            a[i] = i+1;
        }
        printArr(a);

        String [] s = new String[10];

        for (int i = 0; i < 10; i++) {
            s[i] = "hello";
        }
        printArr(s);
    }
}
