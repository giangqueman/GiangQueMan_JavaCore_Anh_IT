package buoi_5;

public class main {
    public static void main(String[] args){

        // tạo mới đối tượng học sinh
        HocSinh hs1 = new HocSinh();
        HocSinh hs2 = new HocSinh();
        HocSinh hs3 = new HocSinh();

        // gán giá trị cho đối tượng
        hs1.name = "Man";
        hs1.age = 28;
        hs1.grade = 12;

        hs2.name = "Lan";
        hs2.age = 18;
        hs2.grade = 10;

        hs3.name = "Hoa";
        hs3.age = 30;
        hs3.grade = 12;

        // gọi hành vi
        hs1.hocBai();
        hs2.hocBai();
        hs3.hocBai();

    }
}
