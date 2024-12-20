package method;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        System.out.println("S = 1 + 2 + ... + n = " + sumN(n));
        System.out.println("S = 1^2 + 2^2 + ... + n^2 = " + sumNSquare(n));
        System.out.println("S = 1 + 1/2 + ... + 1/n = " + sumN3(n));
        System.out.println("S = 1 * 2 * ... * n = " + productN(n));
        System.out.println("S = 1! + 2! + ... + n! = " + sumN4(n));
    }

    public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumNSquare(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static double sumN3(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static int productN(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }
    public static int sumN4(int n) {
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        return sum;
    }
}
