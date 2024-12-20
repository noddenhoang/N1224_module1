package method;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        fibo(n);
    }
    public static void fibo(int n) {
        int f1 = 0, f2 = 1, fn = 1;
        while (fn <= n) {
            System.out.print(fn + " ");
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
    }
}
