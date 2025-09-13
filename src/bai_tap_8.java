public class bai_tap_8 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int sum = numbers[0];

        for(int num : numbers){
            sum += num;
        }
        System.out.println("tổng: " + sum);
    }
}
