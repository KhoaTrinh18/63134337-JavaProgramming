package lab1;

import java.util.Scanner;

public class lab1_bai2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật:");
		System.out.print("Chiều dài: ");
		float chieudai = scanner.nextFloat();
		System.out.print("Chiều rộng: ");
		float chieurong = scanner.nextFloat();
		float chuvi = (chieudai + chieurong) * 2;
		float dientich = chieudai * chieurong;
		System.out.printf("Diện tích: %.2f, Chu vi: %.2f, Cạnh nhỏ: %.2f", dientich, chuvi, Math.min(chieurong, chieudai));
	}
	
}
