package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phẩn tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập mảng: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int min = arr[0];
        for (int i : arr){
            if(i < min){
                min = i;
            }
        }
        System.out.println("Phần từ nhỏ nhất của mảng: " + min);
        int count = 0, sum = 0;
        for (int i : arr){
            if(i % 3 == 0){
                sum += i;
                count ++;
            }
        }
        System.out.println("Trung bình cộng các phẩn tử chia hết cho 3: " + (sum/count));
    }
}
