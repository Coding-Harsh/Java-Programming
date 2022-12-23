package object_oriented_programming.Inheritance.vehicle;

  public abstract class Vehicle {
    
   protected String color;
    private int maxspeed;

    public Vehicle(int maxspeed) {

        this.maxspeed = maxspeed;
        System.out.println("vehicle constructor");
    }

    public abstract boolean isMotorized();  // 🎄  it is a incomplete function to make it work 
                                           // in the subclass use abstract keyword 

/* it there is abstract function which is incomplete we have make its class also abstract */


  public abstract String getCompany();  // another abstract function


    public void set_maxspeed(int maxspeed){

        this.maxspeed = maxspeed;
    }

    public int get_maxspeed(){
        return maxspeed;
    }

    public final void print(){

        System.out.println("color : " + color);
        System.out.println("speed : " + maxspeed);
    }

}





