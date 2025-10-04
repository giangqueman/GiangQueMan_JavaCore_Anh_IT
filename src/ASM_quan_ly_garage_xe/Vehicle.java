package ASM_quan_ly_garage_xe;
public class Vehicle{

    private static int autoIncrementId = 0;
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private String type;
    private static int totalVehicle;

    // phương thức
    public Vehicle(String brand, String model, int year, double price, String color, String type){
        this.id = autoIncrementId++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
        this.totalVehicle++;
    }

    //phương thức discount
    public void applyDiscount(double discount){
        price = price - (price * discount);
    }

    // phương thức toString
    public String toString(){
        return "Brand: " + brand + "Model: " + model + "Year: " + year + "Price: " + price + "Color: " + color;
    }

    //getter và setter
    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(String model){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public static int getTotalVehicle(){
        return totalVehicle;
    }
}