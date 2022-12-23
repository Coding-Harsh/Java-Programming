package object_oriented_programming.FractionClass;

public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
    
       this.numerator = numerator;

       if(denominator == 0) {
        return;
        //TODO error out
       }

       this.denominator = denominator;
       
       simplify();
    }

    public int get_numerator(){

        return numerator;
    }
    
    public int get_denominator() {

        return denominator;
    }

    public void set_numerator(int numerator){
        
        this.numerator = numerator;
        this.simplify();
    }

    public void set_denominator(int denominator){

        if(denominator == 0){
            return;
            //TODO error out;
        }
        this.denominator = denominator;
        this.simplify();

    }

    private void simplify(){
        int gcd = 1;
        int minimum = Math.min(numerator,denominator);

         for (int i = 2; i<=minimum; i++){

            if( numerator % i  == 0 && denominator % i  == 0){
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void add(Fraction f2){
        this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
        this.denominator = this.denominator *f2.denominator;
        simplify();
    }

    public void print(){
        if(denominator == 1){
            System.out.println(numerator);
        }
        else{
            System.out.println( numerator+"/"+denominator);
        }
    }

    public void multiply(Fraction f3){

        this .numerator = this.numerator * f3.numerator;
        this.denominator = this.denominator *f3.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2){

        int newNum = f1.numerator *f2.denominator + f2.numerator *f1.denominator;
        int newDen = f1.denominator*f2.denominator;
        Fraction f = new Fraction(newNum,newDen);
        return f;
    }

    
}
