package lab3;

import java.util.Scanner;

public class Lab3_bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = scanner.nextInt();
        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Đây là số nguyên tố!");
        }else{
            System.out.println("Đây không phải là số nguyên tố!");
        }
    }
}
