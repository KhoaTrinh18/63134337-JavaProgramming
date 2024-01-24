package lab2;

import java.util.Scanner;

public class Lab2_bai4 {

    public static void giaiPTBac1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số phương trình bậc nhất ax + b = 0");
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) System.out.println("Phương trình vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        } else System.out.println("Phương trình có nghiệm: x = " + (-b / a));
    }

    public static void giaiPTBac2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số phương trình bậc hai ax^2 + bx + c = 0");
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();
        System.out.print("c: ");
        float c = scanner.nextFloat();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("Phương trình vô số nghiệm");
                else System.out.println("Phương trình vô nghiệm");
            } else System.out.println("Phương trình có nghiệm: x = " + (-c / b));
        } else {
            if (delta < 0) System.out.println("Phương trình vô nghiệm");
            else if (delta == 0) System.out.println("Phương trình có nghiệm kép: x = " + (-b / 2 * a));
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 ngiệm:\nx1 = " + x1 + "\nx2 = " + x2);
            }
        }
    }

    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng của tháng: ");
        int soDien = scanner.nextInt();
        int tien;
        if (soDien < 50) tien = soDien * 1000;
        else tien = 50 * 1000 + (soDien - 50) * 1200;
        System.out.println("Số tiền điện phải trả: " + tien);
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int chucNang;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+-----------------------------------+");
            System.out.print("Chọn chức năng: ");
            chucNang = scanner.nextInt();
            switch (chucNang) {
                case 1:
                    giaiPTBac1();
                    break;
                case 2:
                    giaiPTBac2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    chucNang = 5;
                    break;
            }
        } while (chucNang >= 1 && chucNang <= 4);
    }

    public static void main(String[] args) {
        menu();
    }
}
