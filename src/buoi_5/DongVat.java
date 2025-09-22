package buoi_5;

public class DongVat {
    void keu(){
        System.out.println("kêu");
    }
}

class Cho extends DongVat{
    void keu(){
        System.out.println("Gâu gâu");
    }
}

class Meo extends DongVat{
    void keu(){
        System.out.println("Meo Meo");
    }
}
