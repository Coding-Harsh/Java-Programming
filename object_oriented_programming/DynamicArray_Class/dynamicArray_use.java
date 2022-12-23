package object_oriented_programming.DynamicArray_Class;

public class dynamicArray_use {
    
    public static void main(String[] args) {
        
        dynamicArray d = new dynamicArray();

        for(int i = 0; i<10; i++){

            d.add(i+10);
        }

        System.out.println(d.size());

        d.set(4, 10);
        System.out.println(d.get(3));
        System.out.println(d.get(4));

        while(!d.isEmpty()){
          
            System.out.println(d.removelast());
            System.out.println("size = "+ d.size());
        }
    }
}
