package ASM_quan_ly_garage_xe;

import java.util.ArrayList;

public class GarageManage {

    // arrayList để lưu trữ xe
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    // phương thức thêm xe
    public static void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    // xoá xe theo id
    public static void removeVehicle(int id){
        for(Vehicle n : vehicles){
            if(n.getId() == id){
                vehicles.remove(n);
                break;
            }
        }
    }

    // hiển thị danh sách
    public static void displayVehicle(){
        for(Vehicle n : vehicles){
            if(Vehicle.getTotalVehicle() > 20){
                System.out.println("Gara lớn");
            } else {
                System.out.println("Gara nhỏ");
            }
        }
    }

    // tìm kiếm theo hãng xe
    public static void searchBrand(String search){
        boolean found = false;

        // dùng regex để tìm từ khoá tương đối
        String regex = "(?i).*" + search + ".*";

        for(Vehicle n : vehicles){
            if(n.getBrand().matches(regex)){
                System.out.println(n);
                found = true;
            }
        }

        if(!found){
            System.out.println("không tìm thấy hãng xe!");
        }
    }




}


