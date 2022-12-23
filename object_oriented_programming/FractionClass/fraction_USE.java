package object_oriented_programming.FractionClass;

public class fraction_USE {
    
    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(10,20);
        Fraction f2 = new Fraction(12,16);

        f1.print();
        f2.print();

        f1.add(f2);
        f1.print();

        f1.set_numerator(44);
        f1.set_denominator(66);
        f1.print();

        Fraction f3 = new Fraction(42, 24);
        f1.multiply(f3);
        f1.print();

        Fraction f4 = Fraction.add(f1, f2);
        f4.print();
    }
}
