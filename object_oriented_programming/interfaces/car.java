package object_oriented_programming.interfaces;

public class car extends Vehicle implements VehicleInterface , carInterface{
    
    @Override
    public void print() {
        super.print();
    }
    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public int get_maxspeed() {
        return super.get_maxspeed();
    }
}
