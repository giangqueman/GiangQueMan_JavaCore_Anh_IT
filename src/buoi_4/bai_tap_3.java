package buoi_4;

import java.util.Scanner;
public class bai_tap_3 {
    public static void main(String[] args){

        // nhập số lượng phần tử trong mảng
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số lượng phần tử của mảng: ");
        int n = input.nextInt();

        // kiểm tra n là số nguyên dương
        if(n < 0){
            System.out.print("vui lòng nhập số nguyên dương");
            return;
        }

        // khai báo mảng
        int[] numbers = new int[n];

        // nhập số phần tử từ bản phím
        for(int i = 0; i < n; i++){
            System.out.print("phần tử thứ " + (i + 1) + " là: ");
            numbers[i] = input.nextInt();
        }

        // in mảng đã nhập
        System.out.print("mảng vừa tạo: ");
        for(int i = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }

        //tìm số lớn nhất trong mảng
        int max = numbers[0];
        for(int i = 0; i < n; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        // in so max
        System.out.println("số lớn nhất trong mảng là: " + max);
    }
}
