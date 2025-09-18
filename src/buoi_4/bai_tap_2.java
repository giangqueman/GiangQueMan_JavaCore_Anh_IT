package buoi_4;

public class bai_tap_2 {
    public static void main(String[] args){

        // khai báo mảng gồm 1,2,3,4,5
        int[] arr = {1,2,3,4,5};

        // khai báo biến sum để cộng lần lượt các phần tử trong mảng vào
        int sum  = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.print("tổng mảng là: " + sum);
    }
}
