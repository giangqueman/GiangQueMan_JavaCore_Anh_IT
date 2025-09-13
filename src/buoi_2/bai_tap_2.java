package buoi_2;

import java.util.Scanner;

public class bai_tap_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("nhập tuổi của bạn: ");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("Đủ điều kiện lái xe");
        } else{
            System.out.println("Chưa đủ điều kiện");
        }

    }

}
