package lab1;

import java.util.Scanner;

public class Lab1_bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh của hình lập phương: ");
        System.out.print("Cạnh: ");
        float canh = scanner.nextFloat();
        System.out.print("Thể tích của hình lập phương: " + Math.pow(canh, 3));
    }
}
