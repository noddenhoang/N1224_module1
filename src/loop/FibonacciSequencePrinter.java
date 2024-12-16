package loop;

import java.util.Scanner;

public class FibonacciSequencePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input n
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int f1 = 0, f2 = 1, fn = 1;
        //Display fibonacci sequence
        System.out.print("Dãy fibonacci: ");
        while (fn <= n) {
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
