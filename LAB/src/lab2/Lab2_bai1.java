package lab2;

import java.util.Scanner;

public class Lab2_bai1 {
    public static void main(String[] args) {
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
}
