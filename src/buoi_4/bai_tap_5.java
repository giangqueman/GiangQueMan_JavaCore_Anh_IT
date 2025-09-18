package buoi_4;

import java.util.Scanner;
public class bai_tap_5 {
    public static void main(String[] args){

        //nhap so luong phan tu tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.print("hay nhap so luong phan tu: ");
        int n = input.nextInt();

        // khai bao mang
        int[] numbers = new int[n];

        // nhap so nguyen phan tu trong mang
        for(int i = 0; i < n; i++){
            System.out.print("nhap so nguyen thu " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // in ra mang
        System.out.print("mang vua tao: ");
        for(int i = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }

        // dao nguoc mang
        for(int i = 0; i < numbers.length/2; i++){ // numbers.length/2 để ra số lần lặp, hoán đổi từ 2 phía đầu, cuối của mảng
            int temp = numbers[i]; // khai báo biến tạm để lưu phần tử i
            numbers[i] = numbers[numbers.length - 1- i]; // vd i=0; numbers[4-1-0]= numbers[3];
            numbers[numbers.length -i - 1] = temp;
        }

        // in mang dao nguoc
        System.out.print("dao nguoc: ");
        for(int i : numbers){
            System.out.print(i + " ");
        }

    }
}
