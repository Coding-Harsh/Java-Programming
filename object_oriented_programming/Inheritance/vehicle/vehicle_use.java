package object_oriented_programming.Inheritance.vehicle;

public class vehicle_use {
    public static void main(String[] args) {
        
/* Vehicle v = new Vehicle();   now here since our class is abstract [which is incomplete]
                                we cannot make its object because of incompleteness */



    //   Vehicle v = new car(100);  

      car c = new BMW();
        
        
        // v.color = "black";
        // v.set_maxspeed(100);
        // v.print();

        car c1 = new BMW() ;  /* 🎉 when the child class object is called its parent class object 
                             is created as well [this concept is polymorphism] */

                             

        c.color = "Red";
        c.numGears = 10;
        c.print();
        

    }
}
