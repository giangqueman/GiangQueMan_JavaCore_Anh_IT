package buoi_3;

public class bai_tap_8 {
    // Dùng for-each để tính tổng các số chẵn trong mảng.
    public static void main(String[] args) {
        // khai bao mang 1,2,3,4,5,6
        int[] numbers = {1,2,3,4,5,6};
        int sum = 0;

        for(int num : numbers){ //khai báo biến num duyệt qua từng phần tử của mảng
            if(num % 2 == 0){ //nếu là số chẵn thì cộng vào
                sum += num;
            }
        }
        System.out.println("tổng: " + sum);
    }
}
