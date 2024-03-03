package lab1;

import java.util.Scanner;

public class Lab1_bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số sủa pt bậc 2: ");
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();
        System.out.print("c: ");
        float c = scanner.nextFloat();
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.print("Delta: " + delta + ", Căn delta: " + Math.sqrt(delta));
    }
}
