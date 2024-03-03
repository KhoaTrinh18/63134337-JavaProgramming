package lab4;

import java.util.Scanner;

public class SanPham {
    private String ten;
    private double donGia, giamGia;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(String ten, double donGia, double giamGia){
        this.ten = ten;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String ten, double donGia){
        this(ten, donGia, 0);
    }

    private double getThueNhapKhau(){
        return donGia * 0.1;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp sản phẩm: ");
        System.out.print("Tên: ");
        ten = sc.nextLine();
        System.out.print("Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Giảm giá: ");
        giamGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println();
        System.out.println("Tên sản phẩm: " + ten);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
}
