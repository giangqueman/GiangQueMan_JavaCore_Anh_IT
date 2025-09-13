package buoi_3;

import java.util.Scanner;

public class bai_tap_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so nguyen: ");
        int n = input.nextInt();

        int giaiThua = 1;
        for(int i = 1; i <= n; i++){
            giaiThua *= i;
        }
        System.out.println("giai thừa của " + n + " là: " + giaiThua);


    }
}