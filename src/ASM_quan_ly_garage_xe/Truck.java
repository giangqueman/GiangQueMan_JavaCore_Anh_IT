package ASM_quan_ly_garage_xe;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand, String model, int year, double price, String color, String type, double loadCapacity) {
        super(brand, model, year, price, color,type);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void applyDiscount(){
        setPrice(getPrice() * 0.8);
    }
}
