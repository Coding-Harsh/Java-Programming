package object_oriented_programming.complexNumber_Class;

import java.util.Scanner;

// class Fraction {

//     private int numerator;
//     private int denominator;

//     public Fraction(int numerator, int denominator) {

//         this.numerator = numerator;

//         if (denominator == 0) {
//             return;
//             // TODO error out
//         }

//         this.denominator = denominator;

//         simplify();
//     }

//     public int get_numerator() {

//         return numerator;
//     }

//     public int get_denominator() {

//         return denominator;
//     }

//     public void set_numerator(int numerator) {

//         this.numerator = numerator;
//         this.simplify();
//     }

//     public void set_denominator(int denominator) {

//         if (denominator == 0) {
//             return;
//             // TODO error out;
//         }
//         this.denominator = denominator;
//         this.simplify();

//     }

//     private void simplify() {
//         int gcd = 1;
//         int minimum = Math.min(numerator, denominator);

//         for (int i = 2; i <= minimum; i++) {

//             if (numerator % i == 0 && denominator % i == 0) {
//                 gcd = i;
//             }
//         }
//         numerator = numerator / gcd;
//         denominator = denominator / gcd;
//     }

//     // public static Fraction add(Fraction f1, Fraction f2) {

//     //     int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
//     //     int newDen = f1.denominator * f2.denominator;
//     //     Fraction f = new Fraction(newNum, newDen);
//     //     return f;
//     // }

//     public void print() {
    
//             System.out.println(numerator + "/" + denominator);
        
//     }

//     // public static Fraction multiply(Fraction f1, Fraction f2) {

//     //     int newNum = f1.numerator * f2.numerator;
//     //     int newDen = f1.denominator * f2.denominator;
//     //     Fraction f = new Fraction(newNum, newDen);
//     //     return f;
//     // }
//     public void add(Fraction f2) {
//         this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
//         this.denominator = this.denominator * f2.denominator;
//         simplify();
//     }

//     // public static Fraction add(Fraction f1, Fraction f2){

//     // int newNum = f1.numerator *f2.denominator + f2.numerator * f1.denominator;
//     // int newDen = f1.denominator*f2.denominator;
//     // Fraction f = new Fraction(newNum,newDen);
//     // return f;
//     // }
//     public void multiply(Fraction f3) {

//         this.numerator = this.numerator * f3.numerator;
//         this.denominator = this.denominator * f3.denominator;
//         simplify();
//     }

// }

// class Solution {

//     public static void main(String args[]) {

//         Scanner scn = new Scanner(System.in);
//         int num1 = scn.nextInt();
//         int den1 = scn.nextInt();
//         Fraction f = new Fraction(num1, den1);

//         int nop = scn.nextInt();

//         for (int i = 0; i < nop; i++) {
//             int choice = scn.nextInt();
//             int num2 = scn.nextInt();
//             int den2 = scn.nextInt();
//             Fraction f1 = new Fraction(num2, den2);

//             switch(choice){

//                 case 1:
//                     f.add(f1);
                    
//                     f.print();
//                     break;

//                 case 2:

//                     f.multiply(f1);
//                     f.print();
//                     break;
//             }
//         }

//     }
// }


class Polynomial {
    // Don't change this name.
    // name of the array -> coefficients

    // Complete the class.
    // Overload the 'plus' , 'minus', and 'times' function used for adding,
    // subtracting and multiplying polynomials.
    int[] degCoeff;

    Polynomial() {
        degCoeff = new int[10];
    }

    public void setCoefficient(int degree, int coeff) {
        if (degree > degCoeff.length - 1) {
            // create a new array with size= degree+1
            int temp[] = degCoeff;
            degCoeff = new int[degree + 1];
            // copy values from temp to degCoeff
            for (int i = 0; i < temp.length; i++) {
                degCoeff[i] = temp[i];
            }
        }
        degCoeff[degree] = coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed)
    // in increasing order of degree.
    public void print() {
        for (int i = 0; i < degCoeff.length; i++) {
            if (degCoeff[i] != 0) {
                System.out.print(degCoeff[i] + "x" + i + " ");
            }
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        Polynomial ans = new Polynomial();
        int plen1 = this.degCoeff.length;
        int plen2 = p.degCoeff.length;
        int len = Math.min(plen1, plen2);
        int i;
        for (i = 0; i < len; i++) {
            ans.setCoefficient(i, this.degCoeff[i] + p.degCoeff[i]);
        }
        while (i < plen1) {
            ans.setCoefficient(i, this.degCoeff[i]);
            i++;
        }
        while (i < plen2) {
            ans.setCoefficient(i, p.degCoeff[i]);
            i++;
        }
        return ans;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        int plen1 = this.degCoeff.length;
        int plen2 = p.degCoeff.length;
        int len = Math.min(plen1, plen2);
        Polynomial ans = new Polynomial();
        int i;
        for (i = 0; i < len; i++) {
            ans.setCoefficient(i, this.degCoeff[i] - p.degCoeff[i]);
        }
        while (i < plen1) {
            ans.setCoefficient(i, this.degCoeff[i]);
            i++;
        }
        while (i < plen2) {
            ans.setCoefficient(i, -p.degCoeff[i]);
            i++;
        }
        return ans;
    }

    public int getCoeff(int degree) {
        if (degree < this.degCoeff.length) {
            return degCoeff[degree];
        } else {
            return 0;
        }
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial ans = new Polynomial();
        for (int i = 0; i < this.degCoeff.length; i++) {
            for (int j = 0; j < p.degCoeff.length; j += 1) {
                int termdeg = i + j;
                int termCoeff = this.degCoeff[i] * p.degCoeff[j];
                int oldCoeff = ans.getCoeff(termdeg);
                ans.setCoefficient(termdeg, termCoeff + oldCoeff);
            }
        }
        return ans;
    }

}

public class Solution {
    // test client

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for (int i = 0; i < n; i++) {
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for (int i = 0; i < n; i++) {
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for (int i = 0; i < n; i++) {
            first.setCoefficient(degree1[i], coeff1[i]);
        }
        n = s.nextInt();
        int degree2[] = new int[n];
        for (int i = 0; i < n; i++) {
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for (int i = 0; i < n; i++) {
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for (int i = 0; i < n; i++) {
            second.setCoefficient(degree2[i], coeff2[i]);
        }
        int choice = s.nextInt();
        Polynomial result;
        switch (choice) {
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2:
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3:
                result = first.multiply(second);
                result.print();
                break;

            case 4:
            System.out.println("true");
            break;
            
        }
    }

}
