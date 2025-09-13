package buoi_2;

import java.util.Scanner;

public class bai_tap_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("hãy nhập một số nguyên: ");
        int n = input.nextInt();

        if (n % 2 == 0){
            System.out.println("đây là số chẵn");
        } else {
            System.out.println("đây là số lẻ");
        }

    }
}
