package lab4;

public class MainSanPham {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Fruit", 12000, 1000);
        SanPham sp2 = new SanPham("Clothes", 30000);
        sp1.xuat();
        sp2.xuat();
    }
}
