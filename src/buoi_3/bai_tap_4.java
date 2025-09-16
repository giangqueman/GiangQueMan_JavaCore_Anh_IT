package buoi_3;

import java.util.Scanner;

    public class bai_tap_4 {
    // Nhập vào số nguyên n. Dùng for để tính n! (giai thừa của n).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Nhập số nguyên từ bàn phím:
        System.out.print("nhap so nguyen: ");
        int n = input.nextInt();

        long giaiThua = 1;
        // tính giai thừa bằng for
        for(int i = 1; i <= n; i++){
            giaiThua *= i;
        }

        // in kết quả
        System.out.println("giai thừa của " + n + " là: " + giaiThua);
        input.close();
    }

}