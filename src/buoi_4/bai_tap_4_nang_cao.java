package buoi_4;

import java.util.Scanner;
public class bai_tap_4_nang_cao {
    public static void main(String[] args){

        // khai báo mảng nhập từ bàn phím
        // số lượng phần từ trong mảng
        Scanner input = new Scanner(System.in);
        System.out.print("số lượng phần từ trong mảng: ");
        int n = input.nextInt();

        // kiểm tra n là số dương
        if(n < 0){
            System.out.print("vui lòng nhập số dương!");
            return;
        }

        // khai báo mảng
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("nhập số nguyên thứ " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        // in ra mảng
        System.out.print("mảng vừa tạo: ");
        for(int i = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }

        // biến đếm số chẵn và
        int soChan = 0;
        int soLe = 0;

        for(int i : numbers){
            if(i % 2 == 0){
                soChan++;
            } else{
                soLe++;
            }
        }

        // in
        System.out.println("có " + soChan + " số chẵn trong mảng vừa tạo");
        System.out.println("có " + soLe + " số lẻ trong mảng vừa tạo");
    }
}
