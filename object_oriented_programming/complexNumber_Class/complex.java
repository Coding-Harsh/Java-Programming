package object_oriented_programming.complexNumber_Class;

public class complex {
    
    private int real;
    private int imaginary;

    public complex(int real, int imaginary){
       this.real = real;
       this.imaginary = imaginary;

    }
    public int get_real(){
        return real;
    }
    public int get_imaginary(){
        return imaginary;
    }

    public void set_imaginary(int imaginary){
        this.imaginary = imaginary;
    }
    public void set_real(int real){
        this.real = real;
    }
    
    public void print(){
        System.out.println(real+" + "+imaginary+"i");
    }

    public void add(complex c2){
        this.real = this.real+ c2.real;
        this .imaginary = this.imaginary + c2.imaginary;
    }
 
    public void multiply(complex c){

        this.real = (this.real*c.real) - (this.imaginary * c.imaginary);
        this.imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
    }
    
    
}

