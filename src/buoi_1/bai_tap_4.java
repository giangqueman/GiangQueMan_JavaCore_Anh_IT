package buoi_1;

import java.util.Scanner;

public class bai_tap_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so nguyen: ");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }

    }
}
