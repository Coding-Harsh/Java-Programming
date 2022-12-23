package object_oriented_programming.Inheritance.vehicle.vehicle_temp;

import object_oriented_programming.Inheritance.vehicle.Vehicle;

public abstract class  Truck extends Vehicle {
    
int maxLoading_capacity;

public Truck(int maxspeed){
    super(maxspeed);
}

public void printTruck(){
    System.out.println("truck capacity : " + maxLoading_capacity);
    System.out.println("truck color : " +  color);
    System.out.println("truck speed : " + get_maxspeed());
}
}
