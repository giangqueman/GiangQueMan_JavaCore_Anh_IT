package ASM_quan_ly_garage_xe;

public class Truck extends Vehicle{
    private double loadCapacity;

    // constructor
    public Truck(String brand, String model, int year, double price, String color, String type, double loadCapacity){
        super(brand, model, year, price, color, type);
        this.loadCapacity = loadCapacity;
    }

    // override applyDiscount to 20%
    @Override
    public void applyDiscount(double discount){
        setPrice(getPrice() * 0.8);
    }

    // override toString for loadCapacity
    @Override
    public String toString(){
        return super.toString() + "Load Capacity: " + loadCapacity;
    }


}
