package buoi_2;

import java.util.Scanner;

public class bai_tap_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so thang: ");
        int month = input.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("mua xuan");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("mua ha");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("mua thu");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("mua dong");

        }
    }
}
