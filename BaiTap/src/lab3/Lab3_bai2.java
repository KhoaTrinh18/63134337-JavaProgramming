package lab3;

public class Lab3_bai2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 9 ; j++) {
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
