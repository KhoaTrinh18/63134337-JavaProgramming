package lab2;

import java.util.Scanner;

public class Lab2_bai2 {
    public static void main(String[] args) {
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
}
