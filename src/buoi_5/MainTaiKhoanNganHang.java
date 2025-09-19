package buoi_5;

public class MainTaiKhoanNganHang {
    public static void main(String[] args){

        // tao moi tai khoan
        taiKhoanNganHang account1 = new taiKhoanNganHang(1234,555.1);
        taiKhoanNganHang account2 = new taiKhoanNganHang(5678, 6000.20);

        // gọi hành vi
        account1.napTien(500);
        account2.rutTien(400.20);
        account1.xemSoDu();
        account2.xemSoDu();

    }
}
