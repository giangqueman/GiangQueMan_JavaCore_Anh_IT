package buoi_2;

import java.util.Scanner;

public class bai_tap_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("hãy nhập điểm: ");
        double grade = input.nextDouble();

        if (grade < 0 || grade > 100){
            System.out.println("nhập điểm từ 0 đến 100");
        } else if (grade >= 85){
            System.out.println("Giỏi");
        } else if (grade >= 65){
            System.out.println("Khá");
        } else if (grade >= 50){
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
}
