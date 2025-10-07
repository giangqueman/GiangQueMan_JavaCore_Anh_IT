package ASM_quan_ly_garage_xe;

public class Car extends Vehicle {
    private int seatCount;

    public Car(String brand, String model, int year, double price, String color, String type, int seatCount) {
        super(brand, model, year, price, color, type);
        this.seatCount = seatCount;
    }

    @Override
    public void applyDiscount(){
        setPrice(getPrice() * 0.85);
    }

}
