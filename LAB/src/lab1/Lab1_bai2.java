package lab1;

import java.util.Scanner;

public class Lab1_bai2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật:");
		System.out.print("Chiều dài: ");
		float chieuDai = scanner.nextFloat();
		System.out.print("Chiều rộng: ");
		float chieuRong = scanner.nextFloat();
		float chuvi = (chieuDai + chieuRong) * 2;
		float dienTich = chieuDai * chieuRong;
		System.out.printf("Diện tích: %.2f, Chu vi: %.2f, Cạnh nhỏ: %.2f", dienTich, chuvi, Math.min(chieuRong, chieuDai));
	}
	
}
