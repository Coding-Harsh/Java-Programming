package object_oriented_programming.Inheritance.vehicle;

public  abstract class car extends Vehicle {
    /* Here car is the subclass || child class ||  base class
       and Vehicle represents  parent class || super class || base class
     */
int numGears;
boolean isConvertible;

public car(){
    super(200);
}

public car(int numGears){
    super(100);

    this . numGears = numGears;
    System.out.println("car constructor");
}

@Override
public boolean isMotorized() {
    
    return false;
}




public void printcar(){
     
      super.print(); /* 🎇 using super keyword we can access all the members 
                       and fuctions of the parent class */ 

    // System.out.println("color : " + color);
    // System.out.println("speed: "+ get_maxspeed());

    System.out.println("No.of.gears : " + numGears);
    System.out.println("isConvertible : " + isConvertible);

}

}
