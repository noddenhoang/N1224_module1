package loop;

import java.util.Scanner;

public class SumSCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.println("S = " + sum);
    }
}
