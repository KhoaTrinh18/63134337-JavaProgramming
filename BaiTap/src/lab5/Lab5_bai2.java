package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5_bai2 {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void nhap(){
        sc.nextLine();
        while(true){
            System.out.print("Nhập họ và tên: ");
            String x = sc.nextLine();
            list.add(x);
            System.out.print("Nhập thêm (Y/N): ");
            if(sc.nextLine().equals("N")){
                break;
            }
        }
    }

    public static void xuat(String str){
        System.out.println("Danh sách họ và tên" + str + ": ");
        for(String x : list){
            System.out.println(x);
        }
    }

    public static void ngauNhien(){
        Collections.shuffle(list);
        xuat(" ngẫu nhiên");
    }

    public static void sapXep(){
        Collections.sort(list);
        Collections.reverse(list);
        xuat(" sau khi sắp xếp giảm dần");
    }

    public static void xoa(){
        sc.nextLine();
        System.out.print("Nhập họ và tên cần xóa: ");
        String tenXoa = sc.nextLine();
        for(String x : list)
            if (tenXoa.equalsIgnoreCase(x)) {
                list.remove(x);
                break;
            }
        xuat(" sau khi xóa \"" + tenXoa + "\"");
    }

    public static void menu() {
        int chucNang;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách họ và tên");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm giần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.println("+-----------------------------------+");
            System.out.print("Chọn chức năng: ");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat("");
                    break;
                case 3:
                    ngauNhien();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    chucNang = 7;
                    break;
            }
        } while (chucNang >= 1 && chucNang <= 6);
    }

    public static void main(String[] args) {
        menu();
    }
}
