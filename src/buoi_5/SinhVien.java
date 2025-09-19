package buoi_5;
// lớp con kế thừa từ lớp cha
public class SinhVien extends Nguoi{
        int maSV;

        public SinhVien(String name, int age, int maSV){
            super(name, age);
            this.maSV = maSV;
        }

        void hocTap(){
            System.out.println("I like Math");
        }
}
