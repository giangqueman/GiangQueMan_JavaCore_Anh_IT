import java.util.Scanner;

public class bai_tap_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap tuoi: ");
        int age = input.nextInt();

        if (age < 12){
            System.out.println("gia ve 20,000đ");
        } else if (age >= 12  && age <= 17){
            System.out.println("gia ve 40,000đ");
        } else {
            System.out.println("gia ve 60,000đ");
        }
    }

}
