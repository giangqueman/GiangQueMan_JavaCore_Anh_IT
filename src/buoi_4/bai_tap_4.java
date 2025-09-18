package buoi_4;

public class bai_tap_4 {
    public static void main(String[] args){

        // khai báo mảng
        int[] numbers = {2,5,7,8,10,13};

        // biến đếm số chẵn và lẻ
        int soChan = 0;
        int soLe = 0;

        // biến i duyệt trong mảng
        for(int i : numbers){
            if(i % 2 == 0){
                soChan++;
            } else{
                soLe++;
            }
        }

        // in
        System.out.println("có " + soChan + " số chẵn trong mảng");
        System.out.println("có " + soLe + " số lẻ trong mảng");
    }
}
