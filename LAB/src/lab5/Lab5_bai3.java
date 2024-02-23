package lab5;

import java.util.*;


class SanPham implements Comparator<SanPham>{
    private String ten;
    private double gia;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public SanPham(){
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }

    @Override
    public int compare(SanPham o1, SanPham o2) {
        return (int) ((int)o2.gia - o1.gia);
    }
}

public class Lab5_bai3 {

    static ArrayList<SanPham> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void nhap(){
        sc.nextLine();
        while(true){
            System.out.println("Nhập sản phẩm: ");
            SanPham sp = new SanPham();
            System.out.print("Tên: ");
            sp.setTen(sc.nextLine());
            System.out.print("Giá: ");
            sp.setGia(sc.nextDouble());
            sc.nextLine();
            list.add(sp);
            System.out.print("Nhập thêm (Y/N): ");
            if(sc.nextLine().equals("N")){
                break;
            }
        }
    }

    public static void xuat(String str){
        System.out.println("Danh sách sản phẩm" + str + ": ");
        for(SanPham x : list){
            System.out.println(x.toString());
        }
    }

    public static void sapXep(){
        list.sort(new SanPham());
        xuat(" sau khi sap xep giam dan");
    }

    public static void xoa(){
        sc.nextLine();
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenXoa = sc.nextLine();
        for(SanPham x : list){
            if(x.getTen().equalsIgnoreCase(tenXoa)){
                list.remove(x);
                break;
            }
        }
        xuat(" sau khi xoa \"" + tenXoa + "\"");
    }
    
    public static void trungBinh(){
        double s = 0;
        for(SanPham x : list){
            s+=x.getGia();
        }
        System.out.println("Trung bình giá của các sản phẩm: " + s/list.size());
    }

    public static void menu() {
        int chucNang;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm giần theo giá và xuất danh sách");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4. Xuất giá trung binh của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.println("+-----------------------------------+");
            System.out.print("Chọn chức năng: ");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    trungBinh();
                    break;
                case 5:
                    chucNang = 6;
                    break;
            }
        } while (chucNang >= 1 && chucNang <= 5);
    }

    public static void main(String[] args) {
        menu();
    }
}
