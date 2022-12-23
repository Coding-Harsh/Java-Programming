package object_oriented_programming.Exceptions;

public class fraction_USE {
    
    public static void temp() {
        Fraction f1 = new Fraction(10, 20);
        Fraction f2 = new Fraction(12, 16);

        f1.print();
        f2.print();

        f1.add(f2);
        f1.print();

        f1.set_numerator(44);

        int i  = 10;
        try{
            i++;
            f1.set_denominator(0);
             i++;         // in case of no exception this line of code will run
        } catch(ZeroDenominatorException e){
            System.out.println("don't use 0 as a denominator"); // in case of there is exception this line will run
        } finally{


        }
        f1.print();

        Fraction f3 = new Fraction(42, 24);
        f1.multiply(f3);
        f1.print();

        Fraction f4 = Fraction.add(f1, f2);
        f4.print();
    }

    public static void main(String[] args) throws ZeroDenominatorException {
        
        temp();
    }
}
