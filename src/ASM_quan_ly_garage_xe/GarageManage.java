package ASM_quan_ly_garage_xe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GarageManage {
    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("===== QUẢN LÝ GARA XE =====");
            System.out.println("1. Thêm xe mới");
            System.out.println("2. Xóa xe theo ID");
            System.out.println("3. Hiển thị danh sách xe");
            System.out.println("4. Tìm kiếm xe theo hãng");
            System.out.println("5. Sắp xếp xe theo giá tăng dần");
            System.out.println("6. Sắp xếp xe theo năm sản xuất giảm dần");
            System.out.println("0. Thoát");
            System.out.println("===========================");
            System.out.print("Nhập lựa chọn: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    removeVehicle();
                    break;
                case 3:
                    showAllVehicles();
                    break;
                case 4:
                    searchBrand();
                    break;
                case 5:
                    sortByPriceAsc();
                    break;
                case 6:
                    sortByYearDesc();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }

    // thêm xe
    public static void addVehicle(){
        System.out.println("Chọn loại xe: 1.Car 2.Truck");
        int typeChoice = input.nextInt();
        input.nextLine();

        if (typeChoice == 1){ // car
            System.out.println("Bạn chọn Car");
            System.out.print("Brand: ");
            String brand = input.nextLine();

            System.out.print("Model: ");
            String model = input.nextLine();

            System.out.print("Year: ");
            int year = input.nextInt();

            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();

            System.out.print("Color: ");
            String color = input.nextLine();

            System.out.print("Seats: ");
            int seatCount = input.nextInt();
            input.nextLine();

            System.out.print("Type: ");
            String type = input.nextLine();

            Vehicle car = new Car(brand, model, year, price, color, type, seatCount);
            vehicles.add(car);

            System.out.println("Đã thêm xe thành công với ID: " + car.getId() );

            System.out.println("Số xe trong danh sách (ArrayList): " + vehicles.size());
            System.out.println("Tổng số xe (static trong Vehicle): " + Vehicle.getTotalVehicle());

        } else if (typeChoice == 2){ // truck
            System.out.println("Bạn chọn Truck");
            System.out.print("Brand: ");
            String brand = input.nextLine();

            System.out.print("Model: ");
            String model = input.nextLine();

            System.out.print("Year: ");
            int year = input.nextInt();

            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();

            System.out.print("Color: ");
            String color = input.nextLine();

            System.out.print("Load Capacity: ");
            double loadCapacity = input.nextDouble();
            input.nextLine();

            System.out.print("Type: ");
            String type = input.nextLine();

            Vehicle truck = new Truck(brand, model, year, price, color,type, loadCapacity);
            vehicles.add(truck);

            System.out.println("Đã thêm xe thành công với ID: " + truck.getId() );


        }
    }

    // xoá xe theo ID
    public static void removeVehicle(){
        System.out.print("Nhập ID xe cần xoá: ");
        int id = input.nextInt();
        input.nextLine();

         boolean found = false;

         for (Vehicle v : vehicles){
             if (v.getId() == id){
                 vehicles.remove(v);
                 Vehicle.decreaseTotalVehicles();
                 System.out.println("Đã xóa xe có ID: " + id);
                 found = true;
                 break;
             }
         }

         if (!found){
             System.out.println("Không tìm thấy ID xe!");
         }
    }

    // tìm kiếm xe theo hãng
    public static void searchBrand(){
        System.out.print("Nhập hãng xe cần tìm: ");
        String keyword = input.nextLine().trim().toLowerCase();

        boolean found = false;

        for (Vehicle a : vehicles){
            if(a.getBrand().toLowerCase().contains(keyword)){
                found = true;
                a.displayInfo();
            }
        }
        if (!found){
            System.out.println("Không tìm thấy hãng xe " + keyword);
        }
    }

    // Sắp xếp xe theo giá tăng dần
    public static void sortByPriceAsc(){
        if (vehicles.isEmpty()){
            System.out.println("Danh sách xe !");
        }

        Collections.sort(vehicles, Comparator.comparingDouble((Vehicle :: getPrice)));

        System.out.println("Sắp xếp theo giá tăng dần: ");
        for (Vehicle v : vehicles){
            v.displayInfo();
        }
    }

    // sắp xếp theo năm giảm dần
    public static void sortByYearDesc(){
        if (vehicles.isEmpty()){
            System.out.println("Danh sách xe trống!");
        }

        Collections.sort(vehicles, Comparator.comparingInt(Vehicle :: getYear).reversed());

        System.out.println("Sắp xếp theo năm giảm dần: ");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }


    // hiển thị danh sách xe
    public static void showAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("Không có xe trong danh sách!");
            return;
        }

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }

        // Hiển thị tổng số xe
        int total = Vehicle.getTotalVehicle();
        System.out.println("Tổng số xe hiện tại: " + total);

        // Phân loại gara
        if (total > 20) {
            System.out.println("→ Gara lớn");
        } else {
            System.out.println("→ Gara nhỏ");
        }
    }

}


