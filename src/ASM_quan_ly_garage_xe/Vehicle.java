package ASM_quan_ly_garage_xe;
public class Vehicle{

    private static int autoIncrementId = 0;
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    String color;
    String type;

    // gán giá trị
    public Vehicle(int id, String brand, String model, int year, double price, String color, String type){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }

}
