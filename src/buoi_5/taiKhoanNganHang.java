package buoi_5;

public class taiKhoanNganHang {

          // thuộc tính private: số tài khoản, số dư
        private int accountNumber;
        private double balance;

        // gán giá trị
    public taiKhoanNganHang(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

        // phương thức nạp tiền
    public void napTien(double soTien){
        balance += soTien;
    }

    // phương thức rút tiền
    public void rutTien(double soTien){
        balance -= soTien;
    }

    // phương thức xem số dư
    public void xemSoDu(){
        System.out.println("số dư tài khoản: " + accountNumber);
        System.out.println(balance);
    }
}
