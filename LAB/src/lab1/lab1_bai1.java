package lab1;

import java.util.Scanner;

public class lab1_bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("Họ và tên: %s, Điểm TB: %.2f", hoTen, diemTB);
	}
	
}
