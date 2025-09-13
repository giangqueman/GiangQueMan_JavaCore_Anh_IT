package buoi_2;

import java.util.Scanner;

public class bai_tap_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so dau tien: ");
        int n1 = input.nextInt();
        System.out.print("nhap so thu hai: ");
        int n2 = input.nextInt();
        System.out.print("nhap ky tu toan tu:  ");
        char match = input.next().charAt(0); // Lấy ký tự đầu tiên từ đầu vào

        switch (match) {
            case'+':
                System.out.print("kết quả: " + (n1 + n2));
                break;
            case'-':
                System.out.print("kết quả: " + (n1 - n2));
                break;
            case'*':
                System.out.print("kết quả: " + (n1 * n2));
                break;
            case'/':
                System.out.print("kết quả: " + (n1 / n2));
                break;
        }

    }
}
