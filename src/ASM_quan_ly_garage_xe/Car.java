package ASM_quan_ly_garage_xe;

public class Car extends Vehicle {
    private int seatCount;

    public Car(String brand, String model, int year, double price, String color, String type, int seatCount) {
        super(brand, model, year, price, color, type);
        this.seatCount = seatCount;
    }

    //  Override phương thức applyDiscount() → giảm giá 15%
    @Override
    public void applyDiscount(double discount) {
        setPrice(getPrice() * 0.85);
    }

    // override toString for seatCount
    @Override
    public String toString(){
        return super.toString() + "Seats: " + seatCount;
    }


    // getter, setter
    public int getSeatCount(){
        return seatCount;
    }

    public void setSeatCount(int seatCount){
        this.seatCount = seatCount;
    }
}