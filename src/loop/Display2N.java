package loop;

import java.util.Scanner;

public class Display2N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n >= 2: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
