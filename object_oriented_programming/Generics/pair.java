package object_oriented_programming.Generics;

public class pair <T , V>{

   private T firstNumber;
   private  V secondNumber;

    public pair(T firstNumber, V secondNumber){

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void set_firstnumber(T firstNumber){

        this.firstNumber = firstNumber;
    }

    public T get_firstnumber(){
        return firstNumber;
    }

    public void set_secondnumber(V secondNumber){
        this.secondNumber = secondNumber;
    }
    
    public V get_secondnumber(){
        return secondNumber;
    }


    
}
