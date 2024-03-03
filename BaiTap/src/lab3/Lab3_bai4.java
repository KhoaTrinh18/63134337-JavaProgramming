package lab3;

import java.util.Scanner;

public class Lab3_bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arrName = new String[n];
        float[] arrScore = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i+1) + ":");
            System.out.print("Tên: ");
            arrName[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            arrScore[i] = scanner.nextFloat();
            scanner.nextLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrScore[j] < arrScore[i]) {
                    float tempScore = arrScore[i];
                    arrScore[i] = arrScore[j];
                    arrScore[j] = tempScore;
                    String tempName = arrName[i];
                    arrName[i] = arrName[j];
                    arrName[j] = tempName;
                }
            }
        }
        System.out.println();
        System.out.println("Danh sách sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i+1) + ":");
            System.out.println("Tên: " + arrName[i]);
            System.out.println("Điểm: " + arrScore[i]);
            System.out.print("Học lực: ");
            if (arrScore[i] < 5) {
                System.out.println("Yếu");
            } else if (arrScore[i] < 6.5) {
                System.out.println("Trung bình");
            } else if (arrScore[i] < 7.5) {
                System.out.println("Khá");
            } else if (arrScore[i] < 9) {
                System.out.println("Giỏi");
            } else {
                System.out.println("Xuất sắc");
            }
            System.out.println();
        }
    }
}
