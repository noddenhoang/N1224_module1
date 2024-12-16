package loop;

import java.util.Scanner;

public class AlternatingPowerOfTwoPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = sc.nextInt();
        int power = 1;
        for (int i = 1; i < n; i++) {
            if (i == power){
                power = power * 2 + 1;
                if (i % 3 == 0) {
                    System.out.print(-i + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
