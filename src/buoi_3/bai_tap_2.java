package buoi_3;

public class bai_tap_2 {
    // Dùng while để in ra các số chẵn trong khoảng 2 → 200
    public static void main(String[] args){
        int i = 4;
        while(i < 200){
            if(i % 2 == 0){
                System.out.println("số sau đây là số chẵn: " + i);
            }
            i++;
        }
        //cach 2: khong dung if, i += 2; Tăng mỗi lần lên 2 đơn vị để luôn là số chẳn
    }
}
