package object_oriented_programming.complexNumber_Class;

public class complex_use {
 
    
    public static void main(String[] args) {
        
        complex c1 = new complex(1, 4);
        complex c2 = new complex(2, 8);

        c1.print();
        c2.print();

        c1.set_imaginary(12);
        c2.set_imaginary(22);

        System.out.println("After modification: ");

        c1.print();
        c2.print();

        c1.add(c2);

        System.out.println("After addition: ");
        c1.print();

        complex c3 = new complex(4, 25);

        c1.multiply(c2);

        System.out.println("After multiplication : ");
        c1.print();

    }
}
