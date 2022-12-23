package object_oriented_programming.Generics;

public class pair_use {
    public static void main(String[] args) {
        
        pair<Integer,String> p = new pair<Integer,String>(10,"abc");

    //    System.out.println(p.get_firstnumber());
    //    System.out.println(p.get_secondnumber());

       pair<Character,Character> p1 = new pair<>('a','b');

       int i = 12;
       int j = 13;
       int k = 14;
    
       pair<Integer,Integer> q = new pair<Integer,Integer>(i,j);

       pair<pair<Integer,Integer>,Integer> p2 = new pair<>(q,k);
       
       System.out.println(p2.get_secondnumber());
       System.out.println(p2.get_firstnumber().get_firstnumber());
       System.out.println(p2.get_firstnumber().get_secondnumber());
    }
}
