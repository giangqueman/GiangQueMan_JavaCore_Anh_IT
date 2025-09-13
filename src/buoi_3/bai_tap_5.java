package buoi_3;

import java.util.Scanner;

public class bai_tap_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số nguyên: ");
        int n = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int a = n * i;
            System.out.println("bảng cửu chương " + n + ":" + n + "x" + i + "=" + a);

        }
    }
}
