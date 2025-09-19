package buoi_5;

// lớp cha
public class Nguoi {

    // tạo thuộc tính: tên, tuổi
    String name;
    int age;

    // gan gia tri
    public Nguoi(String name, int age){
        this.name = name;
        this.age = age;
    }

    //phương thức
    void gioiThieu(){
        System.out.println("my name is " + name + "," + age + " years old");
    }
}
