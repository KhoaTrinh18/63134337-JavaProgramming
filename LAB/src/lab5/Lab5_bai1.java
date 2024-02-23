package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        while(true){
            System.out.print("Nhập 1 số thực: ");
            Double x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.print("Nhập thêm (Y/N): ");
            if(sc.nextLine().equals("N")){
                break;
            }
        }
        System.out.print("Danh sách số thực: ");
        double s = 0;
        for (double x : list){
            s+=x;
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Tổng: " + s);
    }
}
