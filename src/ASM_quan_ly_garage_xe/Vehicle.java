package ASM_quan_ly_garage_xe;

abstract class Vehicle {
    private static int autoIncrementId = 1;
    private static int totalVehicle = 0;
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private String type;

    // constructor
    public Vehicle(String brand, String model, int year, double price, String color, String type) {
        this.id = autoIncrementId++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
        totalVehicle++;

    }

    // getter, setter

    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
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

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public static int getTotalVehicle(){
        return totalVehicle;
    }

    public static void decreaseTotalVehicles() {
        if (totalVehicle > 0) totalVehicle--;
    }

    // phương thức
    public void displayInfo(){
        System.out.println("ID: " + id + " | Brand: " + brand + " | Model: " + model + " | Year: " + year + " | Price: " + price + " | Color: " + color + " | Type: " + type);
    }

    public abstract void applyDiscount();

}
