import java.util.Scanner;

public class bai_tap_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số để chọn món: ");
        int order = input.nextInt();

        switch (order){
            case 1:
                System.out.println("cà phê");
                break;
            case 2:
                System.out.println("trà sữa");
                break;
            case 3:
                System.out.println("nước lọc");
                break;
            default:
                System.out.println("không có trong menu");
        }
    }
}
