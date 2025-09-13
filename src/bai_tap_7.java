public class bai_tap_7 {
    public static void main(String[] args) {
        int[] numbers ={3,7,2,9,5};
        int max = numbers[0];

        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("số lớn nhất trong mảng là: " + max);
    }
}
