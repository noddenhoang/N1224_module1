package loop;

import java.util.Scanner;

public class PrintStarImage1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh: ");
        int n = sc.nextInt();
        System.out.println("Hình a.");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Hình b.");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (i == 1 || i == n || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
