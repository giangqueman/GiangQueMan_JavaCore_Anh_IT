package buoi_2;

import java.util.Scanner;

public class bai_tap_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("hãy nhập một số nguyên: ");
        int n = input.nextInt();

        if (n > 0){
            System.out.println("số dương");
        } else if (n < 0){
            System.out.println("số âm");
        } else {
            System.out.println("bằng 0");
        }
    }
}
