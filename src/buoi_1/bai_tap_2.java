package buoi_1;

public class bai_tap_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Hoán đổi không dùng biến trung gian
        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }
}
