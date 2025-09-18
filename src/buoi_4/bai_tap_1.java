package buoi_4;
import java.util.Scanner;
public class bai_tap_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // nhập số lượng phần tử của mảng từ bàn phím
        System.out.print("nhập số lượng phần tử của mảng: ");
        int n = input.nextInt();

        // khai báo mảng
        int[] numbers = new int[n];

        // nhập số nguyên
        for(int i = 0; i < n; i++){
            System.out.print("nhập số nguyên thứ " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        // in các phần tử trong mảng
        System.out.println("các phần tử đã lưu: ");
        for(int i  = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }
        input.close();
    }
}




